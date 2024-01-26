package com.example.flashcard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        ImageView achievementImage = findViewById(R.id.achievementImageView);
        TextView achievementText = findViewById(R.id.textAchievTextView);




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
                        //game.getQuestions().remove(game.getCurrentQuestion()); // TODO CHECK IFWORKING ACCORDINGLY
                        game.getQuestions().remove(game.getCurrentQuestionIndex()); // TODO CHECK IFWORKING ACCORDINGLY


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

                    achievementImage.setVisibility(View.VISIBLE);

                    game.setNetherUnlocked(true);
                    RpgUtils.loadNetherQuestionsInGameQuestionPool(game.getQuestions());
                }
                else // play regular sound effect and don't add more question to the pool
                {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_xp1);
                    mediaPlayer.start();
                }

                // END
                if(game.getScore() > 15 && !game.isEndUnlocked())
                {
                    // check if first time reaching nether
                    if (!sharedPreferences.getBoolean("isEndUnlocked", false))
                    {
                        // change global game settings
                        editor.putBoolean("isEndUnlocked", true);
                        editor.apply();
                        // feedback
                        final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                        mediaPlayer.start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ DECOUVER L'END!", Snackbar.LENGTH_LONG).show();
                    }
                    else // area already discovered
                    {
                        // feedback
                        MediaPlayer.create(Hardcore.this,R.raw.sound_effect_end_portal).start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOS AMIS DE L'END ARRIVENT !", Snackbar.LENGTH_LONG).show();
                    }

                    // change current game settings
                    game.setEndUnlocked(true);
                    RpgUtils.loadEndQuestionsInGameQuestionPool(game.getQuestions());

                    achievementImage.setImageResource(R.drawable.end_portal_achiev);
                    achievementImage.setVisibility(View.VISIBLE);
                }

                // WATER TEMPLE
                if(game.getScore() > 25 && !game.isWaterTempleUnlocked())
                {
                    // check if first time reaching nether
                    if (!sharedPreferences.getBoolean("isWaterTempleUnlocked", false))
                    {
                        // change global game settings
                        editor.putBoolean("isWaterTempleUnlocked", true);
                        editor.apply();
                        // feedback
                        final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                        mediaPlayer.start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ DECOUVER LE TEMPLE DE L'EAU!", Snackbar.LENGTH_LONG).show();
                    }
                    else // area already discovered
                    {
                        // feedback
                        MediaPlayer.create(Hardcore.this,R.raw.sound_effect_sous_locean).start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "LE TEMPLE DE L'EAU OUVRE SES PORTES !", Snackbar.LENGTH_LONG).show();
                    }

                    // change current game settings
                    game.setWaterTempleUnlocked(true);
                    RpgUtils.loadWaterTempleQuestionsInGameQuestionPool(game.getQuestions());
                    achievementImage.setImageResource(R.drawable.water_temple_achiev);
                    achievementImage.setVisibility(View.VISIBLE);
                    achievementText.setText("Les cris terrifiants du Wither s'éteignent\n la tranquillité revient !");
                }

                // AETHER
                if(game.getScore() > 40 && !game.isEatherUnlocked()) {
                    // check if first time reaching nether
                    if (!sharedPreferences.getBoolean("isEatherUnlocked", false)) {
                        // change global game settings
                        editor.putBoolean("isEatherUnlocked", true);
                        editor.apply();
                        // feedback
                        final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this, R.raw.sound_effect_challenge_complete);
                        mediaPlayer.start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ DECOUVER L'EATHER!", Snackbar.LENGTH_LONG).show();
                    } else // area already discovered
                    {
                        // feedback
                        MediaPlayer.create(Hardcore.this, R.raw.sound_effect_devil_deal).start();
                        Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ REUSSIS A INSTALLER UN MOD !", Snackbar.LENGTH_LONG).show();
                    }

                    // change current game settings
                    game.setEatherUnlocked(true);
                    RpgUtils.loadEatherQuestionsInGameQuestionPool(game.getQuestions());
                    achievementImage.setImageResource(R.drawable.aether_achiev);
                    achievementImage.setVisibility(View.VISIBLE);
                    achievementText.setText("Les cris terrifiants du Wither s'éteignent\n la tranquillité revient !");
                }

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

                            achievementImage.setImageResource(R.drawable.wither_achiev);
                            achievementImage.setVisibility(View.VISIBLE);
                            achievementText.setText("Les cris terrifiants du Wither s'éteignent\n la tranquillité revient !");
                        }
                        else
                        {
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_wither_spawn);
                            mediaPlayer.start();
                        }
                        break;
                    case "BOSS : L'ENDER DRAGON":
                        if (!sharedPreferences.getBoolean("isEnderDragonBeaten", false))
                        {
                            editor.putBoolean("isEnderDragonBeaten", true);
                            editor.apply();
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                            mediaPlayer.start();
                            Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ BATTUE L'ENDER DRAGON!", Snackbar.LENGTH_LONG).show();

                            achievementImage.setImageResource(R.drawable.ender_dragon_achiev);
                            achievementImage.setVisibility(View.VISIBLE);
                            achievementText.setText("L'Ender Dragon est tombe\nla victoire est tienne !");
                        }
                        else
                        {
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_dragon_death);
                            mediaPlayer.start();
                        }
                        break;
                    case "BOSS : LE GUARDIAN":
                        if (!sharedPreferences.getBoolean("isGuardianBeaten", false))
                        {
                            editor.putBoolean("isGuardianBeaten", true);
                            editor.apply();
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                            mediaPlayer.start();
                            Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ BATTUE LE GUARDIAN!", Snackbar.LENGTH_LONG).show();
                            achievementImage.setImageResource(R.drawable.guardian_achiev);
                            achievementImage.setVisibility(View.VISIBLE);
                            achievementText.setText("Les cris terrifiants du Wither s'éteignent\n la tranquillité revient !");
                        }
                        else
                        {
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_elder_guardian);
                            mediaPlayer.start();
                        }
                        break;
                    case "BOSS FINAL : LE WARDEN":
                        if (!sharedPreferences.getBoolean("isWardenBeaten", false))
                        {
                            editor.putBoolean("isWardenBeaten", true);
                            editor.apply();
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                            mediaPlayer.start();
                            Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "VOUS AVEZ BATTUE LE WARDEN!", Snackbar.LENGTH_LONG).show();
                            achievementImage.setImageResource(R.drawable.warden_achiev);
                            achievementImage.setVisibility(View.VISIBLE);
                            achievementText.setText("Les cris terrifiants du Wither s'éteignent\n la tranquillité revient !");
                        }
                        else
                        {
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_holy_mantle_break);
                            mediaPlayer.start();
                        }
                        break;
                    case "BOSS : NOTCH":
                        if (!sharedPreferences.getBoolean("isGodBeaten", false))
                        {
                            editor.putBoolean("isGodBeaten", true);
                            editor.apply();
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_challenge_complete);
                            mediaPlayer.start();
                            Snackbar.make(findViewById(R.id.hardcoreRootLayout2), "FELICITATION VOUS AVEZ VAINCU NOTRE JEU!", Snackbar.LENGTH_LONG).show();
                            achievementImage.setImageResource(R.drawable.god_achiev);
                            achievementImage.setVisibility(View.VISIBLE);
                            achievementText.setText("Les cris terrifiants du Wither s'éteignent\n la tranquillité revient !");
                        }
                        else
                        {
                            final MediaPlayer mediaPlayer = MediaPlayer.create(Hardcore.this,R.raw.sound_effect_ameno);
                            mediaPlayer.start();
                        }
                        break;
                    default:
                }


                // next question
                game.nextQuestion();

                if(game.getCurrentQuestion() == null || game.getPlayer().checkIfDead())
                {
                    finish();
                    Intent intent = new Intent(Hardcore.this, HardcoreEndActivity.class);
                    intent.putExtra("game", game);
                    startActivity(intent);
                }
                else // regenerate the page
                {
                    // wait before generating next question page
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            nextQuestion();
                        }
                    }, 1250);   //1.25 s
                }

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
            finish();
        }
        else
        {
            finish();
        }
    }
}