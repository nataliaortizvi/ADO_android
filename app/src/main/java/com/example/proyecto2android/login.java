package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity implements View.OnClickListener {

    Button logbt, registrobt;
    EditText mailtx, passtx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //referenciar
        logbt = findViewById(R.id.logbt);
        registrobt = findViewById(R.id.registrobt);
        mailtx = findViewById(R.id.mailtx);
        passtx = findViewById(R.id.passtx);

        //click
        logbt.setOnClickListener(this);
        registrobt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.logbt:
                Intent i = new Intent(this, home.class);
                startActivity(i);
                finish();

                break;
            case R.id.registrobt:
                Intent e = new Intent(this, signup.class);
                startActivity(e);
                finish();

                break;
        }
    }
}