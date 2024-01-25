package com.example.flashcard.models;

import com.example.flashcard.RpgUtils;

import java.util.ArrayList;

public class RpgGame {
    private String difficulty;
    private ArrayList<RpgQuestion> questions;
    private int score;
    private RpgPlayer player;

    public RpgGame(String difficulty)
    {
        this.player = new RpgPlayer();
        this.questions = RpgUtils.getBaseQuestions();
        this.score = 0;

        this.difficulty = difficulty;
    }


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
