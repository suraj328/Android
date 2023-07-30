package com.example.labreport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RecylerPerson extends AppCompatActivity {
    public List<ContactItem> contactItemList = new ArrayList<>();
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_person);
        this.recyclerView = findViewById(R.id.recyclerView);
        for (int i = 1;i<=10;i++){
            String iVal = Integer.toString(i);
            this.contactItemList.add(new ContactItem("person"+iVal,"address"+iVal,"contact"+iVal,20+i));
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PersonAdapter adapter = new PersonAdapter(contactItemList);
        recyclerView.setAdapter(adapter);
    }
}