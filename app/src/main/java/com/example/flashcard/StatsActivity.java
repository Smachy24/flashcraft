package com.example.flashcard;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        //Récupération des TextView
        TextView totalQuestionsTextView = findViewById(R.id.totalQuestionsTextView);
        TextView totalGoodAnswersTextView = findViewById(R.id.totalGoodAnswersTextView);
        TextView globalPercentage = findViewById(R.id.globalPercentageTextView);

        //Récupération des SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("GlobalStatistics", MODE_PRIVATE);

        int totalQuestions = sharedPreferences.getInt("TotalQuestions", 0);
        int totalGoodAnswers = sharedPreferences.getInt("TotalGoodAnswers", 0);

        Log.i("testtotal", String.valueOf(totalQuestions));
        Log.i("testgood", String.valueOf(totalGoodAnswers));

        //Mise en place des scores globaux
        totalQuestionsTextView.setText(String.valueOf(totalQuestions));
        totalGoodAnswersTextView.setText(String.valueOf(totalGoodAnswers));
        globalPercentage.setText(totalGoodAnswers*100/totalQuestions+" %");
    }
}