package com.example.caique.teensade.Alimentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class PorcoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porcoes);

        WebView webViewOne = findViewById(R.id.porcoes_web_1);
        WebView webViewTwo = findViewById(R.id.porcoes_web_2);
        WebView webViewThree = findViewById(R.id.porcoes_web_3);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.porcoes_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text1;
        text1 = "<html><body><p align=\"justify\">";
        text1+= getString(R.string.porcoes_text_2);
        text1+= "</p></body></html>";
        webViewTwo.loadData(text1, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.porcoes_text_3);
        text2+= "</p></body></html>";
        webViewThree.loadData(text2, "text/html", "utf-8");
        webViewThree.setBackgroundColor(Color.TRANSPARENT);
        webViewThree.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
    }
}