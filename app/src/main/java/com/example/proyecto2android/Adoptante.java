package com.example.proyecto2android;

public class Adoptante {

    private String id, telelefono, cc, direccion, salario, estrato, estado;

    public Adoptante () {

    }

    public Adoptante(String id, String telelefono, String cc, String direccion, String salario, String estrato, String estado) {
        this.id = id;
        this.telelefono = telelefono;
        this.cc = cc;
        this.direccion = direccion;
        this.salario = salario;
        this.estrato = estrato;
        this.estado = estado;
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
}
