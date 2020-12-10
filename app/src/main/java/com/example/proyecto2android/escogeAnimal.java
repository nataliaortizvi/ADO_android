package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class escogeAnimal extends AppCompatActivity  implements View.OnClickListener {
 private ImageView btnPerros;
 private ImageView btnGatos;
 private TextView Perros;

 //aqui se escoge si quiere ver perros o gatos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoge_animal);
        //estos son los botones de gato y perro
        btnPerros  =  findViewById(R.id.btnPerros);
        btnGatos  =  findViewById(R.id.btnGatos);

        Perros  =  findViewById(R.id.Perros);


        Perros.setOnClickListener(this);
        btnGatos.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Perros:

                Intent o = new Intent(this, sisbenPerros.class);

                startActivity(o);

                finish();

                break;
            case R.id.btnGatos:

                Intent y = new Intent(this, gatoUnoInfo .class);

                startActivity(y);

                finish();

                break;



        }
    }
}