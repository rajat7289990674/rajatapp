package com.vmg.rajatapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Leadershipfragment extends Fragment {
    ArrayList<Rankingmodel> rankingmodelArrayList=new ArrayList<>();
    RecyclerView recyclerviewrank,recyclerviewdata;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.leadership, container, false);
        recyclerviewrank=view.findViewById(R.id.recyclerviewrank);
        recyclerviewdata=view.findViewById(R.id.recyclerviewdata);
        setdata();
        recyclerviewrank.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerviewrank.setAdapter(new Rankingadapter(getActivity(),rankingmodelArrayList));
        recyclerviewdata.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerviewdata.setAdapter(new Leadershipbottomadapter(getActivity(),rankingmodelArrayList));

        return view;
    }
    public void setdata(){
        Rankingmodel rankingmodel=new Rankingmodel();
        rankingmodel.setName("Sharang");
        rankingmodel.setDevision("17800 Points");
        rankingmodelArrayList.add(rankingmodel);
        rankingmodel.setName("Divya");
        rankingmodel.setDevision("2000 points");
        rankingmodelArrayList.add(rankingmodel);
        rankingmodel.setName("Abhijeet");
        rankingmodel.setDevision("1700 Points");
        rankingmodelArrayList.add(rankingmodel);
    }
}
