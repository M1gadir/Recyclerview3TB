package com.magad.recyclerview3tb.Fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.magad.recyclerview3tb.R;

class Adapter2 extends RecyclerView.Adapter<Magadir> {

    String[] name = {"lampu","printer","layar","keyboard","pintu"};
    int[] gamne = {R.drawable.sunsun,R.drawable.sunsun,R.drawable.sunsun,R.drawable.sunsun,R.drawable.sunsun};
    private final Context context1;

    public Adapter2(Context context) {
        context1 = context;
    }

    @NonNull
    @Override
    public Magadir onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Magadir(LayoutInflater.from(context1).inflate(R.layout.list_b2,null));
    }

    @Override
    public void onBindViewHolder(@NonNull Magadir magadir, int i) {
        magadir.tv.setText(name[i]);
        magadir.iv.setImageResource(gamne[i]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
