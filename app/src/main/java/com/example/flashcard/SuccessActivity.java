package com.example.flashcard;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        List<ImageView> logoAchievements = new ArrayList<>();
        List<ImageView> greenMarks = new ArrayList<>();
        List<Boolean> achievements = new ArrayList<>();
        List<TextView> titleAchievements = new ArrayList<>();


        logoAchievements.add(findViewById(R.id.netherPortalImageView));
        logoAchievements.add(findViewById(R.id.endPortalImageView));
        logoAchievements.add(findViewById(R.id.enderDragonImageView));
        logoAchievements.add(findViewById(R.id.witherBossImageView));
        logoAchievements.add(findViewById(R.id.wardenBossImageView));
        logoAchievements.add(findViewById(R.id.waterTempleImageView));
        logoAchievements.add(findViewById(R.id.guardianImageView));
        logoAchievements.add(findViewById(R.id.aetherImageView));
        logoAchievements.add(findViewById(R.id.godImageView));

        greenMarks.add(findViewById(R.id.greenMarkNetherImageView));
        greenMarks.add(findViewById(R.id.greenMarkEndImageView));
        greenMarks.add(findViewById(R.id.greenMarkEnderDragonImageView));
        greenMarks.add(findViewById(R.id.greenMarkWitherImageView));
        greenMarks.add(findViewById(R.id.greenMarkWardenImageView));
        greenMarks.add(findViewById(R.id.greenMarkWaterTempleImageView));
        greenMarks.add(findViewById(R.id.greenMarkGuardianImageView));
        greenMarks.add(findViewById(R.id.greenMarkEatherImageView));
        greenMarks.add(findViewById(R.id.greenMarkGodImageView));

        titleAchievements.add(findViewById(R.id.NethertextView));
        titleAchievements.add(findViewById(R.id.endtextView));
        titleAchievements.add(findViewById(R.id.enderDragonTextView));
        titleAchievements.add(findViewById(R.id.withertextView));
        titleAchievements.add(findViewById(R.id.wardenTextview));
        titleAchievements.add(findViewById(R.id.waterTempleTextView));
        titleAchievements.add(findViewById(R.id.aetherTextView));
        titleAchievements.add(findViewById(R.id.godtextView));


        SharedPreferences sharedPreferences = getSharedPreferences("Achievements", MODE_PRIVATE);

        achievements.add(sharedPreferences.getBoolean("isNetherUnlocked", false));
        achievements.add(sharedPreferences.getBoolean("isEndUnlocked", false));
        achievements.add(sharedPreferences.getBoolean("isEnderDragonBeaten", false));
        achievements.add(sharedPreferences.getBoolean("isWitherBeaten", false));
        achievements.add(sharedPreferences.getBoolean("isWardenBeaten", false));
        achievements.add(sharedPreferences.getBoolean("isWaterTempleUnlocked", false));
        achievements.add(sharedPreferences.getBoolean("isGuardianBeaten", false));
        achievements.add(sharedPreferences.getBoolean("isEatherUnlocked", false));
        achievements.add(sharedPreferences.getBoolean("isGodBeaten", false));

        for (int i = 0; i < greenMarks.size(); i++) {
            if (achievements.get(i) == false) {
                greenMarks.get(i).setVisibility(View.INVISIBLE);
            }
        }
        for (int i = 0; i < logoAchievements.size(); i++) {
            if (achievements.get(i) == false) {
                logoAchievements.get(i).setColorFilter(Color.parseColor("#B3B3B3"));
            }
        }
        for (int i = 0; i < titleAchievements.size(); i++) {
            if (achievements.get(i) == true) {
                titleAchievements.get(i).setTextColor(android.graphics.Color.GREEN);
            }
        }

    }
}
