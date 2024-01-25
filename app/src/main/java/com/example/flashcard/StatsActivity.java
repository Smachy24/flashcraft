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
        globalPercentage.setText(calculatePercentage(totalGoodAnswers, totalQuestions));

        //Niveau facile

        TextView totalQuestionsEasyTextView = findViewById(R.id.questionsEasyTextView);
        TextView GoodAnswersEasyTextview = findViewById(R.id.goodAnswersEasytextView);
        TextView PercentageEasyTextView = findViewById(R.id.percentageEasyTextView);

        int totalQuestionsEasy = sharedPreferences.getInt("TotalQuestions_Facile", 0);
        int totalGoodAnswersEasy = sharedPreferences.getInt("TotalGoodAnswers_Facile", 0);

        totalQuestionsEasyTextView.setText(String.valueOf(totalQuestionsEasy));
        GoodAnswersEasyTextview.setText(String.valueOf(totalGoodAnswersEasy));
        PercentageEasyTextView.setText(calculatePercentage(totalGoodAnswersEasy, totalQuestionsEasy));

        //Niveau Moyen

        TextView totalQuestionsMediumTextView = findViewById(R.id.questionsMediumTextView);
        TextView GoodAnswersMediumTextview = findViewById(R.id.goodAnswersMediumtextView);
        TextView PercentageMediumTextView = findViewById(R.id.percentageMediumTextView);

        int totalQuestionsMedium = sharedPreferences.getInt("TotalQuestions_Moyen", 0);
        int totalGoodAnswersMedium = sharedPreferences.getInt("TotalGoodAnswers_Moyen", 0);

        totalQuestionsMediumTextView.setText(String.valueOf(totalQuestionsMedium));
        GoodAnswersMediumTextview.setText(String.valueOf(totalGoodAnswersMedium));
        PercentageMediumTextView.setText(calculatePercentage(totalGoodAnswersMedium, totalQuestionsMedium));

        //Niveau Difficile

        TextView totalQuestionsHardTextView = findViewById(R.id.questionsHardTextView);
        TextView GoodAnswersHardTextview = findViewById(R.id.goodAnswersHardTextView);
        TextView PercentageHardTextView = findViewById(R.id.percentageHardTextView);

        int totalQuestionsHard = sharedPreferences.getInt("TotalQuestions_Difficile", 0);
        int totalGoodAnswersHard = sharedPreferences.getInt("TotalGoodAnswers_Difficile", 0);

        totalQuestionsHardTextView.setText(String.valueOf(totalQuestionsHard));
        GoodAnswersHardTextview.setText(String.valueOf(totalGoodAnswersHard));
        PercentageHardTextView.setText(calculatePercentage(totalGoodAnswersHard, totalQuestionsHard));



    }
    //fonction permettant de gérer le pourcentage s'il est égal a 0
    private String calculatePercentage(int numerator, int denominator) {
        if (denominator != 0) {
            return ((numerator * 100) / denominator) + " %";
        } else {
            return "0";
        }
    }
}