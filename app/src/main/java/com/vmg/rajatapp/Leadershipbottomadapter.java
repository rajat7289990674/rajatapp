package com.vmg.rajatapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class Leadershipbottomadapter extends RecyclerView.Adapter<Leadershipbottomadapter.MyViewHolder> {
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
            product_img=view.findViewById(R.id.product_img);
            orderidtext=view.findViewById(R.id.orderidtext);

        }
    }

    public Leadershipbottomadapter(Context context,ArrayList<Rankingmodel> homemodelArrayList) {
        this.context=context;
        this.homemodelArrayList = homemodelArrayList;

    }

    @Override
    public Leadershipbottomadapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bottomrow, parent, false);
        return new Leadershipbottomadapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Leadershipbottomadapter.MyViewHolder holder, final int position) {

        holder.orderidtext.setText(homemodelArrayList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return homemodelArrayList.size();
    }
}

