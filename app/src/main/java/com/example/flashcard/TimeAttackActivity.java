package com.example.flashcard;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.Game;
import com.example.flashcard.models.Item;
import com.example.flashcard.models.TimeAttackGame;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class TimeAttackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);

        ArrayList<Item> items = new ArrayList<>();


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


        RecyclerView recyclerView = findViewById(R.id.itemListRecyclerView);
        ItemAdapter adapter = new ItemAdapter(items);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        bind();

        initGame();

    }

    private void playRound(Craft craft, int round){

    }

    private void initGame(){
        Intent srcIntent = getIntent();
        TimeAttackGame game = srcIntent.getParcelableExtra("game");

        ArrayList<Craft> craftsList = game.getCrafts();

        int currentCraftIndex = game.getCurrentCraftIndex();
        Craft currentCraft = craftsList.get(currentCraftIndex);

        TextView itemCraftedTextView = findViewById(R.id.itemCraftedTextView);
        itemCraftedTextView.setText(currentCraft.getCraftedItemName());

        ImageView itemCraftedImageView = findViewById(R.id.itemCraftedImageView);
        itemCraftedImageView.setImageResource(currentCraft.getCraftedItemImage());

        TextView currentCraftTextView = findViewById(R.id.currentCraftTextView);
        currentCraftTextView.setText("Craft : " + (currentCraftIndex+1));

        TextView totalCraftTextView = findViewById(R.id.totalCraftTextView);
        totalCraftTextView.setText(" / " + craftsList.size());

        Button validateCraftButton = findViewById(R.id.validateCraftButton);

        TextView timerTextView = findViewById(R.id.timerTextView);
        CountDownTimer countDownTimer = new CountDownTimer(30000, 1000) { // 30 secondes avec des mises à jour toutes les 1 seconde
            public void onTick(long millisUntilFinished) {
                timerTextView.setText(millisUntilFinished / 1000 + "s");
            }

            public void onFinish() {
                timerTextView.setText("Temps écoulé !");

            }
        };

        // Démarrez le compte à rebours
        countDownTimer.start();

        validateCraftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCraft(currentCraft, countDownTimer);
            }
        });

    }

    private void checkCraft(Craft goodCraft, CountDownTimer timer) {
        boolean craftMatch = true;

        for (int i = 0; i <= 8; i++) {
            ImageView craftingItem = findViewById(getResources().getIdentifier("craftingSlotImage" + i, "id", getPackageName()));
            String craftItemTag = craftingItem.getTag().toString();
            String goodCraftItem = goodCraft.getItemFromIndex(i);

            if (!craftItemTag.equals(goodCraftItem)) {
                craftMatch = false;
                break;
            }
        }

        if (craftMatch) {
            System.out.println("Le craft est bon");
            timer.cancel();
        } else {
            System.out.println("Le craft est erroné");
        }


    }


    /**
     * Set children of crafting table dropable elements
     */
    private void bind() {
        FrameLayout craftingTableFrameLayout = findViewById(R.id.craftingTableFrameLayout);
        for (int i = 0; i < craftingTableFrameLayout.getChildCount(); i++) {
            View child = craftingTableFrameLayout.getChildAt(i);

            // Vérifie si l'enfant est une instance de ViewGroup
            if (child instanceof ImageView) {
                ImageView craftingImageView = (ImageView) child;
                craftingImageView.setOnDragListener(new DragListener());
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
                    ((ImageView) v).setImageDrawable(draggedView.getDrawable());
                    ((ImageView) v).setTag(draggedView.getTag());
                }
            }
            return true;
        }

    }
}