package com.example.caique.teensade.Puberdade.Menina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class AttentionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention);

        WebView webViewOne = findViewById(R.id.girl_attention_text_1);
        WebView webViewTwo = findViewById(R.id.girl_attention_text_2);
        WebView webViewThree = findViewById(R.id.girl_attention_text_3);
        WebView webViewFour = findViewById(R.id.girl_attention_text_4);
        WebView webViewFive = findViewById(R.id.girl_attention_text_5);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.girl_attention_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.girl_attention_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.girl_attention_text_3);
        text3+= "</p></body></html>";
        webViewThree.loadData(text3, "text/html", "utf-8");

        String text4;
        text4 = "<html><body><p align=\"justify\">";
        text4+= getString(R.string.girl_attention_text_4);
        text4+= "</p></body></html>";
        webViewFour.loadData(text4, "text/html", "utf-8");

        String text5;
        text5 = "<html><body><p align=\"justify\">";
        text5+= "•\t" + getString(R.string.girl_attention_text_5);
        text5+= "<br><br>•\t" + getString(R.string.girl_attention_text_6);
        text5+= "</p></body></html>";
        webViewFive.loadData(text5, "text/html", "utf-8");

    }
}