package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comunicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);
    }

    public void actividad1 (View v)
    {
        Intent intent = new Intent(Comunicacion.this, Actividad1.class);
        startActivity(intent);
    }

    public void actividad2 (View v)
    {
        Intent intent = new Intent(Comunicacion.this, Actividad2.class);
        startActivity(intent);
    }

    public void actividad3 (View v)
    {
        Intent intent = new Intent(Comunicacion.this, Actividad3.class);
        startActivity(intent);
    }

    public void actividad4 (View v)
    {
        Intent intent = new Intent(Comunicacion.this, Actividad4.class);
        startActivity(intent);
    }

    public void salir (View v)
    {
        finish();
    }
}
