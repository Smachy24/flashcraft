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

    // Start parcelable implementation
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

    // End parcelable implementation


    /**
     * Get time attack game crafts
     * @return ArrayList<Craft> : Crafts of the game
     */
    public ArrayList<Craft> getCrafts() {
        return crafts;
    }


    /**
     * Set list of game's crafts
     * @param crafts : New list of craft
     */
    public void setCrafts(ArrayList<Craft> crafts) {
        this.crafts = crafts;
    }


    /**
     * Return current craft index
     * @return int : current craft index
     */
    public int getCurrentCraftIndex() {
        return currentCraftIndex;
    }


    /**
     * Set current craft index
     * @param currentCraftIndex : Current craft index
     */
    public void setCurrentCraftIndex(int currentCraftIndex) {
        this.currentCraftIndex = currentCraftIndex;
    }
}
