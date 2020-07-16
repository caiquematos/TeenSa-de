package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Puberdade.BoyActivity;
import com.example.caique.teensade.Puberdade.GirlActivity;

public class PubeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mGirlCard;
    private CardView mBoyCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pube);

        mGirlCard = findViewById(R.id.pube_girl_card_id);
        mBoyCard = findViewById(R.id.pube_boy_card_id);
        mGirlCard.setOnClickListener(this);
        mBoyCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.pube_boy_card_id:
                intent = new Intent(this, BoyActivity.class);
                break;
            default:
                intent = new Intent(this, GirlActivity.class);
        }
        startActivity(intent);
    }
}