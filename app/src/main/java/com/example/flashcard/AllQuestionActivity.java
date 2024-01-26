package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.flashcard.models.Question;

import java.util.ArrayList;
import java.util.List;

public class AllQuestionActivity extends AppCompatActivity {

    private List<Question> questions;
    private QuestionsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_question);

        // Initialize the list of questions and the adapter
        questions = new ArrayList<>();
        adapter = new QuestionsAdapter(questions);

        // Set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Fetch all data (questions) from the API (using Utils.java)
        Utils.Api.getQuestions(new Utils.OnQuestionsListener() {
            @Override
            // Callback method called when questions are loaded successfully
            public void onQuestionsLoaded(final ArrayList<Question> loadedQuestions) {
                // Ensure UI updates are performed on the main (UI) thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // Clear all existing questions
                        questions.clear();
                        // Add the loaded questions to the list
                        questions.addAll(loadedQuestions);
                        // Notify the adapter that the data has changed and refresh the layout
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });
    }
}
