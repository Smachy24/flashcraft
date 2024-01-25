package com.example.flashcard.models;

public class Item {
    public int quantity;
    public int image;

    public Item(int image, int quantity) {
        this.quantity = quantity;
        this.image = image;
    }

    public Item(int image) {
        this(image, 1);
    }
}
