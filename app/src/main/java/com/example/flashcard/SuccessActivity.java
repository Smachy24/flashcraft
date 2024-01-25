package com.example.flashcard;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        ImageView greenMarkNetherImageView = findViewById(R.id.greenMarkNetherImageView);
        ImageView greenMarkEndImageView = findViewById(R.id.greenMarkEndImageView);
        ImageView greenMarkEnderDragonImageView = findViewById(R.id.greenMarkEnderDragonImageView);
        ImageView greenMarkWitherImageView = findViewById(R.id.greenMarkWitherImageView);
        ImageView greenMarkWardenImageView = findViewById(R.id.greenMarkWardenImageView);
        ImageView greenMarkWaterTempleImageView = findViewById(R.id.greenMarkWaterTempleImageView);
        ImageView greenMarkGuardianImageView = findViewById(R.id.greenMarkGuardianImageView);
        ImageView greenMarkAetherImageView = findViewById(R.id.greenMarkEatherImageView);
        ImageView greenMarkGodImageView = findViewById(R.id.greenMarkGodImageView);
    }

}