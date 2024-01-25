package com.example.flashcard;

import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcard.models.Item;

import java.util.ArrayList;

public class TimeAttackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);

        ArrayList<Item> items = new ArrayList<>();


        for(int i = 0; i < 10; i++ ){
            items.add(new Item(R.drawable.question_item_bucket));
            items.add(new Item(R.drawable.question_item_cake));
            items.add(new Item(R.drawable.question_item_stone_pickaxe));
        }

        System.out.println(items);

        RecyclerView recyclerView = findViewById(R.id.itemListRecyclerView);
        ItemAdapter adapter = new ItemAdapter(items);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ImageView exempleImage = findViewById(R.id.exempleImage);
        exempleImage.setOnTouchListener(new DragItemTouchListener());
        bind();
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

    private static class DragItemTouchListener implements View.OnTouchListener {

        /**
         * Return if image is pressed
         * @param view        The view the touch event has been dispatched to.
         * @param motionEvent The MotionEvent object containing full information about
         *                    the event.
         * @return
         */
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                dragMultiple(view);
                return true;
            } else {
                return false;
            }
        }

        /**
         * Drag and move the image
         * @param view  The view the touch event has been dispatched to.
         */
        private void dragMultiple(View view) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDragAndDrop(data, shadowBuilder, view, 0);
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
                if (v instanceof ImageView && draggedView.getId() == R.id.exempleImage) {

                    // Changez l'image de la vue cible pour qu'elle soit la même que celle de la vue draggée
                    ((ImageView) v).setImageDrawable(draggedView.getDrawable());

                }
            }
            return true;
        }

    }
}