package com.example.caique.teensade.Vacinacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.R;
import com.example.caique.teensade.Vacinacao.MinhasVacinas.DuplaActivity;
import com.example.caique.teensade.Vacinacao.MinhasVacinas.FebreActivity;
import com.example.caique.teensade.Vacinacao.MinhasVacinas.HPVActivity;
import com.example.caique.teensade.Vacinacao.MinhasVacinas.HepatiteActivity;
import com.example.caique.teensade.Vacinacao.MinhasVacinas.MeningoActivity;
import com.example.caique.teensade.Vacinacao.MinhasVacinas.TripliceActivity;

public class VacinasActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mHepaCard;
    private CardView mFebrCard;
    private CardView mTripCard;
    private CardView mDuplCard;
    private CardView mHPVCard;
    private CardView mMeniCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacinas);

        mHepaCard = findViewById(R.id.minhas_card_1);
        mFebrCard = findViewById(R.id.minhas_card_2);
        mTripCard = findViewById(R.id.minhas_card_3);
        mDuplCard = findViewById(R.id.minhas_card_4);
        mHPVCard = findViewById(R.id.minhas_card_5);
        mMeniCard = findViewById(R.id.minhas_card_6);

        mHepaCard.setOnClickListener(this);
        mFebrCard.setOnClickListener(this);
        mTripCard.setOnClickListener(this);
        mDuplCard.setOnClickListener(this);
        mHPVCard.setOnClickListener(this);
        mMeniCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.minhas_card_2:
                intent = new Intent(this, FebreActivity.class);
                break;
            case R.id.minhas_card_3:
                intent = new Intent(this, TripliceActivity.class);
                break;
            case R.id.minhas_card_4:
                intent = new Intent(this, DuplaActivity.class);
                break;
            case R.id.minhas_card_5:
                intent = new Intent(this, HPVActivity.class);
                break;
            case R.id.minhas_card_6:
                intent = new Intent(this, MeningoActivity.class);
                break;
            default:
                intent = new Intent(this, HepatiteActivity.class);
        }
        startActivity(intent);
    }
}