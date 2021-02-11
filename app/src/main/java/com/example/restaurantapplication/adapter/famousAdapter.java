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
import com.example.restaurantapplication.model.famous;

import java.util.List;


public class famousAdapter extends RecyclerView.Adapter<famousAdapter.famousViewHolder > {

    Context context;
    List<famous> famousList;

    public famousAdapter(Context context, List<famous> famousList) {
        this.context = context;
        this.famousList = famousList;
    }

    @NonNull
    @Override
    public famousViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.famous_row_item,parent,false);
        return new famousViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull famousViewHolder holder, int position) {
        holder.foodImage.setImageResource(famousList.get(position).getImageUrl());
        holder.name.setText(famousList.get(position).getName());
        holder.price.setText(famousList.get(position).getPrice());
        holder.rating.setText(famousList.get(position).getRating());

    }

    @Override
    public int getItemCount() {
        return famousList.size();
    }


    public static final class famousViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView name,price,rating;

        public famousViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage=itemView.findViewById(R.id.food_image);
            name=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.price);
            rating=itemView.findViewById(R.id.rating);


        }
    }
}
