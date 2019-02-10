package com.magad.recyclerview3tb.Fragment;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.recyclerview3tb.R;

class Galardino extends RecyclerView.ViewHolder {
    ImageView iv;
TextView tv;
    public Galardino(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv3);
        iv = itemView.findViewById(R.id.imv3);
    }
}
