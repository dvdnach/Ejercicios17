package com.example.dm2.ejercicios17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad4b extends AppCompatActivity {

    private Bundle extras;
    private TextView lbltxt1;
    private String nombre;
    private String apellido;
    private String sexo;
    private String aficiones;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4b);
        lbltxt1 = (TextView) findViewById(R.id.lbltxt1);
        extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        apellido = extras.getString("apellido");
        sexo = extras.getString("sexo");
        aficiones = extras.getString("aficiones");
        lbltxt1.setText("Nombre: "+nombre+"\nApellido: "+apellido+"\nSexo: "+sexo+"\nAficiones: "+aficiones);
    }

    public void volver(View v) {
        finish();
    }
}
