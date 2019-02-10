package com.magad.recyclerview3tb.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.magad.recyclerview3tb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGridTiga extends Fragment {

    RecyclerView rv;
    Adapter3 adapter;


    public FragmentGridTiga() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View c = inflater.inflate(R.layout.fragment_fragment_grid_tiga, container, false);
        rv = c.findViewById(R.id.rvid3);
        adapter = new Adapter3(getActivity());
        rv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rv.setAdapter(adapter);



        return c;
    }

}
