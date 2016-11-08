package com.example.dm2.ejercicios17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Actividad2b extends AppCompatActivity {

    private Bundle extras;
    private int verificacion;
    private TextView lbltxt1;
    private String usuario;
    private String contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2b);
        lbltxt1 = (TextView) findViewById(R.id.lbltxt1);
        extras = getIntent().getExtras();
        verificacion= extras.getInt("verificacion");
        usuario=extras.getString("usuario");
        contraseña=extras.getString("contraseña");
        if (verificacion==1&&usuario.equals("david")&&contraseña.equals("1234"))
        {
            lbltxt1.setText("El USUARIO y la PASSWORD son CORRECTAS");
        }
        else
        {
            lbltxt1.setText("USUARIO Y/O PASSWORD INCORRECTA");
        }
    }

    public void volver (View v)
    {
        finish();
    }
}
