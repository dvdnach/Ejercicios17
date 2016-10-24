package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellidos;
    private TextView lbltxt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        nombre = (EditText) findViewById(R.id.txt1);
        apellidos = (EditText) findViewById(R.id.txt2);
        lbltxt3 = (TextView) findViewById(R.id.lbltxt3);
    }

    public void verificar (View v)
    {
        Intent intent = new Intent(Actividad1.this, Actividad1b.class);
        intent.putExtra("nombre",nombre.getText().toString());
        intent.putExtra("apellidos",apellidos.getText().toString());
        startActivityForResult(intent,1234);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==1234&&resultCode==RESULT_OK)
        {
            lbltxt3.setText("Aceptas condiciones: Aceptado");
        }
        else
        {
            lbltxt3.setText("Aceptas condiciones: Rechazado");
        }
    }

    public void volver (View v)
    {
        finish();
    }

}
