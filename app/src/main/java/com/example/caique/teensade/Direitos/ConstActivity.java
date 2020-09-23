package com.example.caique.teensade.Direitos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class ConstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const);

        WebView webViewOne = findViewById(R.id.const_web_1);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.const_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
    }
}