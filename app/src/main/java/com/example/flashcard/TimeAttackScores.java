package com.example.flashcard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TimeAttackScores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack_scores);

        Intent intent = getIntent();
        int totalTimeCraft = intent.getIntExtra("totalTimeCraft", 0);
        int averageTimeCraft = intent.getIntExtra("averageTimeCraft", 0);

        TextView totalTimeCraftView = findViewById(R.id.totalTimeCraft);
        totalTimeCraftView.append(" "+ totalTimeCraft + "s");

        TextView averageTimePerCraftView = findViewById(R.id.averageTimePerCraft);
        averageTimePerCraftView.append(" "+ averageTimeCraft +"s");

        // Go to main menu
        Button home = findViewById(R.id.homeScoreSummaryButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(TimeAttackScores.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(TimeAttackScores.this, MainActivity .class));
            }
        });
    }
}