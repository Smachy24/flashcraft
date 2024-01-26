package com.example.flashcard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TimeAttackScores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack_scores);

        Button home = findViewById(R.id.MainMenuLosingButton);
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