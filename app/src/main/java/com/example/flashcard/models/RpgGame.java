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
    private int currentQuestionIndex;
    private RpgQuestion currentQuestion;

    public RpgGame(String difficulty)
    {
        this.player = new RpgPlayer();
        this.questions = RpgUtils.getBaseQuestions();
        this.score = 0;

        this.difficulty = difficulty;

        this.currentQuestionIndex = 0;
        this.currentQuestion = questions.get(this.currentQuestionIndex);
    }

    // parcelable implementation end

    protected RpgGame(Parcel in) {
        difficulty = in.readString();
        questions = in.createTypedArrayList(RpgQuestion.CREATOR);
        score = in.readInt();
        player = in.readParcelable(RpgPlayer.class.getClassLoader());
        currentQuestionIndex = in.readInt();
        currentQuestion = in.readParcelable(RpgQuestion.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(difficulty);
        dest.writeTypedList(questions);
        dest.writeInt(score);
        dest.writeParcelable(player, flags);
        dest.writeInt(currentQuestionIndex);
        dest.writeParcelable(currentQuestion, flags);
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

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public void setCurrentQuestionIndex(int currentQuestionIndex) {
        this.currentQuestionIndex = currentQuestionIndex;
    }

    public RpgQuestion getCurrentQuestion() {
        return currentQuestion;
    }

    public void nextQuestion()
    {
        currentQuestionIndex ++;
        currentQuestion = questions.get(currentQuestionIndex);
    }

    public void incrementScoreByOne()
    {
        score ++;
    }
}
