package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Puberdade.Menino.AttentionActivity;
import com.example.caique.teensade.Puberdade.Menino.BodyActivity;
import com.example.caique.teensade.Puberdade.Menino.ChangeActivity;
import com.example.caique.teensade.Puberdade.Menino.GenitActivity;
import com.example.caique.teensade.Puberdade.Menino.HygiActivity;
import com.example.caique.teensade.Puberdade.Menino.TannerActivity;

public class IstsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ists);

        CardView ist1 = findViewById(R.id.ists_card_1_id);
        CardView ist2 = findViewById(R.id.ists_card_2_id);
        CardView ist3 = findViewById(R.id.ists_card_3_id);
        CardView ist4 = findViewById(R.id.ists_card_4_id);
        CardView ist5 = findViewById(R.id.ists_card_5_id);
        CardView ist6 = findViewById(R.id.ists_card_6_id);
        CardView ist7 = findViewById(R.id.ists_card_7_id);
        CardView ist8 = findViewById(R.id.ists_card_8_id);
        CardView ist9 = findViewById(R.id.ists_card_9_id);
        CardView ist10 = findViewById(R.id.ists_card_10_id);
        ist1.setOnClickListener(this);
        ist2.setOnClickListener(this);
        ist3.setOnClickListener(this);
        ist4.setOnClickListener(this);
        ist5.setOnClickListener(this);
        ist6.setOnClickListener(this);
        ist7.setOnClickListener(this);
        ist8.setOnClickListener(this);
        ist9.setOnClickListener(this);
        ist10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.boy_menu_card_2_id:
                intent = new Intent(this, ChangeActivity.class);
                break;
            case R.id.boy_menu_card_3_id:
                intent = new Intent(this, GenitActivity.class);
                break;
            case R.id.boy_menu_card_4_id:
                intent = new Intent(this, TannerActivity.class);
                break;
            case R.id.boy_menu_card_5_id:
                intent = new Intent(this, AttentionActivity.class);
                break;
            case R.id.boy_menu_card_6_id:
                intent = new Intent(this, HygiActivity.class);
                break;
            default:
                intent = new Intent(this, BodyActivity.class);
        }
        startActivity(intent);
    }
}