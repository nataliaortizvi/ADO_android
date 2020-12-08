package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar
        startbt = findViewById(R.id.startbt);

        //paso a la primera pantalla
        startbt.setOnClickListener(
                (view)->{
                    Intent i = new Intent(this, login.class);
                    startActivity(i);
                    finish();
                }
        );
    }
}