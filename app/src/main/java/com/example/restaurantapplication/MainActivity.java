package com.example.restaurantapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.restaurantapplication.adapter.CuisineAdapter;
import com.example.restaurantapplication.adapter.NorthAdapter;
import com.example.restaurantapplication.adapter.famousAdapter;
import com.example.restaurantapplication.model.Cuisine;
import com.example.restaurantapplication.model.famous;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView cuisineRecycler,FamousRecycler,northRecycler;
famousAdapter FamousAdapter;
NorthAdapter northAdapter;
CuisineAdapter cuisineAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Cuisine> cuisineList =new ArrayList<>();
        cuisineList.add(new Cuisine("North Indian",R.drawable.northindian));
        cuisineList.add(new Cuisine("Chinese",R.drawable.chinese));
        cuisineList.add(new Cuisine("Mexican",R.drawable.mexican));
        cuisineList.add(new Cuisine("South Indian",R.drawable.southindian));
        cuisineList.add(new Cuisine("Italian",R.drawable.italian));
        setCuisineRecycler(cuisineList);
        List<famous> famousList =new ArrayList<>();
        famousList.add(new famous("Chole Bhature",R.drawable.cb,"150rs.","4.8" ));
        famousList.add(new famous("Italian Pizza",R.drawable.pizza, "300rs.","4.7"));
        famousList.add(new famous("Paav Bhaaji",R.drawable.pb,"110rs.","4.5"));
        setFamousRecycler(famousList);

    }
    private void setCuisineRecycler(List<Cuisine> cuisineList){
        cuisineRecycler=findViewById(R.id.cuisine_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        cuisineRecycler.setLayoutManager(layoutManager);
        cuisineAdapter =new CuisineAdapter(this,cuisineList);
        cuisineRecycler.setAdapter(cuisineAdapter);
    }
    private void setFamousRecycler(List<famous> famousList){
     FamousRecycler=findViewById(R.id.famous_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        FamousRecycler.setLayoutManager(layoutManager);
        FamousAdapter =new famousAdapter(this,famousList);
        FamousRecycler.setAdapter(FamousAdapter);
    }

    public void openNorthindian(View view) {
        startActivity(new Intent(this,NorthIndian.class));
    }
}