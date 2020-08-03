package com.example.musicproject.model;

public class MusicaHome {
    private String nombre;
    private int imagenmusicHome;

    public MusicaHome(String nombre, int imagenmusicHome) {
        this.nombre = nombre;
        this.imagenmusicHome = imagenmusicHome;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagenmusicHome() {
        return imagenmusicHome;
    }

    public void setImagenmusicHome(int imagenmusicHome) {
        this.imagenmusicHome = imagenmusicHome;
    }
}
