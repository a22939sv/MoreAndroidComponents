package com.sanvalero.moreandroidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    ListView listaDias;
    TextView etiSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        listaDias = (ListView) findViewById(R.id.listViewId);
        etiSeleccion = (TextView) findViewById(R.id.txtId);

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Cristian");
        listaNombres.add("Maria");
        listaNombres.add("Carlos");
        listaNombres.add("Juan");

        for (int i = 0; i < 10; i++) {
            listaNombres.add("Nombre " + i);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.arrayDias, android.R.layout.simple_list_item_1);
        ArrayAdapter<CharSequence> adapterList = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNombres); // Para utilizar ArrayList

        listaDias.setAdapter(adapter);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), "Selecciona: " + adapterView.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                etiSeleccion.setText("Seleccion: " + adapterView.getItemAtPosition(position).toString());
            }
        });
    }
}