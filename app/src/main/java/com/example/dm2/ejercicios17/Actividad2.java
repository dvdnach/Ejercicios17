package com.example.dm2.ejercicios17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {

    private EditText usuario;
    private EditText contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        usuario = (EditText) findViewById(R.id.txt1);
        contraseña = (EditText) findViewById(R.id.txt2);
    }



}
