package com.androidstudiomanju.vaccinesapp;

public class VaccineModel {
    private String title;
    private int image;
// constructor
    public VaccineModel(String title, int image) {
        this.title = title;
        this.image = image;
    }
//getter methods
    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
