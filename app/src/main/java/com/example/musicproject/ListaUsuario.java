package com.example.musicproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.musicproject.model.ListaUsuarioMo;
import com.example.musicproject.model.MusicaPlay;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuario extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuario);
        list = findViewById(R.id.lista3);
        List<ListaUsuarioMo> arrayList = new ArrayList<ListaUsuarioMo>();
        ListaUsuarioMo mu1 = new ListaUsuarioMo("Crear playlist", "", R.drawable.addlist);
        ListaUsuarioMo mu2 = new ListaUsuarioMo("Canciones que te gustan", "11 canciones", R.drawable.musi2);
        ListaUsuarioMo mu3= new ListaUsuarioMo("Relax", "15 canciones", R.drawable.musi3);
        ListaUsuarioMo mu4= new ListaUsuarioMo("Cumbias", "13 canciones", R.drawable.musi4);
        ListaUsuarioMo mu5 = new ListaUsuarioMo("Canciones que te gustan", "11 canciones", R.drawable.musi1);
        ListaUsuarioMo mu6 = new ListaUsuarioMo("Fiesta", "23 canciones", R.drawable.musi2);
        ListaUsuarioMo mu7= new ListaUsuarioMo("Relax", "15 canciones", R.drawable.musi3);
        ListaUsuarioMo mu8= new ListaUsuarioMo("Cumbias", "13 canciones", R.drawable.musi4);
        arrayList.add(mu1);
        arrayList.add(mu2);
        arrayList.add(mu3);
        arrayList.add(mu4);
        arrayList.add(mu5);
        arrayList.add(mu6);
        arrayList.add(mu7);
        arrayList.add(mu8);
        CustomAdapterListUsuario arrayAdapter=new CustomAdapterListUsuario(this,arrayList);
        list.setAdapter(arrayAdapter);
    }
}