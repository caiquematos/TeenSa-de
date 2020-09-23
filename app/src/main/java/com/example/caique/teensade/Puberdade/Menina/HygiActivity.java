package com.example.caique.teensade.Puberdade.Menina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class HygiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hygi);

        WebView webViewOne = findViewById(R.id.girl_hygi_text_1);
        WebView webViewTwo = findViewById(R.id.girl_hygi_text_2);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.girl_hygi_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");

        String text5;
        text5 = "<html><body><p align=\"justify\">";
        text5+= "•\t" + getString(R.string.girl_hygi_text_2);
        text5+= "<br><br>•\t" + getString(R.string.girl_hygi_text_3);
        text5+= "<br><br>•\t" + getString(R.string.girl_hygi_text_4);
        text5+= "<br><br>•\t" + getString(R.string.girl_hygi_text_5);
        text5+= "</p></body></html>";
        webViewTwo.loadData(text5, "text/html", "utf-8");
    }
}