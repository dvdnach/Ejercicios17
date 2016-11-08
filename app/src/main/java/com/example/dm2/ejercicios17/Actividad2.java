package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    private EditText usuario;
    private EditText contraseña;
    private int verificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        usuario = (EditText) findViewById(R.id.txt1);
        contraseña = (EditText) findViewById(R.id.txt2);
    }
    public void iniciarsesion (View v)
    {
        if (usuario.getText().toString().isEmpty()||contraseña.getText().toString().isEmpty())
        {
            Toast toast = Toast.makeText(getApplicationContext(),"Usuario y contraseña necesarios",Toast.LENGTH_LONG);
            toast.show();
        }
        else
        {
            verificacion = 1;
            Intent intent = new Intent(Actividad2.this, Actividad2b.class);
            intent.putExtra("verificacion", verificacion);
            intent.putExtra("usuario",usuario.getText().toString());
            intent.putExtra("contraseña",contraseña.getText().toString());
            startActivity(intent);
        }
    }


}
