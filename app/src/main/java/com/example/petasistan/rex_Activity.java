package com.example.petasistan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rex_Activity extends AppCompatActivity {


    WebView webilanView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rex);

        baglailan();
        yukleilan();
        webilanView.setWebViewClient(new WebViewClient());


    }




    public void baglailan(){

        webilanView = findViewById(R.id.ilanweb);

    }

    public void yukleilan(){

        webilanView.loadUrl("https://en.wikipedia.org/wiki/Rex_rabbit");
        webilanView.getSettings().setJavaScriptEnabled(true);

    }



}