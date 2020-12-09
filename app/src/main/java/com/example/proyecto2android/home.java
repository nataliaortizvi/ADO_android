package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;

public class home extends AppCompatActivity implements View.OnClickListener {

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

        btnSisben.setOnClickListener(this);
        btnVet.setOnClickListener(this);
        btnAmor.setOnClickListener(this);
        btnMundo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSisben:

                Intent p = new Intent(this,escogeAnimal.class);
                startActivity(p);
                finish();

                break;
            case R.id.btnVet:

                break;
            case R.id.btnAmor:

                break;
            case R.id.btnMundo:

                break;
        }

    }
}