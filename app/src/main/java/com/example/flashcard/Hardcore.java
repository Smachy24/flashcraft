package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.flashcard.models.RpgAnswer;
import com.example.flashcard.models.RpgGame;
import com.example.flashcard.models.RpgPlayer;
import com.example.flashcard.models.RpgQuestion;

import java.util.ArrayList;

public class Hardcore extends AppCompatActivity {

    public static final String TAG = "HardcoreActivity";

    // View related class field declaration.
    private ProgressBar lifeBar;
    private ProgressBar hungerBar;
    private ProgressBar powerBar;
    private ProgressBar stressBar;

    // textViews
    private TextView questionTitle;
    private TextView questionDescription;
    private TextView questionMoral;
    private TextView rpgScore;

    // radio
    private RadioGroup radioGroup;
    private RadioButton checkedRadioButton;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private Button radioValidationButton;

    // craft
    private Button craftButton;



    // data related field declaration
    private RpgGame game;
    private RpgPlayer player;
    private ArrayList<RpgQuestion> questions = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcore);

        // View recovery
        lifeBar = findViewById(R.id.lifeProgressBar);
        hungerBar = findViewById(R.id.hungerProgressBar);
        powerBar = findViewById(R.id.powerProgressBar);
        stressBar = findViewById(R.id.stressProgressBar);

        // text views
        questionTitle = findViewById(R.id.rpgQuestionTitleTextView);
        questionDescription = findViewById(R.id.rpgQuestionDescriptionTextView);
        questionMoral = findViewById(R.id.rpgMoralTextView);

        rpgScore = findViewById(R.id.rpgScoreTextView);

        // radio
        radioGroup = findViewById(R.id.rpgRadioGroup);
        radioButton1 = findViewById(R.id.rpgChoiceRadioButton1);
        radioButton2 = findViewById(R.id.rpgChoiceRadioButton2);
        radioButton3 = findViewById(R.id.rpgChoiceRadioButton3);
        //radioButton4 = findViewById(R.id.answersRadioButton4);

        radioValidationButton = findViewById(R.id.rpgRadioValidationButton);


        // recover intent data
        Intent srcIntent = getIntent();
        game = srcIntent.getParcelableExtra("game");
        Log.i("AHHHHHHHHHHHHHHHHHHH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: " + game);
        Log.i("AHHHHHHHHHHHHHHHHHHH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA: " + game.getPlayer());
        player = game.getPlayer();
        questions = game.getQuestions();





        // default value assignation
        lifeBar.setProgress(player.getCurrentLifePoint());
        hungerBar.setProgress(player.getCurrentHungerPoint());
        powerBar.setProgress(player.getCurrentPowerPoint());
        stressBar.setProgress(player.getCurrentStressPoint());

        // Generation of page

        // text views
        questionTitle.setText(game.getCurrentQuestion().getTitle());
        questionDescription.setText(game.getCurrentQuestion().getDescription());
        questionMoral.setText(game.getCurrentQuestion().getMoral());

        rpgScore.setText(String.valueOf(game.getScore()));

        // radio
        Log.i(TAG, "onCreate:ANSSSSSSSSSSSSSSSSSSSSSSSSSSSSS " + game.getCurrentQuestion());
        radioButton1.setText(game.getCurrentQuestion().getAnswers().get(0).getPrompt());
        radioButton2.setText(game.getCurrentQuestion().getAnswers().get(1).getPrompt());
        radioButton3.setText(game.getCurrentQuestion().getAnswers().get(2).getPrompt());
        //radioButton4.setText(game.getCurrentQuestion().getAnswers().get().getPrompt());




        // click of the validation button to confirm choice
        radioValidationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String finalAnswer = checkedRadioButton.getText().toString();
                Log.i("ANSWER", "DEFINITIVE CHOISE IS : " + finalAnswer);

                //if(finalAnswer.equals(game.getCurrentQuestion().getAnswers().get(0).getPrompt()))
                //{
                //    Toast.makeText(Hardcore.this, "REPONSE 1 !", Toast.LENGTH_SHORT).show();
                //}

                for (int i = 0; i < game.getCurrentQuestion().getAnswers().size(); i++) {
                    //Log.i(TAG, "FOOOOOOOOOOOOOOOOOOOOR: " + i);
                    if(finalAnswer.equals(game.getCurrentQuestion().getAnswers().get(i).getPrompt()))
                    {
                        //Toast.makeText(Hardcore.this, "REPONSE" + i, Toast.LENGTH_SHORT).show();
                        RpgAnswer validatedAnswer = game.getCurrentQuestion().getAnswers().get(i);
                        game.getPlayer().UpdateStats(validatedAnswer);
                        game.getQuestions().remove(game.getCurrentQuestion()); // TODO CHECK IFWORKING ACCORDINGLY
                    }
                }

                Toast.makeText(Hardcore.this, game.getCurrentQuestion().getMoral(), Toast.LENGTH_SHORT).show();
                game.incrementScoreByOne();




                questionMoral.setVisibility(View.VISIBLE);
                //Toast.makeText(Hardcore.this, "Vous etes sur ? douter !", Toast.LENGTH_SHORT).show();


                if(game.getScore() > 5 && !game.isNetherUnlocked())
                {
                    game.setNetherUnlocked(true);
                    Toast.makeText(Hardcore.this, "VOS AMIS DU NETHER ARRIVENT", Toast.LENGTH_SHORT).show();
                    RpgUtils.loadNetherQuestionsInGameQuestionPool(game.getQuestions());
                }

                game.nextQuestion();



                // wait before generating next question page
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        nextQuestion();
                    }
                }, 500);   //1 s
            }
        });

        // one radio button have been selected
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Get the view of the checked radio button
                if(game.getCurrentQuestionIndex() + 1 == game.getQuestions().size())
                {
                    radioValidationButton.setText("TERMINER !");
                }
                else
                {
                    radioValidationButton.setText("VALIDER !");
                }

                radioValidationButton.setEnabled(true);
                radioValidationButton.setBackgroundColor(Color.rgb(226, 11, 11));
                checkedRadioButton = findViewById(checkedId);
                // Apply change to the visual of the button
                Log.d("question", "answer" + checkedId + "selected" );
            }
        });


    }

    private void nextQuestion()
    {
        // Redirection on the same page with updated context.
        if (game.getCurrentQuestionIndex() < game.getQuestions().size())
        {
            Intent intent = new Intent(Hardcore.this, Hardcore.class);
            intent.putExtra("Difficulty", "hard");
            intent.putExtra("game", game);
            startActivity(intent);
        }
        else
        {

        }
    }
}