package com.magad.recyclerview3tb.Fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.recyclerview3tb.R;

class Bunga extends RecyclerView.ViewHolder {
    ImageView iv;
    TextView tv;
    public Bunga(@NonNull View itemView) {
        super(itemView);
        iv = itemView.findViewById(R.id.imvb1);
        tv = itemView.findViewById(R.id.tvb1);
    }
}
