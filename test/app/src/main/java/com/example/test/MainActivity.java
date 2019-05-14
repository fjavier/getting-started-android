package com.example.test;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText componentePrimerValor;
    private EditText segundoValor;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        componentePrimerValor = findViewById(R.id.numero_1);
        segundoValor = findViewById(R.id.numero_2);
        resultado = findViewById(R.id.resultado);
    }

    public void sumar(View view){
        int numero1 = Integer.valueOf(componentePrimerValor.getText().toString());
        int numero2 = Integer.valueOf(segundoValor.getText().toString());
        int resultado = numero1 + numero2;
        this.resultado.setText(String.valueOf(resultado));

    }
}
