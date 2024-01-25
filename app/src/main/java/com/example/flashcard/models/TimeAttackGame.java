package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class TimeAttackGame implements Parcelable {
    private ArrayList<Craft> crafts;
    private int currentCraftIndex = 0;
    public TimeAttackGame(ArrayList<Craft> crafts){
        this.crafts = crafts;
    }

    protected TimeAttackGame(Parcel in) {
        crafts = in.createTypedArrayList(Craft.CREATOR);
        currentCraftIndex = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(crafts);
        dest.writeInt(currentCraftIndex);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<TimeAttackGame> CREATOR = new Creator<TimeAttackGame>() {
        @Override
        public TimeAttackGame createFromParcel(Parcel in) {
            return new TimeAttackGame(in);
        }

        @Override
        public TimeAttackGame[] newArray(int size) {
            return new TimeAttackGame[size];
        }
    };

    public ArrayList<Craft> getCrafts() {
        return crafts;
    }

    public void setCrafts(ArrayList<Craft> crafts) {
        this.crafts = crafts;
    }

    public int getCurrentCraftIndex() {
        return currentCraftIndex;
    }

    public void setCurrentCraftIndex(int currentCraftIndex) {
        this.currentCraftIndex = currentCraftIndex;
    }
}
