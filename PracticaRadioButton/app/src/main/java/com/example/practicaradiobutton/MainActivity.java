package com.example.practicaradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText primerValor;
    private EditText segundoValor;
    private RadioButton operacionSuma;
    private RadioButton operacionResta;
    private RadioButton operacionMultiplicacion;
    private RadioButton operacionDivision;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primerValor = findViewById(R.id.primer_valor);
        segundoValor = findViewById(R.id.segundo_valor);
        operacionSuma = findViewById(R.id.operacion_sumar);
        operacionResta = findViewById(R.id.operacion_restar);
        operacionMultiplicacion = findViewById(R.id.operacion_multiplicar);
        operacionDivision = findViewById(R.id.operacion_dividir);
        resultado = findViewById(R.id.resultado);
    }

    public void calcular(View view){
        int primerOperando = Integer.parseInt(primerValor.getText().toString());
        int segundoOperando = Integer.parseInt(segundoValor.getText().toString());
        sumar(primerOperando,segundoOperando);
        restar(primerOperando,segundoOperando);
        multiplicar(primerOperando, segundoOperando);
        dividir(primerOperando, segundoOperando);
    }

    public void sumar(int primerOperando, int segundoOperando){
        if(this.operacionSuma.isChecked()){
            int resultadoOperacion = primerOperando + segundoOperando;
            this.resultado.setText(String.valueOf(resultadoOperacion));
        }
    }
    public void restar(int primerOperando, int segundoOperando){
        if(this.operacionResta.isChecked()){
            int resultadoOperacion = primerOperando - segundoOperando;
            this.resultado.setText(String.valueOf(resultadoOperacion));
        }
    }
    public void multiplicar(int primerOperando, int segundoOperando){
        if (this.operacionMultiplicacion.isChecked()){
            int resultadoOperacion = primerOperando * segundoOperando;
            this.resultado.setText(String.valueOf(resultadoOperacion));
        }
    }
    public void dividir(int primerOperando, int segundoOperando){
        if (segundoOperando == 0){
            Toast.makeText(this,"EL SEGUNDO VALOR NO PUEDE SER 0", Toast.LENGTH_LONG);
        }else if (this.operacionMultiplicacion.isChecked()){
            int resultadoOperacion = primerOperando / segundoOperando;
            this.resultado.setText(String.valueOf(resultadoOperacion));
        }
    }
}
