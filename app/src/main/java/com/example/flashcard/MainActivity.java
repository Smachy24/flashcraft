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
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.models.Question;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Utils.OnQuestionsListener {

    private VideoView videoView;
    ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.Api.getQuestionById(this, 1);

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

        Button questionButton = findViewById(R.id.questionButton);
        questionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(MainActivity.this, QuestionsActivity.class));
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
                Intent intent = new Intent(MainActivity.this, TimeAttackActivity.class);
                intent.putExtra("questions", questions);
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
        this.questions = questions;
        System.out.println(this.questions.get(0));

    }
  
    private void showDifficultyDialog() {
        final String[] difficultyLevels = {"Facile", "Moyen", "Difficile"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choisissez la difficulté")
                .setItems(difficultyLevels, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create()
                .show();
    }

}



