package com.example.caique.teensade.Direitos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class EstatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estat);

        WebView webViewTwo = findViewById(R.id.estatu_web_2);
        WebView webViewThree = findViewById(R.id.estatu_web_3);

        String text_1;
        text_1 = "<html><body><p align=\"justify\">";
        text_1+= getString(R.string.const_text_2);
        text_1+= "</p></body></html>";
        webViewTwo.loadData(text_1, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text_2;
        text_2 = "<html><body><p align=\"justify\">";
        text_2+= getString(R.string.const_text_3);
        text_2+= "</p></body></html>";
        webViewThree.loadData(text_2, "text/html", "utf-8");
        webViewThree.setBackgroundColor(Color.TRANSPARENT);
        webViewThree.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
    }
}