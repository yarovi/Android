package com.example.yami.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textoView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obteniendo datos

        textoView= findViewById(R.id.texto);
        button =findViewById(R.id.boton);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //capturando interaccion del usuario
                textoView.setText("Hola desde Android :) ...");
            }
        });

    }
}
