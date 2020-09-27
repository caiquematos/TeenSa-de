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

public class AdolActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mAdolBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adol);

        WebView webViewOne = findViewById(R.id.adol_web_1);
        WebView webViewTwo = findViewById(R.id.adol_web_2);
        WebView webViewThree = findViewById(R.id.adol_web_3);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.adol_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.adol_text_2);
        text2+="<br><br>•\tPré-adolescência – dos 10 aos 14 anos;";
        text2+="<br><br>•\tAdolescência – dos 15 aos 19 anos completos;";
        text2+="<br><br>•\tJuventude – dos 15 aos 24 anos.";
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.adol_text_3);
        text3+= "</p></body></html>";
        webViewThree.loadData(text3, "text/html", "utf-8");
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