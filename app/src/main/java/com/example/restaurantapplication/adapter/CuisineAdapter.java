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
import com.example.restaurantapplication.model.Cuisine;

import java.util.List;


public class CuisineAdapter extends RecyclerView.Adapter<CuisineAdapter.CuisineViewHolder > {

    Context context;
    List<Cuisine> cuisineList;

    public CuisineAdapter(Context context, List<Cuisine> cuisineList) {
        this.context = context;
        cuisineList = cuisineList;
    }

    @NonNull
    @Override
    public CuisineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cusinie_row_item,parent,false);
        return new CuisineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CuisineViewHolder holder, int position) {
        holder.foodImage.setImageResource(cuisineList.get(position).getImageUrl());
        holder.name.setText(cuisineList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return cuisineList.size();
    }


    public static final class CuisineViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView name;

         public CuisineViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage=itemView.findViewById(R.id.food_image);
            name=itemView.findViewById(R.id.name);
        }
    }
}
