package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infoPerroDosSisben extends AppCompatActivity implements View.OnClickListener {
    private Button BtnAdop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_perro_sisben_dos);

        BtnAdop = findViewById(R.id.BtnAdop);
        BtnAdop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnAdop:

                Intent a = new Intent(this, DocPerroSisbenUno.class);
                startActivity(a);
                finish();

                break;
        }
    }
}