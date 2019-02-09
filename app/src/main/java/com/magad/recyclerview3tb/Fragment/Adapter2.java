package com.magad.recyclerview3tb.Fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

class Adapter2 extends RecyclerView.Adapter<Magadir> {


    private final Context context1;

    public Adapter2(Context context) {
        context1 = context;
    }

    @NonNull
    @Override
    public Magadir onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Magadir magadir, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
