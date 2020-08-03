package com.example.musicproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.example.musicproject.model.ListaUsuarioMo;
import com.example.musicproject.model.Musica;
import com.example.musicproject.model.MusicaHome;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.my_recycler_view2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        layoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager2);

        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.my_recycler_view3);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this);
        layoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView3.setLayoutManager(layoutManager3);

        List<MusicaHome> arrayList = new ArrayList<MusicaHome>();
        MusicaHome mu1 = new MusicaHome("NombreAlbum1",  R.drawable.musi1);
        MusicaHome mu2 = new MusicaHome("NombreAlbum2",  R.drawable.musi2);
        MusicaHome mu3= new MusicaHome("NombreAlbum3",  R.drawable.musi3);
        MusicaHome mu4= new MusicaHome("NombreAlbum4",  R.drawable.musi4);
        MusicaHome mu5 = new MusicaHome("NombreAlbum5",  R.drawable.musi1);

        arrayList.add(mu1);
        arrayList.add(mu2);
        arrayList.add(mu3);
        arrayList.add(mu4);
        arrayList.add(mu5);

        CustomAdapteHome adapter = new CustomAdapteHome(this, arrayList );
        recyclerView.setAdapter(adapter);

        CustomAdapteHome adapter2 = new CustomAdapteHome(this, arrayList );
        recyclerView2.setAdapter(adapter2);
        CustomAdapteHome adapter3 = new CustomAdapteHome(this, arrayList );
        recyclerView3.setAdapter(adapter3);

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
    public void irReproductor(View v){
        Intent homeActivity = new Intent(getApplicationContext(), Reproductor.class);
        startActivity(homeActivity);

    }

}