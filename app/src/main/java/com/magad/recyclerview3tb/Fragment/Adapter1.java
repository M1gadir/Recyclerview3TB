package com.magad.recyclerview3tb.Fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.magad.recyclerview3tb.R;

class Adapter1 extends RecyclerView.Adapter<Bunga> {
    String[] nama = {"melati","melata","sepatu","tulip","matahari","mawar"};
    int[] gamnam= {R.drawable.sunflower,R.drawable.sunflower,R.drawable.sunflower,R.drawable.sunflower,R.drawable.sunflower,R.drawable.sunflower};
    private final Context contex;

    public Adapter1(Context context) {
        contex = context;
    }

    @NonNull
    @Override
    public Bunga onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Bunga(LayoutInflater.from(contex).inflate(R.layout.list_bunga1,null));
    }

    @Override
    public void onBindViewHolder(@NonNull Bunga bunga, int i) {
        bunga.tv.setText(nama[i]);
        bunga.iv.setImageResource(gamnam[i]);
    }

    @Override
    public int getItemCount() {
        return nama.length;
    }
}
