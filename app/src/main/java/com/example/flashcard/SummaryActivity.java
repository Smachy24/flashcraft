package com.example.flashcard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

        //Mise en place des scores dans les TextView
        difficultyLevel.setText("Niveau de difficulté : " + difficulty);
        numberGoodAnswers.setText(game.getScore()+" / "+game.getQuestions().size()+" bonne(s) réponse(s)");
        int percentage = game.getScore() * 100 / game.getQuestions().size();
        percentageGoodAnswers.setText(percentage+" %");


    }
}