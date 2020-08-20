package com.example.kaylyn_egyarto_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Wiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiki);
        Intent intent = getIntent();
        WebView view = (WebView)findViewById(R.id.wiki);
        view.setWebViewClient(new WebViewClient());
        if (intent.hasExtra("row0")) {

            view.loadUrl("https://en.wikipedia.org/wiki/Pete_Docter");
        }
        if (intent.hasExtra("row1")) {
            view.loadUrl("https://en.wikipedia.org/wiki/David_Ayer");
        }
        if (intent.hasExtra("row2")) {
            view.loadUrl("https://en.wikipedia.org/wiki/Patty_Jenkins");
        }
        if (intent.hasExtra("row3")) {
            view.loadUrl("https://en.wikipedia.org/wiki/James_Wan");
        }
        if (intent.hasExtra("row4")) {
            view.loadUrl("https://en.wikipedia.org/wiki/Jennifer_Lee_(filmmaker)");
        }
        if (intent.hasExtra("row5")) {
            view.loadUrl("https://en.wikipedia.org/wiki/Jeff_Fowler");
        }


    }
}
