package com.example.musicproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.musicproject.model.ListaUsuarioMo;
import com.example.musicproject.model.MusicaPlay;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuario extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuario);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

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
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailsIntent = new Intent(getApplicationContext(), ListaPlaylist.class);
                startActivity(detailsIntent);

            }
        });
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

    public void irConfiguracion(View v){
        Intent homeActivity = new Intent(getApplicationContext(), Configuracion.class);
        startActivity(homeActivity);

    }
}