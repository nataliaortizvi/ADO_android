package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sisbenPerros extends AppCompatActivity implements View.OnClickListener{
    private Button btnInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sisben_perros);

        //aqui se ve el feed de todos los perros que tiene la fundacion Sisben para perros(la primera que aparece en el home)

        btnInfo =  findViewById(R.id.btnInfo);

        btnInfo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnInfo:

                Intent p = new Intent(this,infoPerroUnoSisben.class);
                startActivity(p);
                finish();

                break;
        }
    }

}