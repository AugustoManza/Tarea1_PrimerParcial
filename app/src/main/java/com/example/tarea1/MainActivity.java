package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Numero1, Numero2;
    Button btnSumar, btnRestar, btnDividir, btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numero1 = (EditText) findViewById(R.id.Numero1);
        Numero2 = (EditText) findViewById(R.id.Numero2);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        //Sumar
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = Numero1.getText().toString();
                String numero2 = Numero2.getText().toString();

                int total = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                String Resultado = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("Resultado", Resultado);
                startActivity(intent);


            }
        });

        //Restar
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = Numero1.getText().toString();
                String numero2 = Numero2.getText().toString();

                int total = Integer.parseInt(numero1) - Integer.parseInt(numero2);

                String resultado = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);

            }
        });

        //Multiplicar
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = Numero1.getText().toString();
                String numero2 = Numero2.getText().toString();

                int total = Integer.parseInt(numero1) * Integer.parseInt(numero2);

                String resultado = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);


            }
        });

        //Dividir

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1 = Numero1.getText().toString();
                String numero2 = Numero2.getText().toString();

                int total = Integer.parseInt(numero1) / Integer.parseInt(numero2);

                String resultado = String.valueOf(total);

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);


            }
        });


    }
}

