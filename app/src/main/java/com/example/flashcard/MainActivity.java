package com.example.flashcard;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.Game;
import com.example.flashcard.models.Question;
import com.example.flashcard.models.TimeAttackGame;

import java.util.ArrayList;
import java.util.Collections;

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

        Utils.Api.getQuestions(this);

        videoView = findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sunset);

        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);

        videoView.start();
        mediaController.setVisibility(android.widget.MediaController.GONE);

        videoView.setOnPreparedListener(mp -> {
            mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
        });

        videoView.setOnCompletionListener(mp -> videoView.start());

        // Launching a normal mode game.
        Button questionButton = findViewById(R.id.questionButton);
        questionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();

                showDifficultyDialog();
                //startActivity(new Intent(MainActivity.this, QuestionsActivity.class));
            }
        });

        Button summaryButton = findViewById(R.id.summaryButton);
        summaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(MainActivity.this, SummaryActivity.class));
            }
        });

        Button statsButton = findViewById(R.id.statsButton);
        statsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(MainActivity.this, StatsActivity.class));
            }
        });

        Button hardcoreButton = findViewById(R.id.hardcoreButton);
        hardcoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(MainActivity.this, Hardcore.class));
            }
        });

        Button allQuestionsButton = findViewById(R.id.allQuestionsButton);
        allQuestionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(MainActivity.this, AllQuestionActivity.class));
            }
        });

        Button timeAttackButton = findViewById(R.id.timeAttackButton);
        timeAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();

                ArrayList<Craft> craftList = Utils.CraftList.getCraftList();
                TimeAttackGame game = GameFactory.CreateTimeAttackGame(craftList);

                Intent intent = new Intent(MainActivity.this, TimeAttackActivity.class);
                intent.putExtra("game", game);
                startActivity(intent);


            }
        });

        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });
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



