package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AllQuestionActivity extends AppCompatActivity {

    private ImageView expandedImage;
    private ImageView closeButton;
    public ViewGroup.LayoutParams originalParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_question);

        expandedImage = findViewById(R.id.expanded_image);
        closeButton = findViewById(R.id.closeButton);

        originalParams = expandedImage.getLayoutParams();
    }

    public void onImageClick(View view) {
        // SET IMAGE TO MATCH PARENT PARAMS
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT);
        expandedImage.setLayoutParams(params);
        //SET CLOSE BUTTON VISIBLE
        closeButton.setVisibility(View.VISIBLE);
        //SET 1 ST IMAGE GONE
        expandedImage.setClickable(false);
    }

    public void onCloseButtonClick(View view) {
        expandedImage.setLayoutParams(originalParams);

        closeButton.setVisibility(View.GONE);

        expandedImage.setClickable(true);
    }
}

