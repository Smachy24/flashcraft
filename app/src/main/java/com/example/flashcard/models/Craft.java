package com.example.flashcard.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Contains info of the wanted crafted item
 */
public class Craft implements Parcelable {

    private ArrayList<ArrayList<String>>  craft;
    private int craftedItemImage;
    private String craftedItemName;

    public Craft(ArrayList<ArrayList<String>> craft, int craftedItemImage, String craftedItemName) {
        this.craft = craft;
        this.craftedItemImage = craftedItemImage;
        this.craftedItemName = craftedItemName;
    }

    // Start parcelable implementation

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

    // End parcelable implementation

    /**
     * Get one item from the craft
     * @param craftIndex : index of the variation of the craft
     * @param itemIndex : index of the wanted item from the variation of the craft
     * @return String : item name
     */
    public String getItemFromIndex(int craftIndex, int itemIndex){
        return craft.get(craftIndex).get(itemIndex);
    }


    /**
     * Get list of crafts
     * @return ArrayList<Arraylist<String>> : crafts list
     */
    public ArrayList<ArrayList<String>> getCraft() {
        return craft;
    }


    /**
     * Set list of craft
     * @param craft : new list of crafts
     */
    public void setCraft(ArrayList<ArrayList<String>> craft) {
        this.craft = craft;
    }


    /**
     * Return image name of the wanted item
     * @return : crafted item image name
     */
    public int getCraftedItemImage() {
        return craftedItemImage;
    }


    /**
     * Modify image name of the wanted item
     * @param craftedItemImage : new image name
     */
    public void setCraftedItemImage(int craftedItemImage) {
        this.craftedItemImage = craftedItemImage;
    }

    /**
     * Return name of the wanted item
     * @return : crafted item name
     */
    public String getCraftedItemName() {
        return craftedItemName;
    }

    /**
     * Modify name of wanted item
     * @param craftedItemName  : new name
     */
    public void setCraftedItemName(String craftedItemName) {
        this.craftedItemName = craftedItemName;
    }
}
