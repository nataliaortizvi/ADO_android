package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infoPerroUnoSisben extends AppCompatActivity  implements View.OnClickListener{
    private Button btnAdop;


    //informacion de perro 1 de la fundacion sisben para perros

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_perro_uno_sisben);

        btnAdop  =  findViewById(R.id.btnAdop2);
        btnAdop.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAdop2:

                Intent z = new Intent(this, DocPerroSisbenUno.class);
                startActivity(z);
                finish();

                break;
        }
    }
}