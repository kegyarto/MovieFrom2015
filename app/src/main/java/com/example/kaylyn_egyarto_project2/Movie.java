package com.example.kaylyn_egyarto_project2;

import android.widget.ImageView;

public class Movie {
    private String title;
    private String year;
    private Integer picture;

    public Movie(String title, String year,Integer picture) {
        this.title = title;
        this.year = year;
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getPicture() {
        return picture;
    }

    public void setPicture(Integer picture) {
        this.picture = picture;
    }
}
