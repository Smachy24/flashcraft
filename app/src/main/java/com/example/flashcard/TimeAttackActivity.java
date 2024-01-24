package com.example.flashcard;

import android.content.ClipData;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TimeAttackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);

        ImageView exempleImage = findViewById(R.id.exempleImage);
        exempleImage.setOnTouchListener(new DragItemTouchListener());
        bind();
    }

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

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                dragMultiple(view);
                return true;
            } else {
                return false;
            }
        }

        private void dragMultiple(View view) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            ViewGroup parent = (ViewGroup) view.getParent();

            view.startDragAndDrop(data, shadowBuilder, view, 0);
//            parent.removeView(view);
        }
    }

    private class DragListener implements View.OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent event) {
            if (event.getAction() == DragEvent.ACTION_DROP) {
                ImageView draggedView = (ImageView) event.getLocalState();

                // Vérifier si la vue cible est une instance de ImageView et si la vue draggée est l'image d'exemple
                if (v instanceof ImageView && draggedView.getId() == R.id.exempleImage) {

                    // Obtenez l'ID de la vue cible
                     int targetImageId = v.getId();

                    // Changez l'image de la vue cible pour qu'elle soit la même que celle de la vue draggée
                    ((ImageView) v).setImageDrawable(draggedView.getDrawable());

                    v.invalidate();
                }
            }
            return true;
        }

    }
}