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

    // Game progress boolean
    private boolean isNetherUnlocked = false;
    private boolean isEndUnlocked = false;
    private boolean isEnderDragonBeaten = false;
    private boolean isWitherBeaten = false;
    private boolean isWardenBeaten = false;
    private boolean isWaterTempleUnlocked = false;
    private boolean isGuardianBeaten = false;
    private boolean isEatherUnlocked = false;
    private boolean isGodBeaten = false;

    public RpgGame(String difficulty)
    {
        this.player = new RpgPlayer();
        this.questions = RpgUtils.getBaseQuestions();
        this.score = 0;

        this.difficulty = difficulty;

        this.currentQuestionIndex = 0;
        this.currentQuestion = questions.get(this.currentQuestionIndex);
    }

    // parcelable implementation start
    protected RpgGame(Parcel in) {
        difficulty = in.readString();
        questions = in.createTypedArrayList(RpgQuestion.CREATOR);
        score = in.readInt();
        player = in.readParcelable(RpgPlayer.class.getClassLoader());
        currentQuestionIndex = in.readInt();
        currentQuestion = in.readParcelable(RpgQuestion.class.getClassLoader());
        isNetherUnlocked = in.readByte() != 0;
        isEndUnlocked = in.readByte() != 0;
        isEnderDragonBeaten = in.readByte() != 0;
        isWitherBeaten = in.readByte() != 0;
        isWardenBeaten = in.readByte() != 0;
        isWaterTempleUnlocked = in.readByte() != 0;
        isGuardianBeaten = in.readByte() != 0;
        isEatherUnlocked = in.readByte() != 0;
        isGodBeaten = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(difficulty);
        dest.writeTypedList(questions);
        dest.writeInt(score);
        dest.writeParcelable(player, flags);
        dest.writeInt(currentQuestionIndex);
        dest.writeParcelable(currentQuestion, flags);
        dest.writeByte((byte) (isNetherUnlocked ? 1 : 0));
        dest.writeByte((byte) (isEndUnlocked ? 1 : 0));
        dest.writeByte((byte) (isEnderDragonBeaten ? 1 : 0));
        dest.writeByte((byte) (isWitherBeaten ? 1 : 0));
        dest.writeByte((byte) (isWardenBeaten ? 1 : 0));
        dest.writeByte((byte) (isWaterTempleUnlocked ? 1 : 0));
        dest.writeByte((byte) (isGuardianBeaten ? 1 : 0));
        dest.writeByte((byte) (isEatherUnlocked ? 1 : 0));
        dest.writeByte((byte) (isGodBeaten ? 1 : 0));
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

    public boolean isNetherUnlocked() {
        return isNetherUnlocked;
    }

    public void setNetherUnlocked(boolean netherUnlocked) {
        isNetherUnlocked = netherUnlocked;
    }

    public boolean isEndUnlocked() {
        return isEndUnlocked;
    }

    public void setEndUnlocked(boolean endUnlocked) {
        isEndUnlocked = endUnlocked;
    }

    public boolean isEnderDragonBeaten() {
        return isEnderDragonBeaten;
    }

    public void setEnderDragonBeaten(boolean enderDragonBeaten) {
        isEnderDragonBeaten = enderDragonBeaten;
    }

    public boolean isWitherBeaten() {
        return isWitherBeaten;
    }

    public void setWitherBeaten(boolean witherBeaten) {
        isWitherBeaten = witherBeaten;
    }

    public boolean isWardenBeaten() {
        return isWardenBeaten;
    }

    public void setWardenBeaten(boolean wardenBeaten) {
        isWardenBeaten = wardenBeaten;
    }

    public boolean isWaterTempleUnlocked() {
        return isWaterTempleUnlocked;
    }

    public void setWaterTempleUnlocked(boolean waterTempleUnlocked) {
        isWaterTempleUnlocked = waterTempleUnlocked;
    }

    public boolean isGuardianBeaten() {
        return isGuardianBeaten;
    }

    public void setGuardianBeaten(boolean guardianBeaten) {
        isGuardianBeaten = guardianBeaten;
    }

    public boolean isEatherUnlocked() {
        return isEatherUnlocked;
    }

    public void setEatherUnlocked(boolean eatherUnlocked) {
        isEatherUnlocked = eatherUnlocked;
    }

    public boolean isGodBeaten() {
        return isGodBeaten;
    }

    public void setGodBeaten(boolean godBeaten) {
        isGodBeaten = godBeaten;
    }
}
