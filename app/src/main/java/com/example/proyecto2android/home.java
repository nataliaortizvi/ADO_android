package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class home extends AppCompatActivity {

    private ImageView btnFAmor;
    private ImageView btnFsisben;
    private ImageView btnFmundo;
    private ImageView btnFvet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnFAmor  =  findViewById(R.id.btnFAmor);
        btnFsisben  =  findViewById(R.id.btnFsisben);
        btnFmundo  =  findViewById(R.id.btnFmundo);
        btnFmundo  =  findViewById(R.id.btnFmundo);

    }
}