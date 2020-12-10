package com.example.proyecto2android;

public class Usuario {
    private String nombre, correo, id, contra;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String id, String contra) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.contra = contra;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
