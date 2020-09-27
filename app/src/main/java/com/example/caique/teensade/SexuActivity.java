package com.example.caique.teensade;

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
import com.example.caique.teensade.Sexualidade.ConhecerActivity;
import com.example.caique.teensade.Sexualidade.LigadoActivity;
import com.example.caique.teensade.Sexualidade.MetodosActivity;
import com.example.caique.teensade.Sexualidade.SexoActivity;
import com.example.caique.teensade.Sexualidade.SexualiadeActivity;

public class SexuActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mSexuCard;
    private CardView mConhecerCard;
    private CardView mMetodosCard;
    private CardView mFiqueCard;
    private CardView mSeguroCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexu);

        mSexuCard = findViewById(R.id.sexu_menu_card_1_id);
        mConhecerCard = findViewById(R.id.sexu_menu_card_2_id);
        mMetodosCard = findViewById(R.id.sexu_menu_card_3_id);
        mFiqueCard = findViewById(R.id.sexu_menu_card_4_id);
        mSeguroCard = findViewById(R.id.sexu_menu_card_5_id);
        mSexuCard.setOnClickListener(this);
        mConhecerCard.setOnClickListener(this);
        mMetodosCard.setOnClickListener(this);
        mFiqueCard.setOnClickListener(this);
        mSeguroCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.sexu_menu_card_2_id:
                intent = new Intent(this, ConhecerActivity.class);
                break;
            case R.id.sexu_menu_card_3_id:
                intent = new Intent(this, MetodosActivity.class);
                break;
            case R.id.sexu_menu_card_4_id:
                intent = new Intent(this, LigadoActivity.class);
                break;
            case R.id.sexu_menu_card_5_id:
                intent = new Intent(this, SexoActivity.class);
                break;
            default:
                intent = new Intent(this, SexualiadeActivity.class);
        }
        startActivity(intent);
    }
}