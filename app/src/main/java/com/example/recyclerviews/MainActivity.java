package com.example.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviews.Adapters.RecepieAdapter;
import com.example.recyclerviews.Models.RecepieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<RecepieModel>list = new ArrayList<>();
        list.add(new RecepieModel(R.drawable.second,"Sandwich"));
        list.add(new RecepieModel(R.drawable.third,"Paneer"));
        list.add(new RecepieModel(R.drawable.fourth,"Burger"));
        list.add(new RecepieModel(R.drawable.fifth,"Puff"));
        list.add(new RecepieModel(R.drawable.sixth,"Pani puri"));
        list.add(new RecepieModel(R.drawable.seventh,"Vadapav"));

        RecepieAdapter adapter = new RecepieAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        recyclerView.setLayoutManager(layoutManager);


    }
}