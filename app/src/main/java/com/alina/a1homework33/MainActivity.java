package com.alina.a1homework33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     private ArrayList<String> animalList;
     private AnimalAdapter adapter;
     private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_animals);
        loadData();
        adapter=new AnimalAdapter(animalList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        animalList=new ArrayList<>();
        animalList.add("Cat");
        animalList.add("Dog");
        animalList.add("Horse");
        animalList.add("Lion");
        animalList.add("Snake");
        animalList.add("Rabbit");
        animalList.add("Cow");
        animalList.add("Zebra");
        animalList.add("Duck");
        animalList.add("Sheep");
    }
}