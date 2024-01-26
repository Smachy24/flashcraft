package com.example.flashcard;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.Game;
import com.example.flashcard.models.Question;
import com.example.flashcard.models.RpgGame;
import com.example.flashcard.models.TimeAttackGame;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Utils.OnQuestionsListener {

    private VideoView videoView;
    ArrayList<Question> allQuestions;
    ArrayList<Question> easyQuestions;
    ArrayList<Question> mediumQuestions;
    ArrayList<Question> hardQuestions;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Fetch questions from API when the activity is created
        Utils.Api.getQuestions(this);

        // Initialize the VideoView for displaying a video
        videoView = findViewById(R.id.videoView);

        // Set up media controller for the VideoView
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Set the video source (you are using a video resource from the 'raw' folder)
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sunset);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);

        // Start playing the video
        videoView.start();
        mediaController.setVisibility(android.widget.MediaController.GONE);

        // Set video scaling mode and restart video when it completes
        videoView.setOnPreparedListener(mp -> {
            mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
        });
        videoView.setOnCompletionListener(mp -> videoView.start());

        // Animation and sound for the "robin" text
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.villager);
                mediaPlayer.start();
            }
        });
        Animation bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.bounce_animation);
        textView4.startAnimation(bounceAnimation);

        // Color animation for the "robin" text
        ObjectAnimator colorAnimation = ObjectAnimator.ofObject(
                textView4, "textColor", new ArgbEvaluator(),
                Color.parseColor("#B222CA"),
                Color.parseColor("#FF0000"),
                Color.parseColor("#00FF00"),
                Color.parseColor("#0000FF"),
                Color.parseColor("#FFFF00"),
                Color.parseColor("#FF00FF"),
                Color.parseColor("#00FFFF"),
                Color.parseColor("#FFA500"),
                Color.parseColor("#008000"),
                Color.parseColor("#800080")
        );
        colorAnimation.setDuration(10000);
        colorAnimation.setRepeatCount(ObjectAnimator.INFINITE);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(colorAnimation);
        animatorSet.start();

// Launching a normal mode game.
        Button questionButton = findViewById(R.id.questionButton);
        questionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Show a difficulty dialog (not shown in this snippet)
                showDifficultyDialog();
                // Alternatively, start QuestionsActivity directly
                // startActivity(new Intent(MainActivity.this, QuestionsActivity.class));
            }
        });

        // Button to navigate to the SuccessActivity
        Button successButton = findViewById(R.id.successButton);
        successButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Start the SuccessActivity
                startActivity(new Intent(MainActivity.this, SuccessActivity.class));
            }
        });

        // Button to navigate to the StatsActivity
        Button statsButton = findViewById(R.id.statsButton);
        statsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Start the StatsActivity
                startActivity(new Intent(MainActivity.this, StatsActivity.class));
            }
        });

        // Button to navigate to the Hardcore activity with a predefined game
        Button hardcoreButton = findViewById(R.id.hardcoreButton);
        hardcoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Create an intent for the Hardcore activity with a predefined game
                Intent hardcordeIntent = new Intent(MainActivity.this, Hardcore.class);
                hardcordeIntent.putExtra("game", new RpgGame("hardcore", MainActivity.this));
                // Start the Hardcore activity
                startActivity(hardcordeIntent);
            }
        });



        // Button to navigate to the AllQuestionActivity
        Button allQuestionsButton = findViewById(R.id.allQuestionsButton);
        allQuestionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Start the AllQuestionActivity
                startActivity(new Intent(MainActivity.this, AllQuestionActivity.class));
            }
        });

        // Button to start a Time Attack game and navigate to the TimeAttackActivity
        Button timeAttackButton = findViewById(R.id.timeAttackButton);
        timeAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Get the list of crafts for the Time Attack game
                ArrayList<Craft> craftList = Utils.CraftList.getCraftList();
                // Create a Time Attack game using the factory
                TimeAttackGame game = GameFactory.CreateTimeAttackGame(craftList);

                // Create an intent for the TimeAttackActivity with the game
                Intent intent = new Intent(MainActivity.this, TimeAttackActivity.class);
                intent.putExtra("game", game);
                // Start the TimeAttackActivity
                startActivity(intent);
            }
        });

        // Button to navigate to the AboutActivity
        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Play a click sound when the button is clicked
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.click_sound);
                mediaPlayer.start();

                // Start the AboutActivity
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences("Achievements", MODE_PRIVATE);
        boolean isGodBeaten = sharedPreferences.getBoolean("isGodBeaten", true);

        Log.i("isGodBeaten", "Valeur actuelle : " + isGodBeaten);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        //editor.putBoolean("isGodBeaten", true);
        editor.apply();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (videoView.isPlaying()) {
            videoView.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!videoView.isPlaying()) {
            videoView.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        videoView.stopPlayback();
    }

    @Override
    public void onQuestionsLoaded(ArrayList<Question> questions) {
        this.allQuestions = questions;
        filterQuestionsByLevel("easy");
        filterQuestionsByLevel("medium");
        filterQuestionsByLevel("hard");

        // Afficher les listes de questions
        System.out.println("All Questions: " + this.allQuestions);
        System.out.println("Easy Questions: " + this.easyQuestions);
        System.out.println("Medium Questions: " + this.mediumQuestions);
        System.out.println("Hard Questions: " + this.hardQuestions);

    }

    private void filterQuestionsByLevel(String level) {
        ArrayList<Question> filteredQuestions = new ArrayList<>();

        for (Question question : this.allQuestions) {
            if (question.getLevel().equalsIgnoreCase(level)) {
                filteredQuestions.add(question);
            }
        }

        if (level.equalsIgnoreCase("easy")) {
            this.easyQuestions = filteredQuestions;
        } else if (level.equalsIgnoreCase("medium")) {
            this.mediumQuestions = filteredQuestions;
        } else if (level.equalsIgnoreCase("hard")) {
            this.hardQuestions = filteredQuestions;
        }
    }


    private void showDifficultyDialog() {
        final String[] difficultyLevels = {"Facile", "Moyen", "Difficile"};

        System.out.println("All Questions: " + this.allQuestions);
        System.out.println("Easy Questions: " + this.easyQuestions);
        System.out.println("Medium Questions: " + this.mediumQuestions);
        System.out.println("Hard Questions: " + this.hardQuestions);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choisissez la difficulté")
                .setItems(difficultyLevels, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedDifficult) {
                        String difficulty = difficultyLevels[selectedDifficult];

                        Intent intent = new Intent(MainActivity.this, QuestionsActivity.class);
                        intent.putExtra("Difficulty", difficulty);

                        Game game;

                        switch(difficulty) {
                            case "Facile":
                                intent.putExtra("questions", easyQuestions);
                                game = GameFactory.Create(easyQuestions, difficulty);
                                intent.putExtra("game", game);
                                break;
                            case "Moyen":
                                intent.putExtra("questions", mediumQuestions);
                                game = GameFactory.Create(mediumQuestions, difficulty);
                                intent.putExtra("game", game);
                                break;
                            case "Difficile":
                                intent.putExtra("questions", hardQuestions);
                                game = GameFactory.Create(hardQuestions, difficulty);
                                intent.putExtra("game", game);
                                break;
                            default:
                                Toast.makeText(MainActivity.this, "Veuillez choisir une difficulté", Toast.LENGTH_SHORT).show();
                        }

                        startActivity(intent);
                    }
                })
                .create()
                .show();
    }



}



