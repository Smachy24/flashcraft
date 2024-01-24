package com.example.flashcard;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TimeAttackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);

        View exempleImage = findViewById(R.id.exempleImage);
        exempleImage.setOnTouchListener(new DragItemTouchListener());
        bind();
    }

    private void bind() {
        FrameLayout craftingTableFrameLayout = findViewById(R.id.craftingTableFrameLayout);
        for (int i = 0; i < 9; i++) {
            View child = craftingTableFrameLayout.getChildAt(i);
            if (child instanceof FrameLayout) {
                System.out.println(i);
                FrameLayout craftingFrame = (FrameLayout) child;
                craftingFrame.setOnDragListener(new DragListener());
            }
        }
    }


    private class DragItemTouchListener implements View.OnTouchListener {

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
            parent.removeView(view);
        }
    }

    private class DragListener implements View.OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // Actions for drag started
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    // Actions for drag entered
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    // Actions for drag exited
                    break;
                case DragEvent.ACTION_DROP:
                    animateDropEffect((ViewGroup) v, (View) event.getLocalState());
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    // Actions for drag ended
                    break;
                default:
                    break;
            }
            return true;
        }

        private void animateDropEffect(ViewGroup into, View view) {
            into.addView(view);
            FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) view.getLayoutParams();
            params.gravity = Gravity.END;
            view.setLayoutParams(params);
            view.setVisibility(View.VISIBLE);
        }
    }
}