package com.example.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ActivtiyA extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activtiy);
        this.btn1 = findViewById(R.id.button1);
        this.btn1.setOnClickListener(this);
    }
    public void onClick(View view){
       if (view.getId() == R.id.button1){
           Intent intent = new Intent(ActivtiyA.this,ActivityB.class);
//           sending  with bundle
//           Bundle bundle = new Bundle();
//           bundle.putString("name","suraj");
//           bundle.putInt("age",23);
//           intent.putExtras(bundle);
//           startActivity(intent);

//           sending with modal class
           ArrayList<Student> studentList = new ArrayList<>();
           studentList.add(new Student("Suraj","Bca"));
           studentList.add(new Student("Alan","Management"));
           intent.putExtra("studentData",studentList);
           startActivity(intent);
       }
    }
}