package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.flashcard.models.Game;
import com.example.flashcard.models.Question;

public class QuestionsActivity extends AppCompatActivity {
    public static final String TAG = "QuestionActivity";

    // Question Header
    private TextView prompt;
    private ImageView promptIcon;

    // Body
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;

    private RadioButton checkedRadioButton;

    private Button answerValidationButton;


    private ImageView answerImage1;
    private ImageView answerImage2;
    private ImageView answerImage3;
    private ImageView answerImage4;

    private TextView totalQuestionNumber;
    private TextView currentQuestionNumber;


    // data
    private Game game;
    private Question currentQuestion;

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

        answerImage1 = findViewById(R.id.answersImageView1);
        answerImage2 = findViewById(R.id.answersImageView2);
        answerImage3 = findViewById(R.id.answersImageView3);
        answerImage4 = findViewById(R.id.answersImageView4);

        totalQuestionNumber = findViewById(R.id.totalQuestionId);
        currentQuestionNumber = findViewById(R.id.currentQuestionIdText);

        prompt = findViewById(R.id.promptTextView);
        promptIcon = findViewById(R.id.promptLogoImageView);

        // recover intent data
        Intent srcIntent = getIntent();
        String difficulty = srcIntent.getStringExtra("Difficulty");

        //Toast startToast = Toast.makeText(this, difficulty, Toast.LENGTH_LONG); // in Activity
        //startToast.show();

        game = srcIntent.getParcelableExtra("game");
        Log.i(TAG, "onCreate: " + game.toString());
        //game.setCurrentQuestionIndex(game.getCurrentQuestionIndex() + 1);
        currentQuestion = game.getQuestions().get(game.getCurrentQuestionIndex());



        // Generation of page
        //String promptIconPathName = "/path/to/file/"+currentQuestion.getIcon()+".jpg";

        // prompt
        prompt.setText(currentQuestion.getPrompt());

        int promptIconId = this.getResources().getIdentifier(currentQuestion.getIcon(), "drawable", this.getPackageName());
        promptIcon.setImageResource(promptIconId);

        // Answers
        radioButton1.setText(currentQuestion.getAnswers().get(0));
        int answerImage1id = this.getResources().getIdentifier(currentQuestion.getAnswers().get(0), "drawable", this.getPackageName());
        answerImage1.setImageResource(answerImage1id);

        radioButton2.setText(currentQuestion.getAnswers().get(1));
        int answerImage2id = this.getResources().getIdentifier(currentQuestion.getAnswers().get(1), "drawable", this.getPackageName());
        answerImage2.setImageResource(answerImage2id);

        radioButton3.setText(currentQuestion.getAnswers().get(2));
        int answerImage3id = this.getResources().getIdentifier(currentQuestion.getAnswers().get(2), "drawable", this.getPackageName());
        answerImage3.setImageResource(answerImage3id);

        if (currentQuestion.getAnswers().size() > 3)
        {
            answerImage4.setVisibility(View.VISIBLE);
            radioButton4.setVisibility(View.VISIBLE);

            int answerImage4id = this.getResources().getIdentifier(currentQuestion.getAnswers().get(3), "drawable", this.getPackageName());
            answerImage4.setImageResource(answerImage4id);

            radioButton4.setText(currentQuestion.getAnswers().get(3));
        }

        // Counter
        totalQuestionNumber.setText(String.valueOf(game.getQuestions().size()));
        currentQuestionNumber.setText(String.valueOf(game.getCurrentQuestionIndex() + 1));

        // validation button
        if(game.getCurrentQuestionIndex() + 1 == game.getQuestions().size())
        {
            answerValidationButton.setText("Encore un dernier !");
        }





        // click of the validation button to confirm choice
        answerValidationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String finalAnswer = checkedRadioButton.getText().toString();
                Log.i("ANSWER", "DEFINITIVE CHOISE IS : " + finalAnswer);
                Log.i("ANSWER", "U ANSWER = " + finalAnswer);
                Log.i("ANSWER", "GOOD ANSWER = " + currentQuestion.getGood_answer());


                if(finalAnswer.equals(currentQuestion.getGood_answer()))
                {
                    Toast.makeText(QuestionsActivity.this, "Bonne réponse !", Toast.LENGTH_SHORT).show();
                    game.setScore(game.getScore() + 1);
                    checkedRadioButton.setTextColor(Color.rgb(11, 226, 11));
                    checkedRadioButton.setBackgroundColor(Color.rgb(11, 226, 11));
                }
                else
                {
                    checkedRadioButton.setTextColor(Color.rgb(226, 11, 11));
                    checkedRadioButton.setBackgroundColor(Color.rgb(226, 11, 11));
                    Toast.makeText(QuestionsActivity.this, "mauvaise réponse --'", Toast.LENGTH_SHORT).show();
                }

                game.setCurrentQuestionIndex(game.getCurrentQuestionIndex() + 1);
                Log.i(TAG, "onCreate: " + game.toString());



                // wait before generating next question page
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        nextQuestion();
                    }
                }, 1000);   //1 s




            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the view of the checked radio button
                if(game.getCurrentQuestionIndex() + 1 == game.getQuestions().size())
                {
                    answerValidationButton.setText("TERMINER !");
                }
                else
                {
                    answerValidationButton.setText("CRAFT !");
                }

                answerValidationButton.setEnabled(true);
                answerValidationButton.setBackgroundColor(Color.rgb(226, 11, 11));
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

    private void nextQuestion()
    {
        // Redirection on the same page with updated context.
        if (game.getCurrentQuestionIndex() < game.getQuestions().size())
        {
            Intent intent = new Intent(QuestionsActivity.this, QuestionsActivity.class);
            intent.putExtra("Difficulty", "hard");
            intent.putExtra("game", game);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(QuestionsActivity.this, SummaryActivity.class);
            intent.putExtra("Difficulty", "hard");
            intent.putExtra("game", game);
            startActivity(intent);
        }
    }
}