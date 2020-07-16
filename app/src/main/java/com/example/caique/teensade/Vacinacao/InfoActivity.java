package com.example.caique.teensade.Vacinacao;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.caique.teensade.R;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView mInfo1Card;
    private CardView mInfo2Card;
    private CardView mInfo3Card;
    private CardView mInfo4Card;
    private CardView mInfo5Card;
    private CardView mInfo6Card;
    private CardView mInfo7Card;
    private CardView mInfo8Card;
    private CardView mInfo9Card;
    private AlertDialog.Builder mBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        mInfo1Card = findViewById(R.id.info_card_1_id);
        mInfo2Card = findViewById(R.id.info_card_2_id);
        mInfo3Card = findViewById(R.id.info_card_3_id);
        mInfo4Card = findViewById(R.id.info_card_4_id);
        mInfo5Card = findViewById(R.id.info_card_5_id);
        mInfo6Card = findViewById(R.id.info_card_6_id);
        mInfo7Card = findViewById(R.id.info_card_7_id);
        mInfo8Card = findViewById(R.id.info_card_8_id);
        mInfo9Card = findViewById(R.id.info_card_9_id);
        mInfo1Card.setOnClickListener(this);
        mInfo2Card.setOnClickListener(this);
        mInfo3Card.setOnClickListener(this);
        mInfo4Card.setOnClickListener(this);
        mInfo5Card.setOnClickListener(this);
        mInfo6Card.setOnClickListener(this);
        mInfo7Card.setOnClickListener(this);
        mInfo8Card.setOnClickListener(this);
        mInfo9Card.setOnClickListener(this);

        mBuilder = new AlertDialog.Builder(this);
    }

    @Override
    public void onClick(View view) {
        int title;
        int message;
        switch (view.getId()) {
            case R.id.info_card_2_id:
                title = R.string.info_2_title;
                message = R.string.info_2_message;
                break;
            case R.id.info_card_3_id:
                title = R.string.info_3_title;
                message = R.string.info_3_message;
                break;
            case R.id.info_card_4_id:
                title = R.string.info_4_title;
                message = R.string.info_4_message;
                break;
            case R.id.info_card_5_id:
                title = R.string.info_5_title;
                message = R.string.info_5_message;
                break;
            case R.id.info_card_6_id:
                title = R.string.info_6_title;
                message = R.string.info_6_message;
                break;
            case R.id.info_card_7_id:
                title = R.string.info_7_title;
                message = R.string.info_7_message;
                break;
            case R.id.info_card_8_id:
                title = R.string.info_8_title;
                message = R.string.info_8_message;
                break;
            case R.id.info_card_9_id:
                title = R.string.info_9_title;
                message = R.string.info_9_message;
                break;
            default:
                title = R.string.info_1_title;
                message = R.string.info_1_message;
        }
        mBuilder.setMessage(message);
        mBuilder.setTitle(title);
        AlertDialog dialog = mBuilder.create();
        dialog.show();
    }
}