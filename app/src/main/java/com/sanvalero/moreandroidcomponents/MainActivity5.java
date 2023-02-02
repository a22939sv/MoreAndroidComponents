package com.sanvalero.moreandroidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    TextView estado;
    Spinner comboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        estado = (TextView) findViewById(R.id.etiSeleccion);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);

        ArrayList<String> comboDiasList = new ArrayList<>();
        comboDiasList.add("Seleccione!!!");

        for (int i = 0; i <= 10; i++) {
            comboDiasList.add("Opcion: " + i);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.combo_dias, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterList = new ArrayAdapter(this, android.R.layout.simple_spinner_item, comboDiasList);   // Para utilizar ArrayList

        comboDias.setAdapter(adapter);

        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(adapterView.getContext(), "Seleccionado: " + adapterView.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                estado.setText("Seleccion: " + adapterView.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}