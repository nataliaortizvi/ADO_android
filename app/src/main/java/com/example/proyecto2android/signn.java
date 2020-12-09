package com.example.proyecto2android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class signn extends AppCompatActivity  implements View.OnClickListener {

    private Button registrarsebt, yatengo;
    private EditText nomtx, correotx, contratx, contra2tx;
    private FirebaseDatabase db;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signn);

        //referenciar
        registrarsebt = findViewById(R.id.registrarsebt);
        yatengo = findViewById(R.id.yatengo);
        nomtx = findViewById(R.id.nomtx);
        correotx = findViewById(R.id.correotx);
        contratx = findViewById(R.id.contratx);
        contra2tx = findViewById(R.id.contra2tx);

        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();

        //click
        yatengo.setOnClickListener(this);
        registrarsebt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.registrarsebt:
                if(nomtx.getText().toString().equals(null) || nomtx.getText().toString().equals("")){
                    Toast.makeText(this, "Llene todos los campos", Toast.LENGTH_LONG).show();
                }else{

                    if(contratx.getText().toString().equals(contra2tx.getText().toString())){
                        auth.createUserWithEmailAndPassword(correotx.getText().toString(), contratx.getText().toString())
                                .addOnCompleteListener(
                                        task -> {
                                            if(task.isSuccessful()){
                                                String id = auth.getCurrentUser().getUid();
                                                Usuario usuario = new Usuario(
                                                        nomtx.getText().toString(),
                                                        correotx.getText().toString(),
                                                        id,
                                                        contratx.getText().toString()
                                                );
                                                db.getReference().child("usuarios").child(id).setValue(usuario)
                                                        .addOnCompleteListener(
                                                          taskdb -> {
                                                              if(taskdb.isSuccessful()){
                                                                  Intent i = new Intent(this, home.class);
                                                                  startActivity(i);
                                                                  finish();
                                                              }
                                                          }
                                                        );
                                            }
                                        }
                                );

                    }else{
                        Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_LONG).show();
                    }

                }



                break;
            case R.id.yatengo:
                Intent e = new Intent(this, login.class);
                startActivity(e);
                finish();

                break;
        }
    }
}