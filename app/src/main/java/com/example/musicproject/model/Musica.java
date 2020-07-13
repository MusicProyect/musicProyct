package com.example.musicproject.model;

public class Musica {
 String nombre;
 String reproducciones;

    public Musica(String nombre, String reproducciones) {
        this.nombre = nombre;
        this.reproducciones = reproducciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(String reproducciones) {
        this.reproducciones = reproducciones;
    }
}
