package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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

        // radio
        Log.i(TAG, "onCreate:ANSSSSSSSSSSSSSSSSSSSSSSSSSSSSS " + game.getCurrentQuestion());
        radioButton1.setText(game.getCurrentQuestion().getAnswers().get(0).getPrompt());
        radioButton2.setText(game.getCurrentQuestion().getAnswers().get(1).getPrompt());
        radioButton3.setText(game.getCurrentQuestion().getAnswers().get(2).getPrompt());
        //radioButton4.setText(game.getCurrentQuestion().getAnswers().get().getPrompt());




    }
}