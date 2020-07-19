package com.example.musicproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicproject.model.Musica;
import com.example.musicproject.model.MusicaPlay;

import java.util.List;

public class CustumAdapterPlay extends BaseAdapter {

    Context context;
    List<MusicaPlay> arr;

    public CustumAdapterPlay(Context context, List<MusicaPlay> arr) {
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

        view = LayoutInflater.from(context).inflate(R.layout.activity_mostrar_list_playlist,viewGroup,false);
        TextView titulo= view.findViewById(R.id.nombreCancion);
        ImageView portada= view.findViewById(R.id.album);
        TextView artista= view.findViewById(R.id.artista);

        titulo.setText(arr.get(i).getNombre());
        artista.setText(arr.get(i).getArtista());
        portada.setImageResource(arr.get(i).getImagenMusicplay());

        return view;
    }
}
