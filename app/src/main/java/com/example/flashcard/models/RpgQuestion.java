package com.example.flashcard.models;

import java.util.ArrayList;

public class RpgQuestion {

    public RpgQuestion(String title, String description, String moral, ArrayList<RpgAnswer> answers)
    {
        this.title = title;
        this.description = description;
        this.moral = moral;
        this.answers = answers;
    }
    private String title;
    private String description;
    private String moral;
    private ArrayList<RpgAnswer> answers = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }

    public ArrayList<RpgAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<RpgAnswer> answers) {
        this.answers = answers;
    }
}
