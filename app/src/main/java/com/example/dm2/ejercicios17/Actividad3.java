package com.example.dm2.ejercicios17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    private EditText operando1;
    private EditText operando2;
    private EditText resultado;
    private TextView lbltxt4;
    private TextView lbltxt5;
    private int correctas=0;
    private int incorrectas=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        operando1= (EditText) findViewById(R.id.txt1);
        operando1.setText(Math.round(0+Math.random()*101)+"");
        operando2= (EditText) findViewById(R.id.txt2);
        operando2.setText(Math.round(0+Math.random()*101)+"");
        resultado= (EditText) findViewById(R.id.txt3);
        lbltxt4 = (TextView) findViewById(R.id.lbltxt4);
        lbltxt5 = (TextView) findViewById(R.id.lbltxt5);
        lbltxt4.setText(lbltxt4.getText().toString()+correctas+" ");
        lbltxt5.setText(lbltxt5.getText().toString()+incorrectas+" ");
    }
    public void comprobar (View v) {
        if (resultado.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(getApplicationContext(), "Resultado necesario", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Intent intent = new Intent(Actividad3.this, Actividad3b.class);
            intent.putExtra("operando1", Integer.parseInt(operando1.getText().toString()));
            intent.putExtra("operando2", Integer.parseInt(operando2.getText().toString()));
            intent.putExtra("resultado", Integer.parseInt(resultado.getText().toString()));
            startActivityForResult(intent, 1234);
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==1234&&resultCode==RESULT_OK)
        {
            correctas++;
            lbltxt4.setText("PREGUNTAS CORRECTAS: "+correctas+" ");
            operando1.setText(Math.round(0+Math.random()*101)+"");
            operando2.setText(Math.round(0+Math.random()*101)+"");
            resultado.setText("");
        }
        else
        {
            incorrectas++;
            lbltxt5.setText(" INCORRECTAS: "+incorrectas+" ");
            operando1.setText(Math.round(0+Math.random()*101)+"");
            operando2.setText(Math.round(0+Math.random()*101)+"");
            resultado.setText("");
        }
    }
}
