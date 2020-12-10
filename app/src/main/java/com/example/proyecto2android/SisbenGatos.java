package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SisbenGatos extends AppCompatActivity implements View.OnClickListener {

    private Button adopMonoBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sisben_gatos);

        adopMonoBtn = findViewById(R.id.adopMonoBtn);

        adopMonoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.adopMonoBtn:

                Intent i = new Intent (this, gatoUnoInfo.class);
                startActivity(i);
                finish();
        }
    }
}