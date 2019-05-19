package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText primerValor;
    private EditText segundoValor;
    private TextView resultado;

    private static final String OPERACION_SUMAR = "SUMAR";
    private static final String OPERACION_RESTAR = "RESTAR";
    private static final String OPERACION_MULTIPLICAR = "MULTIPLICAR";
    private static final String OPERACION_DIVIDIR = "DIVIDIR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primerValor = findViewById(R.id.primer_valor) ;
        segundoValor = findViewById( R.id.segundo_valor );
        spinner = findViewById(R.id.spinner);
        resultado = findViewById(R.id.resultado);

        String[] operaciones = {OPERACION_SUMAR, OPERACION_RESTAR, OPERACION_MULTIPLICAR, OPERACION_DIVIDIR};

        ArrayAdapter<String> opciones = new ArrayAdapter<>(this, R.layout.spinner_item, operaciones);
        spinner.setAdapter(opciones);
    }

    public void calcular(View view){
        Integer primerValor = Integer.valueOf(this.primerValor.getText().toString()) ;
        Integer segundoValor = Integer.valueOf(this.segundoValor.getText().toString());
        String itemSeleccionado = spinner.getSelectedItem().toString();
        if (OPERACION_SUMAR.equals(itemSeleccionado)){
            this.resultado.setText(String.valueOf(primerValor + segundoValor));
        }else if (OPERACION_RESTAR.equals(itemSeleccionado)){
            this.resultado.setText(String.valueOf(primerValor - segundoValor));
        }else if(OPERACION_MULTIPLICAR.equals(itemSeleccionado)){
            this.resultado.setText(String.valueOf(primerValor * segundoValor));
        }else{
            if(segundoValor == null || segundoValor == 0) {
                Toast.makeText(this, "EL SEGUNDO VALOR NO PUEDE SER VACIO", Toast.LENGTH_SHORT).show();
                this.resultado.setText("ERROR DE CALCULO");
            }else{
                this.resultado.setText(String.valueOf(primerValor / segundoValor));
            }

        }
    }
}
