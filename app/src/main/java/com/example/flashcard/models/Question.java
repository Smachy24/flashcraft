package com.example.flashcard.models;

import java.util.ArrayList;

public class Question {
    private int id;
    private String prompt;
    private String level;
    private String icon;
    private String good_answer;
    private ArrayList<String> answers;

    public Question(int id, String prompt, String level, String icon, String good_answer, ArrayList<String> answers) {
        this.id = id;
        this.prompt = prompt;
        this.level = level;
        this.icon = icon;
        this.good_answer = good_answer;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGood_answer() {
        return good_answer;
    }

    public void setGood_answer(String good_answer) {
        this.good_answer = good_answer;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", prompt='" + prompt + '\'' +
                ", level='" + level + '\'' +
                ", icon='" + icon + '\'' +
                ", good_answer='" + good_answer + '\'' +
                ", answers=" + answers +
                '}';
    }
}
