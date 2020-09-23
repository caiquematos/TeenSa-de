package com.example.caique.teensade.Direitos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class DireSaudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dire_saud);

        WebView webViewOne = findViewById(R.id.dire_saud_web_1);
        WebView webViewTwo = findViewById(R.id.dire_saud_web_2);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.dire_saud_text_6);
        text+= "</p></body></html>";
        webViewTwo.loadData(text, "text/html", "utf-8");

        String text5;
        text5 = "<html><body><p align=\"justify\">";
        text5+= "•\t" + getString(R.string.dire_saud_text_1);
        text5+= "<br><br>•\t" + getString(R.string.dire_saud_text_2);
        text5+= "<br><br>•\t" + getString(R.string.dire_saud_text_3);
        text5+= "<br><br>•\t" + getString(R.string.dire_saud_text_4);
        text5+= "<br><br>•\t" + getString(R.string.dire_saud_text_5);
        text5+= "</p></body></html>";
        webViewOne.loadData(text5, "text/html", "utf-8");

    }
}