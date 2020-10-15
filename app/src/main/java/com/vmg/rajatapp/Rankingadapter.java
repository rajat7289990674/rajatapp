package com.vmg.rajatapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class Rankingadapter extends RecyclerView.Adapter<Rankingadapter.MyViewHolder> {
    private int lastSelectedPosition = -1;
    Context context;
    String extention;
    ArrayList<Rankingmodel> homemodelArrayList= new ArrayList<>();
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nane;
        ImageView product_img;
        TextView orderidtext,watch;

        public MyViewHolder(View view) {
            super(view);
            orderidtext=view.findViewById(R.id.orderidtext);

        }
    }

    public Rankingadapter(Context context,ArrayList<Rankingmodel> homemodelArrayList) {
        this.context=context;
        this.homemodelArrayList = homemodelArrayList;

    }

    @Override
    public Rankingadapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rankinglist, parent, false);
        return new Rankingadapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Rankingadapter.MyViewHolder holder, final int position) {
      holder.orderidtext.setText(homemodelArrayList.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return homemodelArrayList.size();
    }
}
