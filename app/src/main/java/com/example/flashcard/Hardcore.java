package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
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
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class Hardcore extends AppCompatActivity {

    public static final String TAG = "HardcoreActivity";

    // View related class field declaration.
    // player stats
    private ProgressBar lifeBar;
    private ProgressBar hungerBar;
    private ProgressBar powerBar;
    private ProgressBar stressBar;

    // player resources
    private TextView ironIngotAmount;
    private TextView stickAmount;
    private TextView cobblestoneAmount;
    private TextView wheatAmount;
    private TextView netherStarAmount;

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

    // shared preferences Success
    //SharedPreferences sharedPreferences = getSharedPreferences("Achievements", MODE_PRIVATE);
    //SharedPreferences.Editor sharedPreferencesEditor = sharedPreferences.edit();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcore);

        // View recovery
        // player stats
        lifeBar = findViewById(R.id.lifeProgressBar);
        hungerBar = findViewById(R.id.hungerProgressBar);
        powerBar = findViewById(R.id.powerProgressBar);
        stressBar = findViewById(R.id.stressProgressBar);

        // player resources
        ironIngotAmount = findViewById(R.id.resourceTextView1);
        stickAmount = findViewById(R.id.resourceTextView2);
        cobblestoneAmount = findViewById(R.id.resourceTextView3);
        wheatAmount = findViewById(R.id.resourceTextView4);
        netherStarAmount = findViewById(R.id.resourceTextView5);

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

        ironIngotAmount.setText(String.valueOf(player.getAmountIronIngot()));
        stickAmount.setText(String.valueOf(player.getAmountStick()));
        cobblestoneAmount.setText(String.valueOf(player.getAmountCobblestone()));
        wheatAmount.setText(String.valueOf(player.getAmountWheat()));
        netherStarAmount.setText(String.valueOf(0));

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

                SharedPreferences sharedPreferences = getSharedPreferences("Achievements", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

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
                        game.getQuestions().remove(game.getCurrentQuestion()); // TODO CHECK IFWORKING ACCORDINGLY

                        //UPDATE PLAYER STATS
                        game.getPlayer().UpdateStats(validatedAnswer);
                        // new value assignation
                        lifeBar.setProgress(player.getCurrentLifePoint());
                        hungerBar.setProgress(player.getCurrentHungerPoint());
                        powerBar.setProgress(player.getCurrentPowerPoint());
                        stressBar.setProgress(player.getCurrentStressPoint());
                        ironIngotAmount.setText(String.valueOf(player.getAmountIronIngot()));
                        stickAmount.setText(String.valueOf(player.getAmountStick()));
                        cobblestoneAmount.setText(String.valueOf(player.getAmountCobblestone()));
                        wheatAmount.setText(String.valueOf(player.getAmountWheat()));
                    }
                }

                // TOAST OF THE MORAL
                //Toast.makeText(Hardcore.this, game.getCurrentQuestion().getMoral(), Toast.LENGTH_SHORT).show();
                game.incrementScoreByOne();

                questionMoral.setVisibility(View.VISIBLE);


                // check for progression
                // NETHER
                if(game.getScore() > 5 && !game.isNetherUnlocked())
                {
                    // check if first time reaching nether
                    if (!sharedPreferences.getBoolean("isNetherUnlocked", false))
                    {
                        // change global game settings
                        editor.putBoolean("isNetherUnlocked", true);
                        editor.apply();
                        // feedback
                        final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                        mediaPlayer.start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ DECOUVER LE NETHER!", Snackbar.LENGTH_LONG).show();
                    }
                    else
                    {
                        // feedback
                        MediaPlayer.create(Hardcore.this,R.raw.sound_effect_nether_portal).start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOS AMIS DU NETHER ARRIVENT !", Snackbar.LENGTH_LONG).show();

                        // Change duration before nextQuestion
                    }

                    // change current game settings
                    game.setNetherUnlocked(true);
                    RpgUtils.loadNetherQuestionsInGameQuestionPool(game.getQuestions());
                }
                else // play regular sound effect and don't add more question to the pool
                {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_xp1);
                    mediaPlayer.start();
                }

                // END

                // WATER TEMPLE

                // AETHER

                // check for boss success
                switch(game.getCurrentQuestion().getTitle()) {
                    case "BOSS : LE WITHER":
                        if (!sharedPreferences.getBoolean("isWitherBeaten", false))
                        {
                            editor.putBoolean("isWitherBeaten", true);
                            editor.apply();
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                            mediaPlayer.start();
                            Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ BATTUE LE WITHER!", Snackbar.LENGTH_LONG).show();
                        }
                        else
                        {
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_wither_spawn);
                            mediaPlayer.start();
                        }
                        break;
                    case "Moyen":
                        break;
                    case "Difficile":
                        break;
                    default:
                }




                game.nextQuestion();



                // wait before generating next question page
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        nextQuestion();
                    }
                }, 1250);   //1.25 s
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