package com.example.restaurantapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapplication.R;
import com.example.restaurantapplication.model.North;

import java.util.ArrayList;
import java.util.List;


public class NorthAdapter extends RecyclerView.Adapter<NorthAdapter.NorthViewHolder > {

    Context context;
    List<North> NorthList=new ArrayList<>();

    public NorthAdapter(Context context, List<North> famousList) {
        this.context = context;
        this.NorthList = NorthList;
    }

    @NonNull
    @Override
    public NorthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.north_row_item,parent,false);
        return new NorthViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NorthViewHolder holder, int position) {
        holder.foodImage.setImageResource(NorthList.get(position).getImageUrl());
        holder.name.setText(NorthList.get(position).getName());
        holder.price.setText(NorthList.get(position).getPrice());
        holder.rating.setText(NorthList.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return NorthList.size();
    }


    public static final class NorthViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView name,price,rating;

        public NorthViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage=itemView.findViewById(R.id.food_image);
            name=itemView.findViewById(R.id.northname);
            price=itemView.findViewById(R.id.price);
            rating=itemView.findViewById(R.id.rating);


        }
    }
}
