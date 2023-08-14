package com.example.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class DayOfWeek extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_of_week);
        String[] days = {
                "Sun",
                "Mon",
                "Tues",
                "Wed",
                "Thurs",
                "Fri",
                "Sat"
        };
        this.listView = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.list_item,days);
        listView.setAdapter(adapter);
    }
}