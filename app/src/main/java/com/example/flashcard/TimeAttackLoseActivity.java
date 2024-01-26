package com.example.flashcard;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.TimeAttackGame;

import java.util.ArrayList;

public class TimeAttackLoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_attack_lose);

        ImageView background = findViewById(R.id.backgroundSkyImageView);
        background.setColorFilter(Color.parseColor("#40FF0000"));

        TextView titleDeath = findViewById(R.id.ScoreLoseTextView);

        Button Restart = findViewById(R.id.RestartLosingButton);
        Button mainMenu = findViewById(R.id.MainMenuLosingButton);

        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(TimeAttackLoseActivity.this,R.raw.click_sound);
                mediaPlayer.start();

                ArrayList<Craft> craftList = Utils.CraftList.getCraftList();
                TimeAttackGame game = GameFactory.CreateTimeAttackGame(craftList);

                Intent intent = new Intent(TimeAttackLoseActivity.this, TimeAttackActivity.class);
                intent.putExtra("game", game);
                startActivity(intent);


            }
        });

        mainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(TimeAttackLoseActivity.this,R.raw.click_sound);
                mediaPlayer.start();
                startActivity(new Intent(TimeAttackLoseActivity.this, MainActivity.class));
            }
        });



    }
}