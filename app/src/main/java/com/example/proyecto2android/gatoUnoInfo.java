package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gatoUnoInfo extends AppCompatActivity implements View.OnClickListener{
private Button btnAdop2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato_uno_info);




                btnAdop2  =  findViewById(R.id.btnAdop2);
        btnAdop2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAdop2:

                Intent u = new Intent(this, DocPerroSisbenUno.class);
                startActivity(u);
                finish();

                break;
        }
    }
}