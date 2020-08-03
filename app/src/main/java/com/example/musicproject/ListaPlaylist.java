package com.example.musicproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.musicproject.model.Musica;
import com.example.musicproject.model.MusicaPlay;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class ListaPlaylist extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_playlist);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                Intent homeActivity = new Intent(getApplicationContext(), Home.class);
                startActivity(homeActivity);
                return true;

            case R.id.navigation_buscar:
                Intent bucarActivity = new Intent(getApplicationContext(), Busqueda.class);
                startActivity(bucarActivity);
                return true;

            case R.id.navigation_book:
                Intent listActivity = new Intent(getApplicationContext(), ListaUsuario.class);
                startActivity(listActivity);
                return true;
        }
        return false;
    }
}