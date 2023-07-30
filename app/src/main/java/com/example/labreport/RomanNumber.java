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
                    "i","ii","iii","iv","v","vi","vii","viii"
                    ,"ix","x","xi","xii","xiii","xiv","xv","xi","xvii",
                    "xviii","xix","xx"
            };
            gridView = findViewById(R.id.gridView);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.grid_item,num);
            gridView.setAdapter(adapter);
        }
}