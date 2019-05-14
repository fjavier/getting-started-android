package com.example.appradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText primerValor, segundoValor;
    private TextView resultado;
    private RadioButton operacionSuma, operacionResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primerValor = findViewById(R.id.primer_valor);
        segundoValor = findViewById(R.id.segundo_valor);
        resultado = findViewById(R.id.resultado);
        operacionSuma = findViewById(R.id.operacion_suma);
        operacionResta = findViewById(R.id.operacion_resta);
    }

    public void calcular(View view){
        int primerOperando = Integer.valueOf(primerValor.getText().toString());
        int segundoOperando = Integer.valueOf(segundoValor.getText().toString());

        if (operacionSuma.isChecked()){
            this.resultado.setText(String.valueOf(sumar(primerOperando,segundoOperando)));
        }else if(operacionResta.isChecked()){
            this.resultado.setText(String.valueOf(restar(primerOperando,segundoOperando)));
        }
    }

    public static int sumar(int primerOperando, int segundoOperando){
        return primerOperando+segundoOperando;
    }

    public static int restar(int primerOperando, int segundoOperando){
        return primerOperando - segundoOperando;
    }
}
