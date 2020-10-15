package com.vmg.rajatapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class Homeadapter extends RecyclerView.Adapter<Homeadapter.MyViewHolder> {
    private int lastSelectedPosition = -1;
    Context context;
    String extention;
    ArrayList<Homemodel> homemodelArrayList= new ArrayList<>();
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nane;
        ImageView product_img;
        TextView product_name,watch;

        public MyViewHolder(View view) {
            super(view);
            product_img=view.findViewById(R.id.product_img);
            product_name=view.findViewById(R.id.product_name);
            watch=view.findViewById(R.id.watch);

        }
    }

    public Homeadapter(Context context,ArrayList<Homemodel> homemodelArrayList) {
        this.context=context;
        this.homemodelArrayList = homemodelArrayList;

    }

    @Override
    public Homeadapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.homeitem, parent, false);
        return new Homeadapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Homeadapter.MyViewHolder holder, final int position) {

    holder.product_name.setText(homemodelArrayList.get(position).getText());
    holder.watch.setText(homemodelArrayList.get(position).getText2());
        Glide.with(context).load(R.drawable.one).into(holder.product_img);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Intent intent=new Intent(context,Learnactivity.class);
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

