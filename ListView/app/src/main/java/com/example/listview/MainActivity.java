package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ListView listView;

    private String nombres[] = { "Samuel" , "Valentina"};
    private String edades[] = { "12","18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView) findViewById(R.id.lista);
        textView = (TextView) findViewById(R.id.cabecera);

        ArrayAdapter<String> opciones = new ArrayAdapter<>(this, R.layout.list_item_layout,nombres);
        listView.setAdapter(opciones);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText("LA EDAD DE :"+ listView.getItemAtPosition(position) + " es " +edades[position] + "años");
            }
        });
    }
}
