package com.example.caique.teensade.Puberdade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Puberdade.Menina.TunerActivity;
import com.example.caique.teensade.Puberdade.Menino.AttentionActivity;
import com.example.caique.teensade.Puberdade.Menino.BodyActivity;
import com.example.caique.teensade.Puberdade.Menino.ChangeActivity;
import com.example.caique.teensade.Puberdade.Menino.GenitActivity;
import com.example.caique.teensade.Puberdade.Menino.HygiActivity;
import com.example.caique.teensade.Puberdade.Menino.TannerActivity;
import com.example.caique.teensade.R;

public class BoyActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy2);

        CardView mBodyCard = findViewById(R.id.boy_menu_card_1_id);
        CardView mChangesCard = findViewById(R.id.boy_menu_card_2_id);
        CardView mGeniCard = findViewById(R.id.boy_menu_card_3_id);
        CardView mTunerCard = findViewById(R.id.boy_menu_card_4_id);
        CardView mHygiCard = findViewById(R.id.boy_menu_card_6_id);
        CardView mAttentionCard = findViewById(R.id.boy_menu_card_5_id);
        mBodyCard.setOnClickListener(this);
        mChangesCard.setOnClickListener(this);
        mGeniCard.setOnClickListener(this);
        mTunerCard.setOnClickListener(this);
        mHygiCard.setOnClickListener(this);
        mAttentionCard.setOnClickListener(this);
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