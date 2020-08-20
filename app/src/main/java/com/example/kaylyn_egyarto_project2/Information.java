package com.example.kaylyn_egyarto_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent intent = getIntent();
        TextView release = (TextView)findViewById(R.id.release);
        TextView duration = (TextView)findViewById(R.id.duration);
        TextView director = (TextView)findViewById(R.id.directors);
        TextView stars = (TextView)findViewById(R.id.stars);
        TextView rating1 = (TextView)findViewById(R.id.rating1);
        TextView rating2 = (TextView)findViewById(R.id.rating2);


        if (intent.hasExtra("row0")) {

            release.setText("Release:  2015");
            duration.setText("Duration:  1hr 42min");
            director.setText("Directors:  Pete Docter, Ronnie Del Carmen ");
            stars.setText("Stars:  Amy Poehler, Bill Hader, Lewis Black ");
            rating1.setText("IMDB Rating:  8.2/10");
            rating2.setText("User Rating: 8.7/10");
        }

        if (intent.hasExtra("row1")) {

            release.setText("Release:  2016");
            duration.setText("Duration:  2hr 3min");
            director.setText("Directors:  David Aver");
            stars.setText("Stars:  Will Smith, Jared Leto, Margot Robbie ");
            rating1.setText("IMDB Rating:  6/10");
            rating2.setText("User Rating: 6.0/10");

        }
        if (intent.hasExtra("row2")) {

            release.setText("Release:  2017");
            duration.setText("Duration:  2hr 27min");
            director.setText("Directors:   Patty Jenkins");
            stars.setText("Stars:  Gal Gadot, Chris Pine, Robin Wright  ");
            rating1.setText("IMDB Rating:  7.4/10");
            rating2.setText("User Rating: 7.6/10");

        }
        if (intent.hasExtra("row3")) {

            release.setText("Release:  2018");
            duration.setText("Duration:  2hr 23min");
            director.setText("Directors:   James Wan ");
            stars.setText("Stars:  Jason Momoa, Amber Heard, Willem Dafoe ");
            rating1.setText("IMDB Rating:  7/10");
            rating2.setText("User Rating: 7.0/10");


        }
        if (intent.hasExtra("row4")) {

            release.setText("Release:  2019");
            duration.setText("Duration:  1hr 43min");
            director.setText("Directors:   Chris Buck, Jennifer Lee");
            stars.setText("Stars:  Kristen Bell, Idina Menzel, Josh Gad ");
            rating1.setText("IMDB Rating:  7.1/10");
            rating2.setText("User Rating: 6.9/10");


        }
        if (intent.hasExtra("row5")) {

            release.setText("Release:  2020");
            duration.setText("Duration:  1hr 39min");
            director.setText("Directors: Jeff Fowler");
            stars.setText("Stars:  Ben Schwartz, James Marsden, Jim Carrey ");
            rating1.setText("IMDB Rating:  6.8/10");
            rating2.setText("User Rating: 8.5/10");


        }
    }
}
