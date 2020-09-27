package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.ISTs.IstEightActivity;
import com.example.caique.teensade.ISTs.IstFiveActivity;
import com.example.caique.teensade.ISTs.IstFourActivity;
import com.example.caique.teensade.ISTs.IstNineActivity;
import com.example.caique.teensade.ISTs.IstOneActivity;
import com.example.caique.teensade.ISTs.IstSevenActivity;
import com.example.caique.teensade.ISTs.IstSixActivity;
import com.example.caique.teensade.ISTs.IstTenActivity;
import com.example.caique.teensade.ISTs.IstThreeActivity;
import com.example.caique.teensade.ISTs.IstTwoActivity;

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
            case R.id.ists_card_2_id:
                intent = new Intent(this, IstTwoActivity.class);
                break;
            case R.id.ists_card_3_id:
                intent = new Intent(this, IstThreeActivity.class);
                break;
            case R.id.ists_card_4_id:
                intent = new Intent(this, IstFourActivity.class);
                break;
            case R.id.ists_card_5_id:
                intent = new Intent(this, IstFiveActivity.class);
                break;
            case R.id.ists_card_6_id:
                intent = new Intent(this, IstSixActivity.class);
                break;
            case R.id.ists_card_7_id:
                intent = new Intent(this, IstSevenActivity.class);
                break;
            case R.id.ists_card_8_id:
                intent = new Intent(this, IstEightActivity.class);
                break;
            case R.id.ists_card_9_id:
                intent = new Intent(this, IstNineActivity.class);
                break;
            case R.id.ists_card_10_id:
                intent = new Intent(this, IstTenActivity.class);
                break;
            default:
                intent = new Intent(this, IstOneActivity.class);
        }
        startActivity(intent);
    }
}