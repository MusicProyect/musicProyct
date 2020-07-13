package com.example.musicproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.musicproject.model.Musica;

import java.util.ArrayList;
import java.util.List;

public class Album extends AppCompatActivity {

    private CustomAdapter adapter;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        list = findViewById(R.id.lista);
        List<Musica> arrayList = new ArrayList<Musica>();
        Musica mu1 = new Musica("Es un secreto", "200.051");
        Musica mu2 = new Musica("Si no le contesto", "50.051");
        Musica mu3 = new Musica("¿Por qué te demoras?", "9.000.051");
        Musica mu4 = new Musica("La nena de papi", "30.051");
        arrayList.add(mu1);
        arrayList.add(mu2);
        arrayList.add(mu3);
        arrayList.add(mu4);
        CustomAdapter arrayAdapter=new CustomAdapter(this,arrayList);
        list.setAdapter(arrayAdapter);


    }
}