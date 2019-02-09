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
public class FragmentGridSatu extends Fragment {

    Adapter1 adapter;
    RecyclerView rvg1;


    public FragmentGridSatu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_grid_satu, container, false);
        rvg1 = v.findViewById(R.id.rvg1);
        adapter = new Adapter1(getActivity());
        rvg1.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvg1.setAdapter(adapter);




        return v;
    }

}
