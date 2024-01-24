package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.flashcard.models.Question;

import java.util.ArrayList;

public class TimeAttackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack);

        Intent intent = getIntent();
        ArrayList< Question > questions = intent.getParcelableArrayListExtra("questions");
        System.out.println(questions);

    }
}