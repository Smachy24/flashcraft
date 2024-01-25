package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class Hardcore extends AppCompatActivity {

    ProgressBar lifeBar;
    ProgressBar hungerBar;
    ProgressBar powerBar;
    ProgressBar stressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcore);

        lifeBar = findViewById(R.id.lifeProgressBar);
        hungerBar = findViewById(R.id.hungerProgressBar);
        powerBar = findViewById(R.id.powerProgressBar);
        stressBar = findViewById(R.id.stressProgressBar);

        // default value assignation
        lifeBar.setProgress(25);
        hungerBar.setProgress(25);
        powerBar.setProgress(25);
        stressBar.setProgress(25);


    }
}