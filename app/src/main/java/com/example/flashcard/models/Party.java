package com.example.flashcard.models;

import java.util.ArrayList;

public class Party {
    private ArrayList<Question> questions;

    public Party(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
