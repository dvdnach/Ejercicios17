package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Actividad4 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private RadioButton radio1;
    private CheckBox chk1;
    private CheckBox chk2;
    private CheckBox chk3;
    private CheckBox chk4;
    private String sexo;
    private String aficiones="";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);
        nombre = (EditText) findViewById(R.id.txt1);
        apellido = (EditText) findViewById(R.id.txt2);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);
        chk3 = (CheckBox) findViewById(R.id.chk3);
        chk4 = (CheckBox) findViewById(R.id.chk4);
    }

    public void enviar(View v)
    {
        if (radio1.isChecked())
        {
            sexo="masculino";
        }
        else
        {
            sexo="femenino";
        }
        if (chk1.isChecked())
        {
            aficiones+="Musica ";
        }
        if (chk2.isChecked())
        {
            aficiones+="Lectura ";
        }
        if (chk3.isChecked())
        {
            aficiones+="Deportes ";
        }
        if (chk4.isChecked())
        {
            aficiones+="Viajar ";
        }
        if (aficiones.isEmpty())
        {
            aficiones="Ninguna";
        }
        Intent intent = new Intent(Actividad4.this, Actividad4b.class);
        intent.putExtra("nombre",nombre.getText().toString());
        intent.putExtra("apellido",apellido.getText().toString());
        intent.putExtra("sexo",sexo);
        intent.putExtra("aficiones",aficiones);
        startActivity(intent);
    }
}
