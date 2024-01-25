package com.example.flashcard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.models.Game;

import java.util.Map;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        //Récupération de l'Intent
        Intent srcIntent = getIntent();
        Game game = srcIntent.getParcelableExtra("game");

        //Récupération des TextView
        TextView difficultyLevel = findViewById(R.id.difficultyLevelTextView);
        TextView numberGoodAnswers = findViewById(R.id.good_answersTextView);
        TextView percentageGoodAnswers = findViewById(R.id.percentageTextView);
        Button homeButton = findViewById(R.id.homeSummaryButton);

        //Mise en place des scores dans les TextView
        difficultyLevel.setText("Niveau de difficulté : " + game.getDifficulty());
        numberGoodAnswers.setText(game.getScore()+" / "+game.getQuestions().size()+" bonne(s) réponse(s)");
        int percentage = game.getScore() * 100 / game.getQuestions().size();
        percentageGoodAnswers.setText(percentage+" %");


        //Mise à jour des stats globales
        SharedPreferences sharedPreferences = getSharedPreferences("GlobalStatistics", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int totalQuestions = sharedPreferences.getInt("TotalQuestions", 0);
        int totalGoodAnswers = sharedPreferences.getInt("TotalGoodAnswers", 0);

        editor.putInt("TotalQuestions", totalQuestions + game.getQuestions().size());
        editor.putInt("TotalGoodAnswers", totalGoodAnswers + game.getScore());

        int totalQuestionsForDifficulty = sharedPreferences.getInt("TotalQuestions_" + game.getDifficulty(), 0);
        int totalGoodAnswersForDifficulty = sharedPreferences.getInt("TotalGoodAnswers_" + game.getDifficulty(), 0);

        editor.putInt("TotalQuestions_" + game.getDifficulty(), totalQuestionsForDifficulty + game.getQuestions().size());
        editor.putInt("TotalGoodAnswers_" + game.getDifficulty(), totalGoodAnswersForDifficulty + game.getScore());

        editor.apply();

        Map<String, ?> allPreferences = sharedPreferences.getAll();

// Parcourez la map et affichez chaque clé et sa valeur
        for (Map.Entry<String, ?> entry : allPreferences.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            Log.i("SharedPreferences", "Clé : " + key + ", Valeur : " + value.toString());
        }




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