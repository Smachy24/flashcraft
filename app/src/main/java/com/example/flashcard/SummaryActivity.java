package com.example.flashcard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.models.Game;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        //Récupération de l'Intent
        Intent srcIntent = getIntent();
        String difficulty = srcIntent.getStringExtra("Difficulty");
        Log.i("difficulty", difficulty);
        Game game = srcIntent.getParcelableExtra("game");

        //Récupération des TextView
        TextView difficultyLevel = findViewById(R.id.difficultyLevelTextView);
        TextView numberGoodAnswers = findViewById(R.id.good_answersTextView);
        TextView percentageGoodAnswers = findViewById(R.id.percentageTextView);
        Button homeButton = findViewById(R.id.homeSummaryButton);

        //Mise en place des scores dans les TextView
        difficultyLevel.setText("Niveau de difficulté : " + difficulty);
        numberGoodAnswers.setText(game.getScore()+" / "+game.getQuestions().size()+" bonne(s) réponse(s)");
        int percentage = game.getScore() * 100 / game.getQuestions().size();
        percentageGoodAnswers.setText(percentage+" %");

        //Retour au menu principal
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(SummaryActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(SummaryActivity.this, MainActivity .class));
            }
        });




    }
}