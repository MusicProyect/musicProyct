package com.example.musicproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.musicproject.model.Musica;
import com.example.musicproject.model.MusicaPlay;

import java.util.ArrayList;
import java.util.List;

public class ListaPlaylist extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_playlist);
        list = findViewById(R.id.lista2);
        List<MusicaPlay> arrayList = new ArrayList<MusicaPlay>();
        MusicaPlay mu1 = new MusicaPlay("Pa' romperla", "Bad Bunny, Don Omar", R.drawable.musi1);
        MusicaPlay mu2 = new MusicaPlay("Azul", "Jota Balvin", R.drawable.musi2);
        MusicaPlay mu3 = new MusicaPlay("El Efecto", "Rauw Alejandro, Chencho Corleone, Kevvo, Lyanno, Bryant Myers", R.drawable.musi3);
        MusicaPlay mu4 = new MusicaPlay("Safaera", "El gato malo", R.drawable.musi4);
        arrayList.add(mu1);
        arrayList.add(mu2);
        arrayList.add(mu3);
        arrayList.add(mu4);
        CustumAdapterPlay arrayAdapter=new CustumAdapterPlay(this,arrayList);
        list.setAdapter(arrayAdapter);
    }
}