package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class RpgPlayer implements Parcelable {

    // statistics
    private int maxLifePoint = 100;
    private int maxHungerPoint = 100;
    private int maxPowerPoint = 100;
    private int maxStressPoint = 100;

    private int currentLifePoint;
    private int currentHungerPoint;
    private int currentPowerPoint;
    private int currentStressPoint;


    // resources
    private int amountIronIngot = 0;
    private int amountStick = 0;
    private int amountCobblestone = 0;
    private int amountWheat = 0;

    public RpgPlayer() {
        this.currentLifePoint = 50;
        this.currentHungerPoint = 50;
        this.currentPowerPoint = 50;
        this.currentStressPoint = 50;
    }

    // parcelable implementation
    protected RpgPlayer(Parcel in) {
        maxLifePoint = in.readInt();
        maxHungerPoint = in.readInt();
        maxPowerPoint = in.readInt();
        maxStressPoint = in.readInt();
        currentLifePoint = in.readInt();
        currentHungerPoint = in.readInt();
        currentPowerPoint = in.readInt();
        currentStressPoint = in.readInt();
        amountIronIngot = in.readInt();
        amountStick = in.readInt();
        amountCobblestone = in.readInt();
        amountWheat = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(maxLifePoint);
        dest.writeInt(maxHungerPoint);
        dest.writeInt(maxPowerPoint);
        dest.writeInt(maxStressPoint);
        dest.writeInt(currentLifePoint);
        dest.writeInt(currentHungerPoint);
        dest.writeInt(currentPowerPoint);
        dest.writeInt(currentStressPoint);
        dest.writeInt(amountIronIngot);
        dest.writeInt(amountStick);
        dest.writeInt(amountCobblestone);
        dest.writeInt(amountWheat);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RpgPlayer> CREATOR = new Creator<RpgPlayer>() {
        @Override
        public RpgPlayer createFromParcel(Parcel in) {
            return new RpgPlayer(in);
        }

        @Override
        public RpgPlayer[] newArray(int size) {
            return new RpgPlayer[size];
        }
    };
    // parcelable implementation end
    public int getCurrentLifePoint() {
        return currentLifePoint;
    }

    public void setCurrentLifePoint(int currentLifePoint) {
        this.currentLifePoint = currentLifePoint;
    }

    public int getCurrentHungerPoint() {
        return currentHungerPoint;
    }

    public void setCurrentHungerPoint(int currentHungerPoint) {
        this.currentHungerPoint = currentHungerPoint;
    }

    public int getCurrentPowerPoint() {
        return currentPowerPoint;
    }

    public void setCurrentPowerPoint(int currentPowerPoint) {
        this.currentPowerPoint = currentPowerPoint;
    }

    public int getCurrentStressPoint() {
        return currentStressPoint;
    }

    public void setCurrentStressPoint(int currentStressPoint) {
        this.currentStressPoint = currentStressPoint;
    }

    public int getAmountIronIngot() {
        return amountIronIngot;
    }

    public void setAmountIronIngot(int amountIronIngot) {
        this.amountIronIngot = amountIronIngot;
    }

    public int getAmountStick() {
        return amountStick;
    }

    public void setAmountStick(int amountStick) {
        this.amountStick = amountStick;
    }

    public int getAmountCobblestone() {
        return amountCobblestone;
    }

    public void setAmountCobblestone(int amountCobblestone) {
        this.amountCobblestone = amountCobblestone;
    }

    public int getAmountWheat() {
        return amountWheat;
    }

    public void setAmountWheat(int amountWheat) {
        this.amountWheat = amountWheat;
    }
}
