package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    RecyclerView recyclerView;
    VaccineModel[] vaccineModels;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        vaccineModels = new VaccineModel[]{
                new VaccineModel("Bat Man Vaccine", R.drawable.bat_hvoroba),
                new VaccineModel("Angry Bird Vaccine", R.drawable.bird_hvoroba),
                new VaccineModel("My ChSV Vaccine", R.drawable.corona_virus),
                new VaccineModel("Just Bolnoy Vaccine", R.drawable.vaccination),
                new VaccineModel("My King Vaccine", R.drawable.covid),
                new VaccineModel("Denis Vaccine", R.drawable.gero_hvoroba),
                new VaccineModel("Bat eater Vaccine", R.drawable.corona_virus),
                new VaccineModel("Marvel & Netflix Vaccine", R.drawable.spidor_hvoroba),
                new VaccineModel("Drug Vaccine", R.drawable.syringe),
                new VaccineModel("Bad people Vaccine", R.drawable.virus)
        };

        adapter = new MyAdapter(vaccineModels);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        adapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(
                this,
                "Vaccine name: " + vaccineModels[pos].getTitle(),
                Toast.LENGTH_SHORT)
                .show();
    }
}