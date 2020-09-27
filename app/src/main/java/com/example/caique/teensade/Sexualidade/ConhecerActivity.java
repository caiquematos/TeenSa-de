package com.example.caique.teensade.Sexualidade;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class ConhecerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conhecer2);

        WebView webViewOne = findViewById(R.id.conhecer_menu_web_1);
        WebView webViewTwo = findViewById(R.id.conhecer_menu_web_2);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.conhecer_menu_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.conhecer_menu_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
    }
}