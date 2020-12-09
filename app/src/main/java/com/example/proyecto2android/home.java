package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class home extends AppCompatActivity {

private ImageView btnSisben;
    private ImageView btnVet;
    private ImageView btnAmor;
    private ImageView btnMundo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSisben  =  findViewById(R.id.btnSisben);
        btnVet  =  findViewById(R.id.btnVet);
        btnAmor  =  findViewById(R.id.btnAmor);
        btnMundo  =  findViewById(R.id.btnMundo);


    }
}