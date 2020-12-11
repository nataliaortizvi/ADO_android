package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DocPerroSisbenUno extends AppCompatActivity implements View.OnClickListener {

    private FirebaseDatabase db;
    private FirebaseAuth auth;

    private EditText txtelefono;
    private EditText txcedula;
    private EditText txdireccion;
    private EditText txsalario;
    private EditText txtestrato;
    private EditText txestado;

    private Button uploadBtn;
    String fundacion;
    private String nombre;
    private Adoptante userloguno;


    //aqui se pondrá la info que se debe llenar para hacer el proceso de adopción, este es eldocumento para el perro 1 de la fundación sisben para perros



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_perro_sisben_uno);

        db = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();

        txtelefono = findViewById(R.id.txtelefono);
        txcedula = findViewById(R.id.txcedula);
        txdireccion = findViewById(R.id.txdireccion);
        txsalario = findViewById(R.id.txsalario);
        txtestrato = findViewById(R.id.txestrato);
        txestado  =  findViewById(R.id.txestado);

        uploadBtn  =  findViewById(R.id.uploadBtn);

        uploadBtn.setOnClickListener(this);
        fundacion = getSharedPreferences("fundacioncita",MODE_PRIVATE).getString("fundacion","NO_FUNDACION");

        recoverUser();






    }

    private void recoverUser() {
        if(auth.getCurrentUser() != null){
            String id = auth.getCurrentUser().getUid();

            db.getReference().child("usuarios").child(id).addListenerForSingleValueEvent( //ONCE
                    new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot data) {
                            userloguno = data.getValue(Adoptante.class);
                            nombre= userloguno.getNombre();



                        }

                        @Override
                        public void onCancelled(DatabaseError error) {

                        }
                    }
            );
        }
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.uploadBtn:
                String tel = txtelefono.getText().toString();
                String cc = txcedula.getText().toString();
                String dir = txdireccion.getText().toString();
                String sal = txsalario.getText().toString();
                String estra = txtestrato.getText().toString();
                String esta = txestado.getText().toString();
                if( tel.equals("") ||cc.equals("")|| dir.equals("")|| sal.equals("")|| estra.equals("")|| esta.equals("")){

                    Toast.makeText(this,"Llene el espacio en blanco",Toast.LENGTH_LONG).show();

                }else {
                    String id = db.getReference().child("Ado").child("fundacion").child(fundacion).child("solicitudes").push().getKey();


                    DatabaseReference reference = db.getReference().child("Ado").child("fundacion").child(fundacion).child("solicitudes").child(id);


                    Adoptante adoptante = new Adoptante(
                            id,
                            txtelefono.getText().toString(),
                            txcedula.getText().toString(),
                            txdireccion.getText().toString(),
                            txsalario.getText().toString(),
                            txtestrato.getText().toString(),
                            txestado.getText().toString(),
                            nombre,
                            0

                    );

                    reference.setValue(adoptante);
                    Intent d = new Intent(this, home.class);
                    startActivity(d);
                    finish();
                }


                break;
        }
    }
}