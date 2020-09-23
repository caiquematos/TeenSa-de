package com.example.caique.teensade.Puberdade.Menino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class BodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        WebView webViewOne = findViewById(R.id.boy_body_web_1);
        WebView webViewTwo = findViewById(R.id.boy_body_web_2);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.boy_body_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.boy_body_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");
    }
}