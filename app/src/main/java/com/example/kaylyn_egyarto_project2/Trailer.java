package com.example.kaylyn_egyarto_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Trailer extends AppCompatActivity {
    WebView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trailer);
        Intent intent = getIntent();
        view = (WebView)findViewById(R.id.trailer);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebChromeClient(new WebChromeClient());
        if (intent.hasExtra("row0")) {
            System.out.println("ROW 0!!!!!!!!!");
            view.loadUrl("https://www.youtube.com/watch?v=yRUAzGQ3nSY");
        }
        if (intent.hasExtra("row1")) {
            view.loadUrl("https://www.youtube.com/watch?v=CmRih_VtVAs");
        }
        if (intent.hasExtra("row2")) {
            view.loadUrl("https://www.youtube.com/watch?v=1Q8fG0TtVAY");
        }
        if (intent.hasExtra("row3")) {
            view.loadUrl("https://www.youtube.com/watch?v=WDkg3h8PCVU");
        }
        if (intent.hasExtra("row4")) {
            view.loadUrl("https://www.youtube.com/watch?v=Zi4LMpSDccc");
        }
        if (intent.hasExtra("row5")) {
            view.loadUrl("https://www.youtube.com/watch?v=szby7ZHLnkA");
        }

    }
    public void onBackPressed(){
        System.out.println("back was pressed");

        finish();

    }

    @Override
    public void finish() {
        super.finish();
    }
}
