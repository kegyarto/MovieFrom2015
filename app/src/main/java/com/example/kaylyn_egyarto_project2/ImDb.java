package com.example.kaylyn_egyarto_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class ImDb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_im_db);
        Intent intent = getIntent();
        WebView view = (WebView)findViewById(R.id.web);
        view.setWebViewClient(new WebViewClient());
        if (intent.hasExtra("img1")) {
            System.out.println("web1");
            view.loadUrl("https://www.imdb.com/title/tt2096673/");
        }
        if (intent.hasExtra("img2")) {
            view.loadUrl("https://www.imdb.com/title/tt1386697/");
        }
        if (intent.hasExtra("img3")) {
            view.loadUrl("https://www.imdb.com/title/tt0451279/");
        }
        if (intent.hasExtra("img4")) {
            view.loadUrl("https://www.imdb.com/title/tt1477834/");
        }
        if (intent.hasExtra("img5")) {
            view.loadUrl("https://www.imdb.com/title/tt4520988/");
        }
        if (intent.hasExtra("img6")) {
            view.loadUrl("https://www.imdb.com/title/tt3794354/");
        }

    }
}
