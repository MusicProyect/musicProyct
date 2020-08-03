package com.example.musicproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicproject.model.MusicaHome;
import com.example.musicproject.model.MusicaPlay;

import java.util.List;

public class CustomAdapteHome extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<MusicaHome> arr;

    public CustomAdapteHome(Context context, List<MusicaHome> arr) {
        this.context = context;
        this.arr = arr;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.activity_mostrar_musica_home,parent,false);
        Item item = new Item(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Item)holder).titulo.setText(arr.get(position).getNombre());
        ((Item)holder).portada.setImageResource(arr.get(position).getImagenmusicHome());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }


    public class Item extends RecyclerView.ViewHolder{
        TextView titulo;
        ImageView portada;
        public Item(@NonNull View itemView) {
            super(itemView);
            titulo= itemView.findViewById(R.id.nombreCancionhome);
            portada= itemView.findViewById(R.id.imagenhomealbum);
            

        }
    }

    /*
    Context context;
    List<MusicaHome> arr;

    public CustomAdapteHome(Context context, List<MusicaHome> arr) {
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

        view = LayoutInflater.from(context).inflate(R.layout.activity_mostrar_musica_home,viewGroup,false);
        TextView titulo= view.findViewById(R.id.nombreCancionhome);
        ImageView portada= view.findViewById(R.id.imagenhomealbum);

        titulo.setText(arr.get(i).getNombre());
        portada.setImageResource(arr.get(i).getImagenmusicHome());

        return view;
    }
    */

}
