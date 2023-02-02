package com.sanvalero.moreandroidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {

    CheckBox c1, c2;
    RadioButton r1, r2;
    ToggleButton tgBtn;
    TextView txtEti, txtEti2;
    Switch switchE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        c1 = (CheckBox) findViewById(R.id.idChec1);
        c2 = (CheckBox) findViewById(R.id.idChec2);
        r1 = (RadioButton) findViewById(R.id.idRadio1);
        r2 = (RadioButton) findViewById(R.id.idRadio2);

        tgBtn = (ToggleButton) findViewById(R.id.tgBtn1);
        txtEti = (TextView) findViewById(R.id.etiSeleccion);

        switchE = (Switch) findViewById(R.id.idSwitch);
        txtEti2 = (TextView) findViewById(R.id.etiSeleccion2);
    }

    public void onclick(View view) {

        if (view.getId() == R.id.btn1) {
            validar();
        }

    }

    private void validar() {
        String cad = "Seleccionado: \n";

        if (c1.isChecked()) {
            cad+="Opcion1\n";
        }

        if (c2.isChecked()) {
            cad+="Opcion2\n";
        }

        if (r1.isChecked()) {
            cad+="Opcion3";
        }

        if (r2.isChecked()) {
            cad+="Opcion4";
        }

        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }

    public void onclick2(View view) {

        if (view.getId() == R.id.tgBtn1) {
            if (tgBtn.isChecked()) {
                txtEti.setText("Estado: Boton On");
            } else {
                txtEti.setText("Estado: Boton Off");
            }
        }

    }

    public void onclick3(View view) {
        if (view.getId() == R.id.idSwitch) {
            if (switchE.isChecked()) {
                txtEti2.setText("Estado: Fue Activado");
            } else {
                txtEti2.setText("Estado: Fue Inactivado");
            }
        }
    }
}