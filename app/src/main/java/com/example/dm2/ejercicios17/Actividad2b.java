package com.example.dm2.ejercicios17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad2b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2b);
    }

    public void volver (View v)
    {
        finish();
    }
}
