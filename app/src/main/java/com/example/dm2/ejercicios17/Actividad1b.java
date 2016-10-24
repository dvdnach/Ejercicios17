package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad1b extends AppCompatActivity {

    private TextView lbltxt1;
    private Bundle extras;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1b);
        extras = getIntent().getExtras();
        str =extras.getString("nombre")+" "+extras.getString("apellidos");
        lbltxt1 = (TextView) findViewById(R.id.lbltxt1);
        lbltxt1.setText("Hola "+str+" ¿Aceptas las condiciones?");

    }

    public void aceptar (View v)
    {
        Intent intent = new Intent();
        intent.putExtra("resultado","aceptar");
        setResult(RESULT_OK,intent);
        finish();
    }

    public void rechazar (View v)
    {
        Intent intent = new Intent();
        intent.putExtra("resultado","rechazar");
        setResult(RESULT_CANCELED,intent);
        finish();
    }
}
