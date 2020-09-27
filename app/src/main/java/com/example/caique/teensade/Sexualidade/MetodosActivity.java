package com.example.caique.teensade.Sexualidade;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.caique.teensade.R;

public class MetodosActivity extends AppCompatActivity implements View.OnClickListener {
    private AlertDialog.Builder mBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodos);

        WebView webViewOne = findViewById(R.id.metodos_menu_web_1);
        WebView webViewTwo = findViewById(R.id.metodos_menu_web_2);
        WebView webViewThree = findViewById(R.id.metodos_menu_web_3);
        WebView webViewFour = findViewById(R.id.metodos_menu_web_4);
        WebView webViewFive = findViewById(R.id.metodos_menu_web_5);
        WebView webViewSix = findViewById(R.id.metodos_menu_web_6);
        WebView webViewSeven = findViewById(R.id.metodos_menu_web_7);
        WebView webViewEight = findViewById(R.id.metodos_menu_web_8);

        String text;
        text = "<html><body><p align=\"justify\">";
        text+= getString(R.string.metodos_menu_text_1);
        text+= "</p></body></html>";
        webViewOne.loadData(text, "text/html", "utf-8");
        webViewOne.setBackgroundColor(Color.TRANSPARENT);
        webViewOne.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text2;
        text2 = "<html><body><p align=\"justify\">";
        text2+= getString(R.string.metodos_menu_text_2);
        text2+= "</p></body></html>";
        webViewTwo.loadData(text2, "text/html", "utf-8");
        webViewTwo.setBackgroundColor(Color.TRANSPARENT);
        webViewTwo.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text3;
        text3 = "<html><body><p align=\"justify\">";
        text3+= getString(R.string.metodos_menu_text_3);
        text3+= "</p></body></html>";
        webViewThree.loadData(text3, "text/html", "utf-8");
        webViewThree.setBackgroundColor(Color.TRANSPARENT);
        webViewThree.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text4;
        text4 = "<html><body><p align=\"justify\">";
        text4+= getString(R.string.metodos_menu_text_4);
        text4+= "</p></body></html>";
        webViewFour.loadData(text4, "text/html", "utf-8");
        webViewFour.setBackgroundColor(Color.TRANSPARENT);
        webViewFour.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text5;
        text5 = "<html><body><p align=\"justify\">";
        text5+= getString(R.string.metodos_menu_text_5);
        text5+= "</p></body></html>";
        webViewFive.loadData(text5, "text/html", "utf-8");
        webViewFive.setBackgroundColor(Color.TRANSPARENT);
        webViewFive.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text6;
        text6 = "<html><body><p align=\"justify\">";
        text6+= getString(R.string.metodos_menu_text_6);
        text6+= "</p></body></html>";
        webViewSix.loadData(text6, "text/html", "utf-8");
        webViewSix.setBackgroundColor(Color.TRANSPARENT);
        webViewSix.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text7;
        text7 = "<html><body><p align=\"justify\">";
        text7+= getString(R.string.metodos_menu_text_7);
        text7+= "</p></body></html>";
        webViewSeven.loadData(text7, "text/html", "utf-8");
        webViewSeven.setBackgroundColor(Color.TRANSPARENT);
        webViewSeven.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        String text8;
        text8 = "<html><body><p align=\"justify\">";
        text8+= getString(R.string.metodos_menu_text_8);
        text8+= "</p></body></html>";
        webViewEight.loadData(text4, "text/html", "utf-8");
        webViewEight.setBackgroundColor(Color.TRANSPARENT);
        webViewEight.setLayerType(WebView.LAYER_TYPE_SOFTWARE, null);

        CardView img1 = findViewById(R.id.sexu_img_1);
        CardView img2 = findViewById(R.id.sexu_img_2);
        CardView img3 = findViewById(R.id.sexu_img_3);
        CardView img4 = findViewById(R.id.sexu_img_4);
        CardView img5 = findViewById(R.id.sexu_img_5);
        CardView img6 = findViewById(R.id.sexu_img_6);
        CardView img7 = findViewById(R.id.sexu_img_7);
        CardView img8 = findViewById(R.id.sexu_img_8);
        CardView img9 = findViewById(R.id.sexu_img_9);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);

        mBuilder = new AlertDialog.Builder(this);
    }

    @Override
    public void onClick(View view) {
        int title;
        int message;
        switch (view.getId()) {
            case R.id.sexu_img_2:
                title = R.string.sexu_2_title;
                message = R.string.sexu_2_message;
                break;
            case R.id.sexu_img_3:
                title = R.string.sexu_3_title;
                message = R.string.sexu_3_message;
                break;
            case R.id.sexu_img_4:
                title = R.string.sexu_4_title;
                message = R.string.sexu_4_message;
                break;
            case R.id.sexu_img_5:
                title = R.string.sexu_5_title;
                message = R.string.sexu_5_message;
                break;
            case R.id.sexu_img_6:
                title = R.string.sexu_6_title;
                message = R.string.sexu_6_message;
                break;
            case R.id.sexu_img_7:
                title = R.string.sexu_7_title;
                message = R.string.sexu_7_message;
                break;
            case R.id.sexu_img_8:
                title = R.string.sexu_8_title;
                message = R.string.sexu_8_message;
                break;
            case R.id.sexu_img_9:
                title = R.string.sexu_9_title;
                message = R.string.sexu_9_message;
                break;
            default:
                title = R.string.sexu_1_title;
                message = R.string.sexu_1_message;
        }
        mBuilder.setMessage(message);
        mBuilder.setTitle(title);
        AlertDialog dialog = mBuilder.create();
        dialog.show();
    }
}