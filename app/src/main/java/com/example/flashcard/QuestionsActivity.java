package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuestionsActivity extends AppCompatActivity {
    public static final String TAG = "QuestionActivity";
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;

    private RadioButton checkedRadioButton;

    private Button answerValidationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        radioGroup = findViewById(R.id.answersRadioGroup);
        radioButton1 = findViewById(R.id.answersRadioButton1);
        radioButton2 = findViewById(R.id.answersRadioButton2);
        radioButton3 = findViewById(R.id.answersRadioButton3);
        radioButton4 = findViewById(R.id.answersRadioButton4);

        answerValidationButton = findViewById(R.id.answerValidationButton);



        // click of the validation button to confirm choice
        answerValidationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String finalAnswer = checkedRadioButton.getText().toString();
                Log.i("ANSWER", "DEFINITIVE CHOISE IS : " + finalAnswer);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the view of the checked radio button
                checkedRadioButton = findViewById(checkedId);
                // Apply change to the visual of the button
                Log.d("question", "answer" + checkedId + "selected" );
            }
        });


        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("question", "answer 1 selected" );
                //checkButton(v);

            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("question", "answer 2 selected" );
                // radioButton2.setScaleX(radioButton2.getScaleX()*1.1f);
                // radioButton2.setScaleY(radioButton2.getScaleY()*1.1f);
                //checkButton(v);


            }
        });

        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("question", "answer 3 selected" );
                //checkButton(v);
            }
        });

        radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("question", "answer 4 selected" );
            }
        });

    }
}