package com.example.caique.teensade.Sexualidade;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class SexualiadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexualiade);

        WebView webViewOne = findViewById(R.id.sexualidade_menu_web_1);
        WebView webViewTwo = findViewById(R.id.sexualidade_menu_web_2);
        WebView webViewThree = findViewById(R.id.sexualidade_menu_web_3);
        WebView webViewFour = findViewById(R.id.sexualidade_menu_web_4);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.sexualidade_menu_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.sexualidade_menu_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.sexualidade_menu_text_3);
        text3+= "</p></body></html>";
        webViewThree.loadData(text3, "text/html", "utf-8");
        webViewThree.setBackgroundColor(Color.TRANSPARENT);
        webViewThree.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text4;
        text4 = "<html><body><p align=\"justify\">";
        text4+= getString(R.string.sexualidade_menu_text_4);
        text4+= "</p></body></html>";
        webViewFour.loadData(text4, "text/html", "utf-8");
        webViewFour.setBackgroundColor(Color.TRANSPARENT);
        webViewFour.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);
    }
}