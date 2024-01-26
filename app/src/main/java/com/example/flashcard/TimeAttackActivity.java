package com.example.flashcard;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.Item;
import com.example.flashcard.models.TimeAttackGame;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TimeAttackActivity extends AppCompatActivity {

    public final int timerLimit = 45;
    public int roundTime = 0;
    public int totalSeconds = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);

        ArrayList<Item> items = new ArrayList<>();

        // Get list of all items
        Field[] drawables = R.drawable.class.getFields();
        for (Field field : drawables) {
            try {
                String resourceName = field.getName();

                // Check if the resource name starts with "question_item"
                if (resourceName.startsWith("question_item")) {
                    int resourceId = field.getInt(null);
                    String itemName = resourceName.substring("question_item_".length());
                    items.add(new Item(resourceId, itemName));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Add items to recycler view
        RecyclerView recyclerView = findViewById(R.id.itemListRecyclerView);
        ItemAdapter adapter = new ItemAdapter(items);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        bind();
        initGame();

    }

    private void playRound(TimeAttackGame game){
        roundTime = 0;
        ArrayList<Craft>craftList = game.getCrafts();
        int totalCrafts = craftList.size();
        int round = game.getCurrentCraftIndex();

        // To not surpass total crafts number
        if(round < totalCrafts){
            Craft craft = craftList.get(round);
            TextView itemCraftedTextView = findViewById(R.id.itemCraftedTextView);
            itemCraftedTextView.setText(craft.getCraftedItemName());

            ImageView itemCraftedImageView = findViewById(R.id.itemCraftedImageView);
            itemCraftedImageView.setImageResource(craft.getCraftedItemImage());

            TextView currentCraftTextView = findViewById(R.id.currentCraftTextView);
            currentCraftTextView.setText("Craft : " + (round+1));

            TextView totalCraftTextView = findViewById(R.id.totalCraftTextView);
            totalCraftTextView.setText(" / " + totalCrafts);

            Button validateCraftButton = findViewById(R.id.validateCraftButton);
            TextView timerTextView = findViewById(R.id.timerTextView);

            CountDownTimer countDownTimer = new CountDownTimer(timerLimit*1000, 1000) {
               // Add one second to timer info
                public void onTick(long millisUntilFinished) {
                    timerTextView.setText(millisUntilFinished /1000 + "s");
                    roundTime ++;
                }

                // When timer is 0s
                public void onFinish() {
                    timerTextView.setText("Temps écoulé !");
                    Intent intent = new Intent(TimeAttackActivity.this, TimeAttackLoseActivity.class);
                    startActivity(intent);
                }
            };

            countDownTimer.start();

            validateCraftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean craftMatch = checkCraft(craft, countDownTimer);
                    // If it's the good craft play next craft
                    if(craftMatch){
                        totalSeconds += roundTime;
                        game.setCurrentCraftIndex(round+1);
                        resetGrid();
                        playRound(game);
                    }
                }
            });
        }
        // When all crafts are correct : game win
        else {
            Intent intent = new Intent(TimeAttackActivity.this, TimeAttackScores.class);
            intent.putExtra("totalTimeCraft", totalSeconds);
            intent.putExtra("averageTimeCraft", totalSeconds / 5);
            startActivity(intent);
        }

    }

    /**
     * Reset grid : set empty image and empty tag on each slot
     */
    private void resetGrid() {
        for (int i = 0; i < 9; i++) {
            int resourceId = getResources().getIdentifier("craftingSlotImage" + i, "id", getPackageName());
            ImageView slot = findViewById(resourceId);
            slot.setImageResource(R.drawable.crafting_table_slot);
            slot.setTag("empty");
        }
    }


    /**
     * Start the game
     */
    private void initGame(){
        Intent srcIntent = getIntent();
        TimeAttackGame game = srcIntent.getParcelableExtra("game");
        ArrayList<Craft> craftsList = game.getCrafts();

//        int currentCraftIndex = game.getCurrentCraftIndex();
//        Craft currentCraft = craftsList.get(currentCraftIndex);
        playRound(game);
    }

    /**
     * Check if the craft in the crafting table is the craft of the wanted item
     * @param listGoodCrafts : List of all good variants of a craft
     * @param timer : timer of the game
     * @return Boolean : If the craft is good
     */
    private boolean checkCraft(Craft listGoodCrafts, CountDownTimer timer) {

        boolean craftIsGood = false;
        //Check for each variant
        for(int indexCraft=0; indexCraft < listGoodCrafts.getCraft().size(); indexCraft++){
            boolean craftMatch = true;
            // Check for each item
            for (int indexItem = 0; indexItem <= 8; indexItem++) {
                ImageView craftingItem = findViewById(getResources().getIdentifier("craftingSlotImage" + indexItem, "id", getPackageName()));
                String craftItemTag = craftingItem.getTag().toString();
                String goodCraftItem = listGoodCrafts.getItemFromIndex(indexCraft, indexItem);

                // If item not correspond to craft
                if (!craftItemTag.equals(goodCraftItem)) {
                    craftMatch = false;
                    break;
                }
            }
            // If craft to be checked correspond to current variant
            if(craftMatch){
                craftIsGood=true;
            }
        }
        if (craftIsGood) {
            timer.cancel();
            return true;
        }
        return false;

    }


    /**
     * Set children of crafting table dropable elements + remove element from crafting table
     */
    private void bind() {
        FrameLayout craftingTableFrameLayout = findViewById(R.id.craftingTableFrameLayout);
        for (int i = 0; i < craftingTableFrameLayout.getChildCount(); i++) {
            View child = craftingTableFrameLayout.getChildAt(i);

            if (child instanceof ImageView) {
                ImageView craftingImageView = (ImageView) child;
                // Set slot can receive a image
                craftingImageView.setOnDragListener(new DragListener());

                // Remove item from crafting table
                craftingImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!"empty".equals(v.getTag())){
                            v.setTag("empty");
                            ((ImageView) v).setImageResource(R.drawable.crafting_table_slot);
                        }
                    }
                });
            }
        }
    }


    private class DragListener implements View.OnDragListener {

        /**
         * Drop the image
         * @param v     The {@code View} that received the drag event.
         * @param event The event object for the drag event.
         * @return true
         */
        @Override
        public boolean onDrag(View v, DragEvent event) {
            if (event.getAction() == DragEvent.ACTION_DROP) {
                ImageView draggedView = (ImageView) event.getLocalState();
                if (v instanceof ImageView) {
                    // Change image and tag of the current slot to item's infos
                    ((ImageView) v).setImageDrawable(draggedView.getDrawable());
                    ((ImageView) v).setTag(draggedView.getTag());
                }
            }
            return true;
        }
    }
}