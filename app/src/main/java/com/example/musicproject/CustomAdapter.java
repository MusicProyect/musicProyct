package com.example.musicproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicproject.model.Musica;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Musica> arr;

    public CustomAdapter(Context context, List<Musica> arr) {
        this.context = context;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.activity_mostrar_musicas_album,viewGroup,false);
        TextView titulo= view.findViewById(R.id.nombreCancion);
        TextView repro= view.findViewById(R.id.reproducciones);

        titulo.setText(arr.get(i).getNombre());
        repro.setText(arr.get(i).getReproducciones());

        return view;
    }
}
