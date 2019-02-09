package com.magad.recyclerview3tb.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.recyclerview3tb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGridDua extends Fragment {

    Adapter2 adapter;
    RecyclerView rvg2;


    public FragmentGridDua() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_grid_dua, container, false);
        rvg2 = v.findViewById(R.id.rvgb2);
        adapter = new Adapter2(getActivity());
        rvg2.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvg2.setAdapter(adapter);




        return v;
    }

}
