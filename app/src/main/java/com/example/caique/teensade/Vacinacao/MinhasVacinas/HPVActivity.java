package com.example.caique.teensade.Vacinacao.MinhasVacinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.caique.teensade.R;

import java.util.Calendar;

public class HPVActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private CardView mDoseTwo;
    private CardView mDoseOne;
    private TextView mTextOne;
    private TextView mTextTwo;
    private DatePickerDialog mPicker;
    private final int DOSE_ONE = 1;
    private final int DOSE_TWO = 2;
    private int mDose = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_p_v);

        mDoseOne = findViewById(R.id.hpv_card_1);
        mDoseTwo = findViewById(R.id.hpv_card_2);
        mTextOne = findViewById(R.id.hpv_text_1);
        mTextTwo = findViewById(R.id.hpv_text_2);

        mDoseTwo.setOnClickListener(this);
        mDoseOne.setOnClickListener(this);
    }

    private void getDate() {
        final Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        mPicker = new DatePickerDialog(this, this,year, month, day);
        mPicker.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.hpv_card_2:
                mDose = DOSE_TWO;
                break;
            default:
                mDose = DOSE_ONE;
        }
        getDate();
    }

    private String formatDate(int day, int mes, int ano) {
        String dayString = String.valueOf(day);
        String mesString = String.valueOf(mes);
        if (day < 10)  dayString = "0" + dayString;
        if (mes < 10) mesString = "0" + mesString;
        return dayString + "/" + mesString + "/" + ano;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String data = formatDate(i2,i1,i);
        switch (mDose) {
            case DOSE_TWO:
                mTextTwo.setText(data);
                break;
            default:
                mTextOne.setText(data);
        }
        mDose = 0;
    }
}