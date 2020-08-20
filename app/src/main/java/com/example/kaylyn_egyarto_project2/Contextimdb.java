package com.example.kaylyn_egyarto_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Contextimdb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextimdb);
        Intent intent = getIntent();
        WebView view = (WebView)findViewById(R.id.imdb);
        view.setWebViewClient(new WebViewClient());
        if (intent.hasExtra("row0")) {
            System.out.println("web1");
            view.loadUrl("https://www.imdb.com/title/tt2096673/");
        }
        if (intent.hasExtra("row1")) {
            view.loadUrl("https://www.imdb.com/title/tt1386697/");
        }
        if (intent.hasExtra("row2")) {
            view.loadUrl("https://www.imdb.com/title/tt0451279/");
        }
        if (intent.hasExtra("row3")) {
            view.loadUrl("https://www.imdb.com/title/tt1477834/");
        }
        if (intent.hasExtra("row4")) {
            view.loadUrl("https://www.imdb.com/title/tt4520988/");
        }
        if (intent.hasExtra("row5")) {
            view.loadUrl("https://www.imdb.com/title/tt3794354/");
        }


    }
}
