package com.example.recyclerapp;

import android.widget.ImageView;
import android.widget.TextView;

public class VaccineModel {
    private String title;
    private int image;

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public VaccineModel(String title, int image) {
        this.title = title;
        this.image = image;
    }
}
