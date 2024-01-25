package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Game implements Parcelable {
    private ArrayList<Question> questions;
    private int score = 0;

    private int currentQuestionIndex = 0;

    private String difficulty;

    private ArrayList<Craft> crafts;

    //private Question currentQuestion;

    public Game(ArrayList<Question> questions, String difficulty) {
        this.questions = questions;
        //this.currentQuestion = this.questions.get(0);

        this.difficulty = difficulty;

    }

    public Game(Question question, String difficulty) {
        ArrayList<Question> singleQuestion = new ArrayList<Question>();
        questions.add(question);
        this.questions = singleQuestion;

        this.difficulty = difficulty;
    }




    // parcelable implementation start


    protected Game(Parcel in) {
        questions = in.createTypedArrayList(Question.CREATOR);
        score = in.readInt();
        currentQuestionIndex = in.readInt();
        difficulty = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(questions);
        dest.writeInt(score);
        dest.writeInt(currentQuestionIndex);
        dest.writeString(difficulty);
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

    public ArrayList<Craft> getCrafts() {
        return crafts;
    }

    public void setCrafts(ArrayList<Craft> crafts) {
        this.crafts = crafts;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
