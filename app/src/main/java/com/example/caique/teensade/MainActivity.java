package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mAdolCard;
    private CardView mDireCard;
    private CardView mSaudCard;
    private CardView mCresCard;
    private CardView mBucaCard;
    private CardView mVaciCard;
    private CardView mPubeCard;
    private CardView mSexuCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdolCard = findViewById(R.id.adol_card_id);
        mDireCard = findViewById(R.id.dire_card_id);
        mSaudCard = findViewById(R.id.saud_card_id);
        mCresCard = findViewById(R.id.cres_card_id);
        mBucaCard = findViewById(R.id.buca_card_id);
        mVaciCard = findViewById(R.id.vaci_card_id);
        mPubeCard = findViewById(R.id.pube_card_id);
        mSexuCard = findViewById(R.id.sexu_card_id);

        mAdolCard.setOnClickListener(this);
        mDireCard.setOnClickListener(this);
        mSaudCard.setOnClickListener(this);
        mCresCard.setOnClickListener(this);
        mBucaCard.setOnClickListener(this);
        mVaciCard.setOnClickListener(this);
        mPubeCard.setOnClickListener(this);
        mSexuCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.dire_card_id:
                intent = new Intent(this,DireActivity.class);
                break;
            case R.id.saud_card_id:
                intent = new Intent(this,SaudActivity.class);
                break;
            case R.id.cres_card_id:
                intent = new Intent(this,CresActivity.class);
                break;
            case R.id.buca_card_id:
                intent = new Intent(this,BucaActivity.class);
                break;
            case R.id.vaci_card_id:
                intent = new Intent(this,VaciActivity.class);
                break;
            case R.id.pube_card_id:
                intent = new Intent(this,PubeActivity.class);
                break;
            case R.id.sexu_card_id:
                intent = new Intent(this,SexuActivity.class);
                break;
            default:
                intent = new Intent(this,AdolActivity.class);
        }
        startActivity(intent);

    }
}