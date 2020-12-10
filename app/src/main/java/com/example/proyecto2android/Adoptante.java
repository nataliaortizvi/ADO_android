package com.example.proyecto2android;

public class Adoptante {

    private String id, tel, cc, dir, sal, estra, esta;

    public Adoptante () {

    }

    public Adoptante (String id, String tel, String cc, String dir, String sal, String estra, String esta) {
        this.id = id;
        this.tel = tel;
        this.cc = cc;
        this.dir = dir;
        this.sal = sal;
        this.estra = estra;
        this.esta = esta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getEstra() {
        return estra;
    }

    public void setEstra(String estra) {
        this.estra = estra;
    }

    public String getEsta() {
        return esta;
    }

    public void setEsta(String esta) {
        this.esta = esta;
    }
}
