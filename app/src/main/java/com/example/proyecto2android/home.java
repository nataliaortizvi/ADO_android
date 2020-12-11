package com.example.proyecto2android;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class home extends AppCompatActivity implements View.OnClickListener {

    private ImageView btnSisben, btnVet, btnAmor,btnMundo;
    private Button home, perfil, notif, salirbt;
    private TextView nombret, correot, contrat, titulohome, tituloperfil, titulonoti;
    private ListView laLista;

    private ConstraintLayout homeC, profileC, notiC;
    private String usuarioIn,fundacion;
    private Usuario userlog;

    private AdoptanteAdaptador adapter;

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

            homeC = findViewById(R.id.homeC);
            profileC = findViewById(R.id.profileC);

            //barra de navegacion
            home.setOnClickListener(this);
            perfil.setOnClickListener(this);
            notif.setOnClickListener(this);

            //elementos del home
            btnSisben = findViewById(R.id.btnSisben);
            btnVet = findViewById(R.id.btnVet);
            btnAmor = findViewById(R.id.btnAmor);
            btnMundo = findViewById(R.id.btnMundo);
            titulohome = findViewById(R.id.titulohome);

            btnSisben.setOnClickListener(this);
            btnVet.setOnClickListener(this);
            btnAmor.setOnClickListener(this);
            btnMundo.setOnClickListener(this);

            //elementos del perfil
            nombret = findViewById(R.id.nombret);
            correot = findViewById(R.id.correot);
            contrat = findViewById(R.id.contrat);
            salirbt = findViewById(R.id.salirbt);
            tituloperfil = findViewById(R.id.tituloperfil);

            salirbt.setOnClickListener(this);

            //elementos del notificaciones
            titulonoti = findViewById(R.id.titulonoti);
            laLista = findViewById(R.id.laLista);
            notiC = findViewById(R.id.notiC);

            //Adapatador
            adapter = new AdoptanteAdaptador();
            laLista.setAdapter(adapter);

            recoverUser();
            recoverSolicitudes();

        }
    }
    private void recoverSolicitudes() {
        DatabaseReference ref =  db.getReference().child("Ado").child("fundacion").child("Fundación Sisben para Perros y Gatos").child("solicitudes");
        ref.addValueEventListener(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot data) {
                        adapter.clear();
                        for(DataSnapshot child : data.getChildren()){
                            Log.e("sssssss",""+child);
                            Adoptante adoptante = child.getValue(Adoptante.class);
                            adapter.addAdoptante(adoptante);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                }
        );

    }

    private void recoverUser() {
        if(auth.getCurrentUser() != null){
            String id = auth.getCurrentUser().getUid();
            usuarioIn = id;
            db.getReference().child("usuarios").child(id).addListenerForSingleValueEvent( //ONCE
                    new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot data) {
                            userlog = data.getValue(Usuario.class);
                            nombret.setText(userlog.getNombre());
                            correot.setText(userlog.getCorreo());
                            contrat.setText(userlog.getContra());

                        }

                        @Override
                        public void onCancelled(DatabaseError error) {

                        }
                    }
            );
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
                fundacion = "Fundación Sisben para Perros y Gatos";

                SharedPreferences preferences = getSharedPreferences("fundacioncita",MODE_PRIVATE);
                preferences.edit().putString("fundacion",fundacion).apply();

                startActivity(p);
                finish();

                break;

            case R.id.btnVet:
                Intent a = new Intent(this,escoger.class);
                fundacion = "Fundación Veterinaria huellitas";

                SharedPreferences prefe= getSharedPreferences("fundacioncita",MODE_PRIVATE);
                prefe.edit().putString("fundacion",fundacion).apply();

                startActivity(a);
                finish();
                break;

            case R.id.btnAmor:
                Log.d(">>>>","oprimiendo pppppp");
                Toast.makeText(this, "Esta fundación aún no tiene mascotas...", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnMundo:
                Toast.makeText(this, "Esta fundación aún no tiene mascotas...", Toast.LENGTH_LONG).show();
                break;

            case R.id.perfil:
                Log.d(">>>>","oprimiendo pppppp");

                homeC.setVisibility(View.GONE);
                titulohome.setVisibility(View.GONE);

                titulonoti.setVisibility(View.GONE);
                notiC.setVisibility(View.GONE);

                profileC.setVisibility(View.VISIBLE);
                tituloperfil.setVisibility(View.VISIBLE);

                break;

            case R.id.notif:
                Log.d(">>>>","oprimiendo nnnnn");

                homeC.setVisibility(View.GONE);
                titulohome.setVisibility(View.GONE);

                profileC.setVisibility(View.GONE);
                tituloperfil.setVisibility(View.GONE);

                titulonoti.setVisibility(View.VISIBLE);
                notiC.setVisibility(View.VISIBLE);

                break;

            case R.id.home:
                Log.d(">>>>","oprimiendo hhhhhh");

                homeC.setVisibility(View.VISIBLE);
                titulohome.setVisibility(View.VISIBLE);

                titulonoti.setVisibility(View.GONE);
                notiC.setVisibility(View.GONE);

                profileC.setVisibility(View.GONE);
                tituloperfil.setVisibility(View.GONE);

                break;

            case R.id.salirbt:
                AlertDialog.Builder builder = new AlertDialog.Builder(this)
                        .setTitle("Cerrar sesión")
                        .setMessage("¿Esta seguro que desea cerrar sesión?")
                        .setNegativeButton("NO", (dialog, id) -> {
                            dialog.dismiss();
                        })
                        .setPositiveButton("SI", (dialog, id) -> {
                            auth.signOut();
                            gotoLogin();
                        });
                builder.show();

                break;
        }

    }
}