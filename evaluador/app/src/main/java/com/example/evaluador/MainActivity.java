package com.example.evaluador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText matematicaText;
    private EditText espaniolText;
    private EditText inglesText;
    private TextView estadoAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matematicaText = findViewById(R.id.matematica);
        espaniolText = findViewById(R.id.espaniol);
        inglesText = findViewById(R.id.ingles);
        estadoAlumno = findViewById(R.id.estado);
    }

    public void evaluarEstadoAlumno(View view){
        int notaMatematica = Integer.valueOf(matematicaText.getText().toString()) ;
        int notaEspaniol = Integer.valueOf(espaniolText.getText().toString());
        int notaIngles = Integer.valueOf(inglesText.getText().toString());

        int estado = (notaMatematica+notaEspaniol + notaIngles) / 3;

        if (estado>6){
            this.estadoAlumno.setText("El alumno aprobo el semestre con "+estado);
        }else{
            this.estadoAlumno.setText("El alumno reprobo el semestre con "+estado);
        }
    }
}
