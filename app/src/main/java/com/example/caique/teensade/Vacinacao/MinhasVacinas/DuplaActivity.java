package com.example.caique.teensade.Vacinacao.MinhasVacinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.caique.teensade.R;

import java.util.Calendar;

public class DuplaActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private CardView mDoseTwo;
    private CardView mDoseOne;
    private CardView mDoseThree;
    private TextView mTextOne;
    private TextView mTextTwo;
    private TextView mTextThree;
    private DatePickerDialog mPicker;
    private final int DOSE_ONE = 1;
    private final int DOSE_TWO = 2;
    private final int DOSE_THREE = 3;
    private int mDose = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dupla);

        mDoseOne = findViewById(R.id.dupla_card_1);
        mDoseTwo = findViewById(R.id.dupla_card_2);
        mDoseThree = findViewById(R.id.dupla_card_3);
        mTextOne = findViewById(R.id.dupla_text_1);
        mTextTwo = findViewById(R.id.dupla_text_2);
        mTextThree = findViewById(R.id.dupla_text_3);

        mDoseThree.setOnClickListener(this);
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
            case R.id.dupla_card_2:
                mDose = DOSE_TWO;
                break;
            case R.id.dupla_card_3:
                mDose = DOSE_THREE;
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
            case DOSE_THREE:
                mTextThree.setText(data);
                mDose = DOSE_THREE;
                break;
            default:
                mTextOne.setText(data);
        }
        mDose = 0;
        //Toast.makeText(mActivity,"DATA = " + data, Toast.LENGTH_SHORT).show();
    }
}