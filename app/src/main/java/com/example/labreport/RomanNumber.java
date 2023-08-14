package com.example.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class RomanNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roman_number);
        GridView gridView;
            String[] num = {
                    "I","II","III","IV","V","VI","VII","VII"
                    ,"IX","X","XI","XII","XIII","XIV","XV","XVI","XVII",
                    "XVIII","XIX","XX"
            };
            gridView = findViewById(R.id.gridView);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.grid_item,num);
            gridView.setAdapter(adapter);
        }
}