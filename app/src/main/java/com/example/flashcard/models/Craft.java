package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Craft implements Parcelable {

    private ArrayList<ArrayList<String>>  craft;
    private int craftedItemImage;
    private String craftedItemName;

    public Craft(ArrayList<ArrayList<String>> craft, int craftedItemImage, String craftedItemName) {
        this.craft = craft;
        this.craftedItemImage = craftedItemImage;
        this.craftedItemName = craftedItemName;
    }

    protected Craft(Parcel in) {
        craftedItemImage = in.readInt();
        craftedItemName = in.readString();
        craft = new ArrayList<>();
        in.readList(craft, Integer.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(craftedItemImage);
        dest.writeString(craftedItemName);
        dest.writeList(craft);
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

    public String getItemFromIndex(int craftIndex, int itemIndex){
        return craft.get(craftIndex).get(itemIndex);
    }

    public ArrayList<ArrayList<String>> getCraft() {
        return craft;
    }

    public void setCraft(ArrayList<ArrayList<String>> craft) {
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
