package com.example.flashcard.models;

import java.util.ArrayList;

public class Game {
    private ArrayList<Question> questions;

    public Game(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
