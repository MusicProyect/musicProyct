package com.example.musicproject.model;

public class MusicaPlay {
    private String nombre;
    private String artista;
    private int imagenMusicplay;

    public MusicaPlay(String nombre, String artista, int imagenMusicplay) {
        this.nombre = nombre;
        this.artista = artista;
        this.imagenMusicplay = imagenMusicplay;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getImagenMusicplay() {
        return imagenMusicplay;
    }

    public void setImagenMusicplay(int imagenMusicplay) {
        this.imagenMusicplay = imagenMusicplay;
    }
}
