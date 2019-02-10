package com.magad.recyclerview3tb.Fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.magad.recyclerview3tb.R;

class Adapter3 extends RecyclerView.Adapter<Galardino> {
    String[] namab = {"button","ImageView","Spinner","EditText","Back","Next"};
    int[] gamb = {R.drawable.sunsun,R.drawable.sunflower,R.drawable.rose,R.drawable.sunflower,R.drawable.sunflower,R.drawable.sunsun};
    Context contet;

    public Adapter3(Context context) {
        this.contet = context;
    }

    @NonNull
    @Override
    public Galardino onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Galardino(LayoutInflater.from(contet).inflate(R.layout.list_b3,null));
    }

    @Override
    public void onBindViewHolder(@NonNull Galardino galardino, int i) {
    galardino.iv.setImageResource(gamb[i]);
    galardino.tv.setText(namab[i]);
    }

    @Override
    public int getItemCount() {
        return namab.length;
    }
}
