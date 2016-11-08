package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3b extends AppCompatActivity {

    private Bundle extras;
    private int operando1;
    private int operando2;
    private int resultado;
    private TextView lbltxt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3b);
        lbltxt1 = (TextView) findViewById(R.id.lbltxt1);
        extras = getIntent().getExtras();
        operando1= extras.getInt("operando1");
        operando2=extras.getInt("operando2");
        resultado=extras.getInt("resultado");
        if (operando1+operando2==resultado)
        {
            lbltxt1.setText("El resultado de la operacion es CORRECTA");
        }
        else
        {
            lbltxt1.setText("El resultado de la operacion es INCORRECTA");
        }
    }
    public void volver (View v)
    {
        if (operando1+operando2==resultado)
        {
            Intent intent = new Intent();
            setResult(RESULT_OK,intent);
            finish();
        }
        else
        {
            Intent intent = new Intent();
            setResult(RESULT_CANCELED,intent);
            finish();
        }

    }
}
