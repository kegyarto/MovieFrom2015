package com.example.kaylyn_egyarto_project2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import javax.security.auth.Destroyable;

public class BigImage extends AppCompatActivity {
public int check = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);
        Intent intent = getIntent();
        ImageView view = findViewById(R.id.imageView2);

        if (intent.hasExtra("row0")) {
            view.setImageLevel(R.drawable.image1);
            check = 1;
        }
        if (intent.hasExtra("row1")) {
            view.setImageResource(R.drawable.image2);
            check = 2;
        }
        if (intent.hasExtra("row2")) {
            view.setImageResource(R.drawable.image3);
            check = 3;
        }
        if (intent.hasExtra("row3")) {
            view.setImageResource(R.drawable.image4);
            check = 4;
        }
        if (intent.hasExtra("row4")) {
            view.setImageResource(R.drawable.image5);
            check = 5;
        }
        if (intent.hasExtra("row5")) {
            view.setImageResource(R.drawable.image6);
            check = 6;
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BigImage.this,ImDb.class);
                if(check ==  1){
                    System.out.println("check");
                    intent.putExtra("img1",1);
                    startActivity(intent);

                }
                if(check ==  2){
                    intent.putExtra("img2",2);
                    startActivity(intent);
                }
                if(check ==  3){
                    intent.putExtra("img3",3);
                    startActivity(intent);
                }
                if(check ==  4){
                    intent.putExtra("img4",4);
                    startActivity(intent);
                }
                if(check ==  5){
                    intent.putExtra("img5",5);
                    startActivity(intent);
                }
                if(check ==  6){
                    intent.putExtra("img6",6);
                    startActivity(intent);
                }
            }
        });

    }

    public void onBackPressed(){
        System.out.println("back was pressed");
        finish();
    }

}

