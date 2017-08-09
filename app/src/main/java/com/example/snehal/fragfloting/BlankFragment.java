package com.example.snehal.fragfloting;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BlankFragment extends Fragment implements View.OnClickListener{
    FloatingActionButton fab;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        fab = (FloatingActionButton) view.findViewById(R.id.fabb);
        fab.setOnClickListener(this);
        return view;
    }
    public void onClick(View view)
    {
        if(view.getId()==R.id.fabb)
        {
            NextFragment nextFragment=new NextFragment();
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content,nextFragment).addToBackStack(null).commit();

        }


    }



}