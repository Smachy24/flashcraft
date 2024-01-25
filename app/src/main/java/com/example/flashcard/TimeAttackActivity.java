package com.example.flashcard;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
                    items.add(new Item(resourceId));
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

        Intent srcIntent = getIntent();
        TimeAttackGame game = srcIntent.getParcelableExtra("game");
        System.out.println(game);
        System.out.println("AAAAAAAAAAAAAAAAA : " + game.getCrafts().get(0).getCraftedItemName());



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

                // Vérifier si la vue cible est une instance de ImageView et si la vue draggée est l'image d'exemple
                if (v instanceof ImageView) {

                    // Changez l'image de la vue cible pour qu'elle soit la même que celle de la vue draggée
                    ((ImageView) v).setImageDrawable(draggedView.getDrawable());

                }
            }
            return true;
        }

    }
}