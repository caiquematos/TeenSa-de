package com.example.caique.teensade.Puberdade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Puberdade.Menina.AttentionActivity;
import com.example.caique.teensade.Puberdade.Menina.BodyActivity;
import com.example.caique.teensade.Puberdade.Menina.ChangeActivity;
import com.example.caique.teensade.Puberdade.Menina.GenitActivity;
import com.example.caique.teensade.Puberdade.Menina.HygiActivity;
import com.example.caique.teensade.Puberdade.Menina.TunerActivity;
import com.example.caique.teensade.R;
import com.example.caique.teensade.Vacinacao.BoyActivity;

public class GirlActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mBodyCard;
    private CardView mChangesCard;
    private CardView mGeniCard;
    private CardView mTunerCard;
    private CardView mHygiCard;
    private CardView mAttentionCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl2);

        mBodyCard = findViewById(R.id.girl_menu_card_1_id);
        mChangesCard = findViewById(R.id.girl_menu_card_2_id);
        mGeniCard = findViewById(R.id.girl_menu_card_3_id);
        mTunerCard = findViewById(R.id.girl_menu_card_4_id);
        mHygiCard = findViewById(R.id.girl_menu_card_6_id);
        mAttentionCard = findViewById(R.id.girl_menu_card_5_id);
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
            case R.id.girl_menu_card_2_id:
                intent = new Intent(this, ChangeActivity.class);
                break;
            case R.id.girl_menu_card_3_id:
                intent = new Intent(this, GenitActivity.class);
                break;
            case R.id.girl_menu_card_4_id:
                intent = new Intent(this, TunerActivity.class);
                break;
            case R.id.girl_menu_card_5_id:
                intent = new Intent(this, AttentionActivity.class);
                break;
            case R.id.girl_menu_card_6_id:
                intent = new Intent(this, HygiActivity.class);
                break;
            default:
                intent = new Intent(this, BodyActivity.class);
        }
        startActivity(intent);
    }
}