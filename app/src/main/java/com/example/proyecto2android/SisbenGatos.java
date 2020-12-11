package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SisbenGatos extends AppCompatActivity implements View.OnClickListener {

    private Button adopMonoBtn,adopTimyBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sisben_gatos);

        adopMonoBtn = findViewById(R.id.adopMonoBtn);
        adopTimyBtn = findViewById(R.id.adopTimyBtn);


        adopMonoBtn.setOnClickListener(this);
        adopTimyBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.adopMonoBtn:

                Intent i = new Intent (this, gatoUnoInfo.class);
                startActivity(i);
                finish();
                break;
            case R.id.adopTimyBtn:
                Intent u = new Intent (this, gatoInfoDos.class);
                startActivity(u);
                finish();
                break;

        }



    }
}