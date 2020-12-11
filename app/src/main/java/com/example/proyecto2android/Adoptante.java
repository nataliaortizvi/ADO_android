package com.example.proyecto2android;

import com.google.firebase.auth.FirebaseUser;

public class Adoptante {

    private String id, telelefono, cc, direccion, salario, estrato, estado,nombre;
    private int status;


    public Adoptante () {

    }

    public Adoptante(String id, String telelefono, String cc, String direccion, String salario, String estrato, String estado, String nombre, int status) {
        this.id = id;
        this.telelefono = telelefono;
        this.cc = cc;
        this.direccion = direccion;
        this.salario = salario;
        this.estrato = estrato;
        this.estado = estado;
        this.nombre = nombre;
        this.status = status;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelelefono() {
        return telelefono;
    }

    public void setTelelefono(String telelefono) {
        this.telelefono = telelefono;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getStatus() { return status; }

    public void setStatus(int status) { this.status = status; }
}
