package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class RpgQuestion implements Parcelable {


    private String title;
    private String description;
    private String moral;
    private ArrayList<RpgAnswer> answers;

    public RpgQuestion(String title, String description, String moral, ArrayList<RpgAnswer> answers)
    {
        this.title = title;
        this.description = description;
        this.moral = moral;
        this.answers = answers;
    }

    // parcelable implementation end

    protected RpgQuestion(Parcel in) {
        title = in.readString();
        description = in.readString();
        moral = in.readString();
        answers = in.createTypedArrayList(RpgAnswer.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(description);
        dest.writeString(moral);
        dest.writeTypedList(answers);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RpgQuestion> CREATOR = new Creator<RpgQuestion>() {
        @Override
        public RpgQuestion createFromParcel(Parcel in) {
            return new RpgQuestion(in);
        }

        @Override
        public RpgQuestion[] newArray(int size) {
            return new RpgQuestion[size];
        }
    };

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
