package com.example.caique.teensade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CresActivity extends AppCompatActivity {
    private TextView mIMC;
    private TextView mMessage;
    private EditText idadeET;
    private EditText pesoET;
    private EditText alturaET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cres);

        final Spinner spinnerSexo = (Spinner) findViewById(R.id.spinnerSexo);
        String[] lsSexo = getResources().getStringArray(R.array.lista_sexo);
        spinnerSexo.setAdapter(new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, lsSexo));

        idadeET = findViewById(R.id.cres_idade_et);
        pesoET = findViewById(R.id.cresc_peso_et);
        alturaET = findViewById(R.id.cres_altura_et);
        mIMC = findViewById(R.id.cres_imc);
        mMessage = findViewById(R.id.cres_message);

        Button calcularBT = findViewById(R.id.cresc_button);
        calcularBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("CRESCIMENTO", idadeET.getText() + "--idade--" +
                       pesoET.getText() + "--peso--" + alturaET.getText() + "--altura--" + spinnerSexo.getSelectedItem());

                char sexo = spinnerSexo.getSelectedItem().toString().charAt(0);
                int idade = -1;
                double altura = -1;
                double peso = -1;

                View newView = null;
                boolean cancel = false;
                String error = "";

                if (!alturaET.getText().toString().isEmpty()) {
                    altura = Double.parseDouble(alturaET.getText().toString());
                } else {
                    cancel = true;
                    newView = alturaET;
                    error = "Qual a sua altura?";
                }

                if (!pesoET.getText().toString().isEmpty()) {
                    peso = Double.parseDouble(pesoET.getText().toString());
                } else {
                    cancel = true;
                    newView = pesoET;
                    error = "Qual o seu peso?";
                }

                if (!idadeET.getText().toString().isEmpty()) {
                    idade = Integer.parseInt(idadeET.getText().toString());
                    if (idade < 10 || idade > 19) {
                        cancel = true;
                        newView = idadeET;
                        error = "Sua idade deve ser maior ou igual a 10 anos e menor ou igual a 19!";
                    }
                } else {
                    cancel = true;
                    newView = idadeET;
                    error = "Qual a sua idade?";
                }

                if (cancel) {
                    newView.requestFocus();
                    mMessage.setText(error);
                } else {
                    handleIMC(
                            sexo,
                            idade,
                            altura,
                            peso
                    );
                }
            }
        });

    }

    private void handleIMC(char sexo, int idade, double altura, double peso) {
        double limAdeq = 0.0, limSobre = 0.0;

        if (sexo == 'F') {
            switch (idade) {
                case 10:
                    limAdeq = 14.22;
                    limSobre = 20.18;
                    break;
                case 11:
                    limAdeq = 14.59;
                    limSobre = 21.17;
                    break;
                case 12:
                    limAdeq = 19.97;
                    limSobre = 22.16;
                    break;
                case 13:
                    limAdeq = 15.35;
                    limSobre = 23.07;
                    break;
                case 14:
                    limAdeq = 15.66;
                    limSobre = 23.87;
                    break;
                case 15:
                    limAdeq = 16;
                    limSobre = 24.28;
                    break;
                case 16:
                    limAdeq = 16.36;
                    limSobre = 24.73;
                    break;
                case 17:
                    limAdeq = 16.58;
                    limSobre = 25.22;
                    break;
                case 18:
                    limAdeq = 16.7;
                    limSobre = 25.55;
                    break;
                case 19:
                    limAdeq = 16.86;
                    limSobre = 25.84;
                    break;
            }
        } else {
            switch (idade) {
                case 10:
                    limAdeq = 14.41;
                    limSobre = 19.5;
                    break;
                case 11:
                    limAdeq = 14.82;
                    limSobre = 20.34;
                    break;
                case 12:
                    limAdeq = 15.23;
                    limSobre = 21.11;
                    break;
                case 13:
                    limAdeq = 15.72;
                    limSobre = 21.92;
                    break;
                case 14:
                    limAdeq = 16.17;
                    limSobre = 22.76;
                    break;
                case 15:
                    limAdeq = 16.58;
                    limSobre = 23.62;
                    break;
                case 16:
                    limAdeq = 17;
                    limSobre = 24.44;
                    break;
                case 17:
                    limAdeq = 17.3;
                    limSobre = 25.27;
                    break;
                case 18:
                    limAdeq = 17.53;
                    limSobre = 25.94;
                    break;
                case 19:
                    limAdeq = 17.79;
                    limSobre = 26.35;
                    break;
            }
        }

        String message = calcularIMC(altura, peso, limAdeq, limSobre);
        Log.e("RESULTADO", "STATUS = " + message);
        mMessage.setText(message);
    }

    private String calcularIMC(double altura, double peso, double limAdeq, double limSobre) {
        double imc = peso/(altura*altura);
        mIMC.setText(new DecimalFormat("0.##").format(imc));
        Log.e("RESULTADO", "IMC = " + imc);

        String message;
        if (imc > limSobre)
            message = "Cuidado! Você está com sobrepeso.";
        else if (imc > limAdeq)
            message = "Parabéns! Você está com peso adequado para sua idade.";
        else
            message = "Atenção! Seu peso está baixo para sua idade.";

        return message;
    }
}