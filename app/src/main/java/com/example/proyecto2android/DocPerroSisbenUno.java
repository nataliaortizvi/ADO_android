package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class DocPerroSisbenUno extends AppCompatActivity {

    private EditText txestado;
    private Button uploadbt;
    private FirebaseDatabase db;
    private FirebaseAuth auth;

    //aqui se pondrá la info que se debe llenar para hacer el proceso de adopción, este es eldocumento para el perro 1 de la fundación sisben para perros

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_perro_sisben_uno);

        txestado  =  findViewById(R.id.txestado);
        uploadbt  =  findViewById(R.id.uploadbt);

        db = FirebaseDatabase.getInstance();
    }
}