package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Craft implements Parcelable {

    private ArrayList<Integer> craft;
    private int craftedItemImage;
    private String  craftedItemName;


    public Craft(ArrayList<Integer> craft, int craftedItem, String craftedItemName) {
        this.craft = craft;
        this.craftedItemImage = craftedItem;
        this.craftedItemName = craftedItemName;
    }


    protected Craft(Parcel in) {
        craftedItemImage = in.readInt();
        craftedItemName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(craftedItemImage);
        dest.writeString(craftedItemName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Craft> CREATOR = new Creator<Craft>() {
        @Override
        public Craft createFromParcel(Parcel in) {
            return new Craft(in);
        }

        @Override
        public Craft[] newArray(int size) {
            return new Craft[size];
        }
    };

    public int getItemFromIndex(int i){
        return craft.get(i);
    }

    public ArrayList<Integer> getCraft() {
        return craft;
    }

    public void setCraft(ArrayList<Integer> craft) {
        this.craft = craft;
    }

    public int getCraftedItemImage() {
        return craftedItemImage;
    }

    public void setCraftedItemImage(int craftedItemImage) {
        this.craftedItemImage = craftedItemImage;
    }

    public String getCraftedItemName() {
        return craftedItemName;
    }

    public void setCraftedItemName(String craftedItemName) {
        this.craftedItemName = craftedItemName;
    }
}
