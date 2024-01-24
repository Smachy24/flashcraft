package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Question implements Parcelable {
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

    protected Question(Parcel in) {
        id = in.readInt();
        prompt = in.readString();
        level = in.readString();
        icon = in.readString();
        good_answer = in.readString();
        answers = in.createStringArrayList();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(prompt);
        dest.writeString(level);
        dest.writeString(icon);
        dest.writeString(good_answer);
        dest.writeStringList(answers);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Question> CREATOR = new Creator<Question>() {
        @Override
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        @Override
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };

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
