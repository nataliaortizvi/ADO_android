package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity implements View.OnClickListener {

    private Button notengo, ingresarbt;
    private EditText mailtx, passtx;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //referenciar
        notengo = findViewById(R.id.ingresarbt);
        ingresarbt = findViewById(R.id.notengo);
        mailtx = findViewById(R.id.mailtx);
        passtx = findViewById(R.id.passtx);

        auth = FirebaseAuth.getInstance();

        //click
        notengo.setOnClickListener(this);
        ingresarbt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ingresarbt:
                auth.signInWithEmailAndPassword(mailtx.getText().toString(), passtx.getText().toString())
                        .addOnCompleteListener(
                          task -> {
                              if(task.isSuccessful()){
                                  Intent i = new Intent(this, home.class);
                                  startActivity(i);
                                  finish();
                              }else{
                                  Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                              }
                          }
                        );



                break;
            case R.id.notengo:
                Intent e = new Intent(this, signn.class);
                startActivity(e);
                finish();

                break;
        }
    }
}