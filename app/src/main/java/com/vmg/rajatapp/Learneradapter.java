package com.vmg.rajatapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class Learneradapter extends RecyclerView.Adapter<Learneradapter.MyViewHolder> {
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
            product_img=view.findViewById(R.id.profile_image);

        }
    }

    public Learneradapter(Context context,ArrayList<Rankingmodel> homemodelArrayList) {
        this.context=context;
        this.homemodelArrayList = homemodelArrayList;

    }

    @Override
    public Learneradapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.learnerlist, parent, false);
        return new Learneradapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Learneradapter.MyViewHolder holder, final int position) {
        holder.orderidtext.setText(homemodelArrayList.get(position).getName());
        Glide.with(context).load(R.drawable.learnerimg).into(holder.product_img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent=new Intent(context,Whyinvesractivity.class);
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return homemodelArrayList.size();
    }
}

