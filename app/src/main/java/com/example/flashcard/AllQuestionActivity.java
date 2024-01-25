package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.flashcard.models.Question;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class AllQuestionActivity extends AppCompatActivity {

    private List<Question> questions;
    private QuestionsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_question);

        questions = new ArrayList<>();
        adapter = new QuestionsAdapter(questions);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // fetch all data GetQuestion from API ( from utils.java )
        Utils.Api.getQuestions(new Utils.OnQuestionsListener() {
            @Override
            // success load
            public void onQuestionsLoaded(final ArrayList<Question> loadedQuestions) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // clear all existing question
                        questions.clear();
                        // add question
                        questions.addAll(loadedQuestions);
                        // notify adapter from data charged + refresh layout
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });
    }
}


