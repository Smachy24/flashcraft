package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Game implements Parcelable {
    private ArrayList<Question> questions;
    private int score = 0;

    private int currentQuestionIndex = 0;

    //private Question currentQuestion;

    public Game(ArrayList<Question> questions) {
        this.questions = questions;
        //this.currentQuestion = this.questions.get(0);
    }

    public Game(Question question) {
        ArrayList<Question> singleQuestion = new ArrayList<Question>();
        questions.add(question);
        this.questions = singleQuestion;
    }


    // parcelable implementation start
    protected Game(Parcel in) {
        questions = in.createTypedArrayList(Question.CREATOR);
        score = in.readInt();
        currentQuestionIndex = in.readInt();
        //currentQuestion = in.readParcelable(Question.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(questions);
        dest.writeInt(score);
        dest.writeInt(currentQuestionIndex);
        //dest.writeParcelable(currentQuestion, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Game> CREATOR = new Creator<Game>() {
        @Override
        public Game createFromParcel(Parcel in) {
            return new Game(in);
        }

        @Override
        public Game[] newArray(int size) {
            return new Game[size];
        }
    };
    // parcelable implementation end

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }

    public void setCurrentQuestionIndex(int currentQuestionIndex) {
        this.currentQuestionIndex = currentQuestionIndex;
    }

    //public Question getCurrentQuestion() {
    //    return currentQuestion;
   // }

    //public void setCurrentQuestion(Question currentQuestion) {
    //    this.currentQuestion = currentQuestion;
    //}

    @Override
    public String toString() {
        return "Game{" +
                "currentIndex=" + currentQuestionIndex +
               // ", currentQuestionPrompt='" + currentQuestion.getPrompt() + '\'' +
                ", score='" + score + '\'' +
                ", number of question='" + questions.size() + '\'' +
                '}';
    }
}
