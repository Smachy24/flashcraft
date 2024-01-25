package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.example.flashcard.models.RpgGame;
import com.example.flashcard.models.RpgPlayer;
import com.example.flashcard.models.RpgQuestion;

import java.util.ArrayList;

public class Hardcore extends AppCompatActivity {

    // View related class field declaration.
    private ProgressBar lifeBar;
    private ProgressBar hungerBar;
    private ProgressBar powerBar;
    private ProgressBar stressBar;

    // data related field declaration
    private RpgGame game;
    private RpgPlayer player;
    private ArrayList<RpgQuestion> questions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcore);

        // View recovery
        lifeBar = findViewById(R.id.lifeProgressBar);
        hungerBar = findViewById(R.id.hungerProgressBar);
        powerBar = findViewById(R.id.powerProgressBar);
        stressBar = findViewById(R.id.stressProgressBar);

        // recover intent data
        Intent srcIntent = getIntent();
        game = srcIntent.getParcelableExtra("game");
        Log.i("AHHHHHHHHHHHHHHHHHHH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: " + game);
        Log.i("AHHHHHHHHHHHHHHHHHHH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: " + game.getPlayer());
        player = game.getPlayer();
        questions = game.getQuestions();




        // default value assignation
        lifeBar.setProgress(player.getCurrentLifePoint());
        hungerBar.setProgress(player.getCurrentHungerPoint());
        powerBar.setProgress(player.getCurrentPowerPoint());
        stressBar.setProgress(player.getCurrentStressPoint());

    }
}