package com.example.caique.teensade.Vacinacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Adolescencia.ConhecerActivity;
import com.example.caique.teensade.R;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mGirlCard;
    private CardView mBoyCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        mGirlCard = findViewById(R.id.vaci_cale_girl_card_id);
        mBoyCard = findViewById(R.id.vaci_cale_boy_card_id);

        mGirlCard.setOnClickListener(this);
        mBoyCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.vaci_cale_boy_card_id:
                intent = new Intent(this, BoyActivity.class);
                break;
            default:
                intent = new Intent(this, GirlActivity.class);
        }
        startActivity(intent);
    }
}