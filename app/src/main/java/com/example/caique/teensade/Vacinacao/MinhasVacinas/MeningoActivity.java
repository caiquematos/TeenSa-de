package com.example.caique.teensade.Vacinacao.MinhasVacinas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.caique.teensade.R;

import java.util.Calendar;

public class MeningoActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, View.OnClickListener {
    private CardView mDoseOne;
    private TextView mTextOne;
    private DatePickerDialog mPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meningo);

        mDoseOne = findViewById(R.id.meni_card_1);
        mTextOne = findViewById(R.id.meni_text_1);
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
        mTextOne.setText(data);
    }
}