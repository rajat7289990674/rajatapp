package com.vmg.rajatapp;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Learnactivity extends AppCompatActivity {
   RecyclerView recyclerviewrnr;
ArrayList<Rankingmodel> rankingmodelArrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learnactivity);
        recyclerviewrnr=findViewById(R.id.recyclerviewrnr);
        setdata();
        recyclerviewrnr.setLayoutManager(new LinearLayoutManager(Learnactivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerviewrnr.setAdapter(new Learneradapter(Learnactivity.this,rankingmodelArrayList));
    }
    public void setdata(){
        Rankingmodel homemodel=new Rankingmodel();
        homemodel.setName("Why Invest ?");
        rankingmodelArrayList.add(homemodel);
        homemodel.setName("Basic of stock market");
        rankingmodelArrayList.add(homemodel);
        homemodel.setName("Blogs & Articles");
        rankingmodelArrayList.add(homemodel);
        homemodel.setName("Finding great companies");
        rankingmodelArrayList.add(homemodel);
        homemodel.setName("Yours investing life");
        rankingmodelArrayList.add(homemodel);
        homemodel.setName("Why Invest ?");
        rankingmodelArrayList.add(homemodel);
    }
}