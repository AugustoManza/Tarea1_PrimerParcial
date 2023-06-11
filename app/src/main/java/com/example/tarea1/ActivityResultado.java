package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ActivityResultado extends AppCompatActivity {

    EditText Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Resultado = (EditText) findViewById(R.id.Resultado);

        Resultado.setText(getIntent().getExtras().getString("Resultado"));

    }
}