package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    EditText resultado;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        resultado = findViewById(R.id.resultado);
        Log.d("MainActivity", "onCreate Called");
    }

    public void buttonSomarClicked(View view) {
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int resultadoSoma = numero1 + numero2;
        resultado.setText(String.valueOf(resultadoSoma));
    }

    public void buttonSubtracaoClicked(View view) {
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int resultadoSoma = numero1 - numero2;
        resultado.setText(String.valueOf(resultadoSoma));

    }

    public void buttonMultiplicacaoClicked(View view) {
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int resultadoSoma = numero1 * numero2;
        resultado.setText(String.valueOf(resultadoSoma));
    }

    public void buttonDivisaoClicked(View view) {
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();
        if (num2.equals("0")){
            Toast.makeText(MainActivity.this, "Divisão infinita!", Toast.LENGTH_SHORT).show();
            return;
        }
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int resultadoSoma = numero1 / numero2;
        resultado.setText(String.valueOf(resultadoSoma));
    }

}