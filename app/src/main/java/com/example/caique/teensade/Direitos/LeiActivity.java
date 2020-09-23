package com.example.caique.teensade.Direitos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class LeiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lei);

        WebView webViewOne = findViewById(R.id.lei_web_1);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.lei_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
    }
}