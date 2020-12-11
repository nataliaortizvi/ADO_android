package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gatoInfoDos extends AppCompatActivity implements View.OnClickListener {

    private Button btnAdop3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gato_info_dos);
        btnAdop3 = findViewById(R.id.btnAdop2);
        btnAdop3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAdop2:

                Intent h = new Intent(this, DocPerroSisbenUno.class);
                startActivity(h);
                finish();

                break;
        }



    }
}