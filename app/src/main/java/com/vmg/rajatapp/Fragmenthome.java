package com.vmg.rajatapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragmenthome extends Fragment {
    ArrayList<Homemodel> homemodelArrayList=new ArrayList<>();
    RecyclerView recyclerhome;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerhome=view.findViewById(R.id.recyclerhome);
        setdata();
        recyclerhome.setNestedScrollingEnabled(false);
        recyclerhome.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        Homeadapter categoryviewalladapter=new Homeadapter(getActivity(),homemodelArrayList);
        recyclerhome.setAdapter(categoryviewalladapter);

        return view;
    }
    public void setdata(){
        Homemodel homemodel=new Homemodel();
        homemodel.setText("Learn with RNR");
        homemodel.setText2("Start Now ->");
        homemodel.setImages(String.valueOf(R.drawable.one));
        homemodelArrayList.add(homemodel);
        homemodel.setText("videos");
        homemodel.setText2("watch now ->");
        homemodel.setImages(String.valueOf(R.drawable.two));
        homemodelArrayList.add(homemodel);
        homemodel.setText("Blogs & Articles");
        homemodel.setText2("Start now ->");
        homemodel.setImages(String.valueOf(R.drawable.three));
        homemodelArrayList.add(homemodel);
        homemodel.setText("Monthly Newsletter");
        homemodel.setText2("Explore now ->");
        homemodel.setImages(String.valueOf(R.drawable.four));
        homemodelArrayList.add(homemodel);
        homemodel.setText("Announsments");
        homemodel.setText2("Explore now ->");
        homemodel.setImages(String.valueOf(R.drawable.five));
        homemodelArrayList.add(homemodel);
        homemodel.setText("Monthly Research");
        homemodel.setText2("Explore Now ->");
        homemodel.setImages(String.valueOf(R.drawable.six));
        homemodelArrayList.add(homemodel);
    }
}