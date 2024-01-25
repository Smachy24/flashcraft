package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

public class RpgAnswer implements Parcelable {

    public RpgAnswer(String prompt,
                     int lifeModification, int hungerModification, int powerModification, int stressModification,
                     int ironIngotModification, int stickModification, int cobblestoneModification, int wheatModification)
    {
        this.prompt = prompt;
        this.lifeModification = lifeModification;
        this.hungerModification = hungerModification;
        this.powerModification = powerModification;
        this.stressModification = stressModification;

        this.ironIngotModification = ironIngotModification;
        this.stickModification = stickModification;
        this.cobblestoneModification = cobblestoneModification;
        this.wheatModification = wheatModification;
    }
    private String prompt;
    private int lifeModification;
    private int hungerModification;
    private int powerModification;
    private int stressModification;
    private int ironIngotModification;
    private int stickModification;
    private int cobblestoneModification;
    private int wheatModification;

    // parcelable implementation end

    protected RpgAnswer(Parcel in) {
        prompt = in.readString();
        lifeModification = in.readInt();
        hungerModification = in.readInt();
        powerModification = in.readInt();
        stressModification = in.readInt();
        ironIngotModification = in.readInt();
        stickModification = in.readInt();
        cobblestoneModification = in.readInt();
        wheatModification = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(prompt);
        dest.writeInt(lifeModification);
        dest.writeInt(hungerModification);
        dest.writeInt(powerModification);
        dest.writeInt(stressModification);
        dest.writeInt(ironIngotModification);
        dest.writeInt(stickModification);
        dest.writeInt(cobblestoneModification);
        dest.writeInt(wheatModification);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RpgAnswer> CREATOR = new Creator<RpgAnswer>() {
        @Override
        public RpgAnswer createFromParcel(Parcel in) {
            return new RpgAnswer(in);
        }

        @Override
        public RpgAnswer[] newArray(int size) {
            return new RpgAnswer[size];
        }
    };

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public int getLifeModification() {
        return lifeModification;
    }

    public void setLifeModification(int lifeModification) {
        this.lifeModification = lifeModification;
    }

    public int getHungerModification() {
        return hungerModification;
    }

    public void setHungerModification(int hungerModification) {
        this.hungerModification = hungerModification;
    }

    public int getPowerModification() {
        return powerModification;
    }

    public void setPowerModification(int powerModification) {
        this.powerModification = powerModification;
    }

    public int getStressModification() {
        return stressModification;
    }

    public void setStressModification(int stressModification) {
        this.stressModification = stressModification;
    }

    public int getIronIngotModification() {
        return ironIngotModification;
    }

    public void setIronIngotModification(int ironIngotModification) {
        this.ironIngotModification = ironIngotModification;
    }

    public int getStickModification() {
        return stickModification;
    }

    public void setStickModification(int stickModification) {
        this.stickModification = stickModification;
    }

    public int getCobblestoneModification() {
        return cobblestoneModification;
    }

    public void setCobblestoneModification(int cobblestoneModification) {
        this.cobblestoneModification = cobblestoneModification;
    }

    public int getWheatModification() {
        return wheatModification;
    }

    public void setWheatModification(int wheatModification) {
        this.wheatModification = wheatModification;
    }
}
