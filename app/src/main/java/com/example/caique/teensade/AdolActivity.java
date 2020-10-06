package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.example.caique.teensade.Adolescencia.ConhecerActivity;
import com.example.caique.teensade.Utilidades.TypefaceUtil;

public class AdolActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mAdolBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adol);

        WebView webViewOne = findViewById(R.id.adol_web_1);
        WebView webViewTwo = findViewById(R.id.adol_web_2);
        WebView webViewThree = findViewById(R.id.adol_web_3);

        String pish = "<html><head><style type=\"text/css\">@font-face {font-family: 'MyFont';src: url(\"file:///android_asset/fonts/ComingSoon.ttf\")}body {font-family: 'MyFont';font-size: medium;text-align: justify;}</style></head><body>";
        String pas = "</body></html>";

        String text1 = getString(R.string.adol_text_1);
        String myHtmlString = pish + text1 + pas;
        webViewOne.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2 = getString(R.string.adol_text_2);
        text2+="<br><br>•\tPré-adolescência – dos 10 aos 14 anos;";
        text2+="<br><br>•\tAdolescência – dos 15 aos 19 anos completos;";
        text2+="<br><br>•\tJuventude – dos 15 aos 24 anos.</p>";
        myHtmlString = pish + text2 + pas;
        webViewTwo.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.adol_text_3);
        text3+= "</p>";
        myHtmlString = pish + text3 + pas;
        webViewThree.loadDataWithBaseURL(null,myHtmlString, "text/html", "UTF-8", null);
        webViewThree.setBackgroundColor(Color.TRANSPARENT);
        webViewThree.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        mAdolBtn = findViewById(R.id.adol_btn);
        mAdolBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.adol_btn:
                Intent intent = new Intent(this, ConhecerActivity.class);
                startActivity(intent);
                break;
        }
    }
}