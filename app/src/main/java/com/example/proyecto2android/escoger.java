package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escoger extends AppCompatActivity implements View.OnClickListener {

    private Button btnPerros, btnGato;

    //aqui se escoge si quiere ver perros o gatos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger);

        //estos son los botones de gato y perro
        btnPerros  =  findViewById(R.id.btnPerros);
        btnGato  =  findViewById(R.id.btnGato);

        btnPerros.setOnClickListener(this);
        btnGato.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPerros:
                Intent o = new Intent(this, sisbenPerros.class);
                startActivity(o);
                finish();

                break;
            case R.id.btnGato:
                Intent y = new Intent(this, SisbenGatos.class);
                startActivity(y);
                finish();

                break;



        }

    }
}