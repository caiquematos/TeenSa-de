package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.example.caique.teensade.Direitos.ConstActivity;
import com.example.caique.teensade.Direitos.DeverActivity;
import com.example.caique.teensade.Direitos.DireSaudActivity;
import com.example.caique.teensade.Direitos.EstatActivity;
import com.example.caique.teensade.Direitos.LeiActivity;
import com.example.caique.teensade.Puberdade.Menina.AttentionActivity;
import com.example.caique.teensade.Puberdade.Menina.BodyActivity;
import com.example.caique.teensade.Puberdade.Menina.ChangeActivity;
import com.example.caique.teensade.Puberdade.Menina.GenitActivity;
import com.example.caique.teensade.Puberdade.Menina.HygiActivity;
import com.example.caique.teensade.Puberdade.Menina.TunerActivity;

public class DireActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dire);

        WebView webViewOne = findViewById(R.id.dire_web_1);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.dire_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        Button constitu = findViewById(R.id.dire_btn_1);
        Button estatuto = findViewById(R.id.dire_btn_2);
        Button lei = findViewById(R.id.dire_btn_3);
        Button dire_saude = findViewById(R.id.dire_btn_4);
        Button dire_dever = findViewById(R.id.dire_btn_5);

        constitu.setOnClickListener(this);
        estatuto.setOnClickListener(this);
        lei.setOnClickListener(this);
        dire_saude.setOnClickListener(this);
        dire_dever.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.dire_btn_2:
                intent = new Intent(this, EstatActivity.class);
                break;
            case R.id.dire_btn_3:
                intent = new Intent(this, LeiActivity.class);
                break;
            case R.id.dire_btn_4:
                intent = new Intent(this, DireSaudActivity.class);
                break;
            case R.id.dire_btn_5:
                intent = new Intent(this, DeverActivity.class);
                break;
            default:
                intent = new Intent(this, ConstActivity.class);
        }
        startActivity(intent);
    }
}