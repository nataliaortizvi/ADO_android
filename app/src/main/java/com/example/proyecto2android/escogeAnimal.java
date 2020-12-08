package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class escogeAnimal extends AppCompatActivity {
 private ImageView btnPerros;
 private ImageView btnGatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoge_animal);
        //estos son los botones de gato y perro
        btnPerros  =  findViewById(R.id.btnPerros);
        btnGatos  =  findViewById(R.id.btnGatos);
    }
}