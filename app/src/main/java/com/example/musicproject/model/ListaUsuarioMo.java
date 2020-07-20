package com.example.musicproject.model;

public class ListaUsuarioMo {
    private String nombre;
    private String cantidad;
    private int imagenMusicplay;

    public ListaUsuarioMo(String nombre, String cantidad, int imagenMusicplay) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.imagenMusicplay = imagenMusicplay;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getImagenMusicplay() {
        return imagenMusicplay;
    }

    public void setImagenMusicplay(int imagenMusicplay) {
        this.imagenMusicplay = imagenMusicplay;
    }
}
