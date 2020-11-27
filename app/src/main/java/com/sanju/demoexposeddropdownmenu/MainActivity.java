package com.sanju.demoexposeddropdownmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView act_seasons;
    TextInputLayout til_season;

    ArrayList <String> seasonsList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        til_season = findViewById(R.id.til_season);
        act_seasons = findViewById(R.id.act_seasons);
        seasonsList = new ArrayList<>();
        seasonsList.add("Winter");
        seasonsList.add("Spring");
        seasonsList.add("Summer");
        seasonsList.add("Monsoon");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.spinner_drop_down_single_row,seasonsList);
        act_seasons.setAdapter(arrayAdapter);
        act_seasons.setThreshold(1);
    }
}