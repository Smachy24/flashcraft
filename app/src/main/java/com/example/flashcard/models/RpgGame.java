package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.flashcard.RpgUtils;

import java.util.ArrayList;

public class RpgGame implements Parcelable {
    private String difficulty;
    private ArrayList<RpgQuestion> questions;
    private int score;
    private RpgPlayer player = new RpgPlayer();

    public RpgGame(String difficulty)
    {
        this.player = new RpgPlayer();
        this.questions = RpgUtils.getBaseQuestions();
        this.score = 0;

        this.difficulty = difficulty;
    }

   // parcelable implementation
    protected RpgGame(Parcel in) {
        difficulty = in.readString();
        score = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(difficulty);
        dest.writeInt(score);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RpgGame> CREATOR = new Creator<RpgGame>() {
        @Override
        public RpgGame createFromParcel(Parcel in) {
            return new RpgGame(in);
        }

        @Override
        public RpgGame[] newArray(int size) {
            return new RpgGame[size];
        }
    };
    // parcelable implementation end

    public String getDifficulty() {
        return difficulty;
    }

    public ArrayList<RpgQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<RpgQuestion> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public RpgPlayer getPlayer() {
        return player;
    }

    public void setPlayer(RpgPlayer player) {
        this.player = player;
    }
}
