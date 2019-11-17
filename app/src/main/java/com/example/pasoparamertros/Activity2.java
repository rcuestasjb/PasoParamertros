package com.example.pasoparamertros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //1) Recupera el intent creado anteriorment
        Intent myIntent = getIntent(); // Obtiene el intent creado anteriomente

        //2) Recupera y muestra el parametro
        String firstKeyName = myIntent.getStringExtra("parametro"); // recoje el valor del parametro
        Log.d("log",firstKeyName);
        final TextView textViewToChange = (TextView) findViewById(R.id.textView2);
        textViewToChange.setText(firstKeyName);
    }
}
