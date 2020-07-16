package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Adolescencia.ConhecerActivity;
import com.example.caique.teensade.Vacinacao.GenderActivity;
import com.example.caique.teensade.Vacinacao.InfoActivity;
import com.example.caique.teensade.Vacinacao.VacinasActivity;

public class VaciActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mCaleCard;
    private CardView mInfoCard;
    private CardView mMinhCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaci);

        mCaleCard = findViewById(R.id.vaci_cale_card_id);
        mInfoCard = findViewById(R.id.vaci_info_card_id);
        mMinhCard = findViewById(R.id.vaci_minh_card_id);
        mCaleCard.setOnClickListener(this);
        mInfoCard.setOnClickListener(this);
        mMinhCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.vaci_info_card_id:
                intent = new Intent(this, InfoActivity.class);
                break;
            case R.id.vaci_minh_card_id:
                intent = new Intent(this, VacinasActivity.class);
                break;
            default:
                intent = new Intent(this, GenderActivity.class);
        }
        startActivity(intent);
    }
}