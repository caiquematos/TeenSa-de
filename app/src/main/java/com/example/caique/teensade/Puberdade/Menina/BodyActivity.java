package com.example.caique.teensade.Puberdade.Menina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class BodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_activiy);

        WebView webViewOne = findViewById(R.id.girl_body_web_1);
        WebView webViewTwo = findViewById(R.id.girl_body_web_2);
        WebView webViewThree = findViewById(R.id.girl_body_web_3);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.girl_body_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.girl_body_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.girl_body_text_3);
        text3+= "</p></body></html>";
        webViewThree.loadData(text3, "text/html", "utf-8");
    }
}