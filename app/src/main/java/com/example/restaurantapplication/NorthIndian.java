package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantapplication.adapter.NorthAdapter;
import com.example.restaurantapplication.model.North;

import java.util.ArrayList;
import java.util.List;

public class NorthIndian extends AppCompatActivity {
    RecyclerView northRecycler;
    NorthAdapter northAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northindian);


        List<North> NorthList =new ArrayList<>();
        NorthList.add(new North("Chole Bhature",R.drawable.cb,"150rs.","4.8" ));
        NorthList.add(new North("Kadhai paneer",R.drawable.northindian, "480rs.","4.4"));
        NorthList.add(new North("Biryani",R.drawable.biryani,"250rs.","4.6"));
        NorthList.add(new North("Veg Thali",R.drawable.thali,"200rs.","4.2"));
        setNorthRecycler(NorthList);

    }

    private void setNorthRecycler(List<North> NorthList){
        northRecycler=findViewById(R.id.North_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        northRecycler.setLayoutManager(layoutManager);
        northAdapter =new NorthAdapter(this,NorthList);
        northRecycler.setAdapter(northAdapter);
    }
}