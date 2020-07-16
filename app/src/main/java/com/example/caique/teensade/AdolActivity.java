package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.caique.teensade.Adolescencia.ConhecerActivity;

public class AdolActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mAdolBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adol);

        mAdolBtn = findViewById(R.id.adol_btn);
        mAdolBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.adol_btn:
                Intent intent = new Intent(this, ConhecerActivity.class);
                startActivity(intent);
                break;
        }
    }
}