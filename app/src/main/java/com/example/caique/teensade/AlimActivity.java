package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.example.caique.teensade.Alimentacao.PassosActivity;
import com.example.caique.teensade.Alimentacao.PiramideActivity;
import com.example.caique.teensade.Alimentacao.PorcoesActivity;
import com.example.caique.teensade.Direitos.ConstActivity;
import com.example.caique.teensade.Direitos.DeverActivity;
import com.example.caique.teensade.Direitos.DireSaudActivity;
import com.example.caique.teensade.Direitos.EstatActivity;
import com.example.caique.teensade.Direitos.LeiActivity;

public class AlimActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alim);

        WebView webViewOne = findViewById(R.id.alim_web_1);
        WebView webViewTwo = findViewById(R.id.alim_web_2);
        WebView webViewThree = findViewById(R.id.alim_web_3);
        WebView webViewFour = findViewById(R.id.alim_web_4);
        WebView webViewFive = findViewById(R.id.alim_web_5);
        WebView webViewSix = findViewById(R.id.alim_web_6);
        WebView webViewSeven = findViewById(R.id.alim_web_7);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.alim_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.alim_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.alim_text_3);
        text3+= "</p></body></html>";
        webViewThree.loadData(text3, "text/html", "utf-8");
        webViewThree.setBackgroundColor(Color.TRANSPARENT);
        webViewThree.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text4;
        text4 = "<html><body><p align=\"justify\">";
        text4+= getString(R.string.alim_text_4);
        text4+= "</p></body></html>";
        webViewFour.loadData(text4, "text/html", "utf-8");
        webViewFour.setBackgroundColor(Color.TRANSPARENT);
        webViewFour.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text5;
        text5 = "<html><body><p align=\"justify\">";
        text5+= getString(R.string.alim_text_5);
        text5+= "</p></body></html>";
        webViewFive.loadData(text5, "text/html", "utf-8");
        webViewFive.setBackgroundColor(Color.TRANSPARENT);
        webViewFive.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text6;
        text6 = "<html><body><p align=\"justify\">";
        text6+= getString(R.string.alim_text_6);
        text6+= "</p></body></html>";
        webViewSix.loadData(text6, "text/html", "utf-8");
        webViewSix.setBackgroundColor(Color.TRANSPARENT);
        webViewSix.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text7;
        text7 = "<html><body><p align=\"justify\">";
        text7+= getString(R.string.alim_text_7);
        text7+= "</p></body></html>";
        webViewSeven.loadData(text7, "text/html", "utf-8");
        webViewSeven.setBackgroundColor(Color.TRANSPARENT);
        webViewSeven.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        Button piramide = findViewById(R.id.alim_btn_1);
        Button porcoes = findViewById(R.id.alim_btn_2);
        Button passos = findViewById(R.id.alim_btn_3);

        piramide.setOnClickListener(this);
        porcoes.setOnClickListener(this);
        passos.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.alim_btn_2:
                intent = new Intent(this, PorcoesActivity.class);
                break;
            case R.id.alim_btn_3:
                intent = new Intent(this, PassosActivity.class);
                break;
            default:
                intent = new Intent(this, PiramideActivity.class);
        }
        startActivity(intent);
    }
}