package com.example.musicproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Configuracion extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
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