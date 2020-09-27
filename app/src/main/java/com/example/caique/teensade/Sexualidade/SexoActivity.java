package com.example.caique.teensade.Sexualidade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.caique.teensade.Puberdade.BoyActivity;
import com.example.caique.teensade.Puberdade.GirlActivity;
import com.example.caique.teensade.R;

public class SexoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexo);

        CardView masculina = findViewById(R.id.masc_card_id);
        CardView feminina = findViewById(R.id.fem_card_id);
        masculina.setOnClickListener(this);
        feminina.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.fem_card_id:
                intent = new Intent(this, MascActivity.class);
                break;
            default:
                intent = new Intent(this, FemininoActivity.class);
        }
        startActivity(intent);
    }
}