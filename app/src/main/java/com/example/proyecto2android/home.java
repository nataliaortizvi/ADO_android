package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class home extends AppCompatActivity implements View.OnClickListener {

    private ImageView btnSisben, btnVet, btnAmor,btnMundo;
    private Button home, perfil, notif;

    private FirebaseAuth auth;
    private FirebaseDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();

        //si no hay un usuario loggeado entonces dirije al login
        if(auth.getCurrentUser() == null){
            gotoLogin();
        }else{
            home = findViewById(R.id.home);
            perfil = findViewById(R.id.perfil);
            notif = findViewById(R.id.notif);
            btnSisben = findViewById(R.id.btnSisben);
            btnVet = findViewById(R.id.btnVet);
            btnAmor = findViewById(R.id.btnAmor);
            btnMundo = findViewById(R.id.btnMundo);

            //barra de navegacion
            home.setOnClickListener(this);
            perfil.setOnClickListener(this);
            notif.setOnClickListener(this);

            btnSisben.setOnClickListener(this);
            btnVet.setOnClickListener(this);
            btnAmor.setOnClickListener(this);
            btnMundo.setOnClickListener(this);
        }
    }

    private void gotoLogin() {
        Intent i = new Intent(this, login.class);
        startActivity(i);
        finish();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSisben:
                Intent p = new Intent(this,escoger.class);
                startActivity(p);
                finish();

                break;
            case R.id.perfil:

                break;
            case R.id.notif:
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