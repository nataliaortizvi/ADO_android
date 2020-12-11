package com.example.proyecto2android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AdoptanteAdaptador extends BaseAdapter {

    private FirebaseDatabase db;
    private FirebaseAuth auth;

    private Adoptante adoptantes;
    private ArrayList<Adoptante> adoptante;



    private String theStatus;

    public AdoptanteAdaptador () {
        adoptante = new ArrayList<>();
    }

    public void addAdoptante (Adoptante adoptantes) {
        adoptante.add(adoptantes);
        notifyDataSetChanged();
    }

    public void clear() {
        adoptante.clear();
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return adoptante.size();
    }

    @Override
    public Object getItem(int position) {
        return adoptante.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int pos, View renglon, ViewGroup lista) {
        LayoutInflater inflater = LayoutInflater.from(lista.getContext());
        View renglonView = inflater.inflate(R.layout.row, null);

        Adoptante adoptantes = adoptante.get(pos);

        Button btnIr = renglonView.findViewById(R.id.btnIr);
        TextView status = renglonView.findViewById(R.id.status);
        TextView solicitud = renglonView.findViewById(R.id.solicitud);

        solicitud.setText(adoptantes.getId());
        status.setText(adoptantes.getStatus());

        btnIr.setOnClickListener(
                (v) -> {
                    String id = adoptantes.getId();
                    DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Ado").child("fundacion").child("Fundación Sisben para Perros y Gatos").child("solicitudes").child(id);
                    DatabaseReference refs = FirebaseDatabase.getInstance().getReference().child("Ado").child("fundacion").child("Fundación Veterinaria huellitas").child("solicitudes").child(id);
                    ref.setValue(null);
                    refs.setValue(null);
                }
        );
        return renglonView;
        }

    }


