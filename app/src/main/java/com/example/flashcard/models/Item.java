package com.example.flashcard.models;

/**
 *  Contains info of one item
 */
public class Item {
    public int quantity;
    public int image;
    public String name;

    public Item(int image, String name, int quantity) {
        this.quantity = quantity;
        this.image = image;
        this.name = name;
    }

    public Item(int image, String name) {
        this(image, name, 1);
    }
}
