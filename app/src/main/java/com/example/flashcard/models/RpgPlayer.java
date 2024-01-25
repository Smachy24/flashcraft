package com.example.flashcard.models;

import java.util.ArrayList;

public class RpgPlayer {

    // statistics
    private final int maxLifePoint = 100;
    private final int maxHungerPoint = 100;
    private final int maxPowerPoint = 100;
    private final int maxStressPoint = 100;

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
