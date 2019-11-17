package com.example.pasoparamertros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1) Definimos el evento clic del del boton pasar parametro
        Button buttonUno = findViewById(R.id.buttonParametro);
        buttonUno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Boton parametro Clicked");
                //2) Pasamos el parametro con un intent
                Intent activity2Intent = new Intent(getApplicationContext(), Activity2.class);
                activity2Intent.putExtra("parametro","Mi primer parametro");
                startActivity(activity2Intent);
            }
        });
    }
}
