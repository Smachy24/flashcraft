package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.RpgGame;
import com.example.flashcard.models.TimeAttackGame;

import java.util.ArrayList;

public class HardcoreEndActivity extends AppCompatActivity {

    private Button homeButton;
    private TextView score;
    private RpgGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcore_end);

        homeButton = findViewById(R.id.rpgEndHomeButton);
        score = findViewById(R.id.rpgEndFinalScoreTextView);

        Intent srcIntent = getIntent();
        game = srcIntent.getParcelableExtra("game");

        score.setText(String.valueOf(game.getScore()));



        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(HardcoreEndActivity.this,R.raw.click_sound);
                mediaPlayer.start();

                Intent intent = new Intent(HardcoreEndActivity.this, MainActivity.class);
                intent.putExtra("game", game);
                startActivity(intent);
            }
        });



    }
}