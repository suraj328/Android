package com.example.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityB extends AppCompatActivity {
    private TextView intentResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        this.intentResult = findViewById(R.id.intentResult);
        Intent intent = getIntent();

//        getting data of bundle
        if(intent!= null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String name = bundle.getString("name");
                String age = Integer.toString(bundle.getInt("age"));
                this.intentResult.setText("name:- " + name + "\n" + "age:- " + age);
            } else {
                this.intentResult.setText("no data found from bundle");
            }
        }else{
            this.intentResult.setText("no data found from intent");
        }

//        getting data of modal class
//        if(intent !=null){
//            ArrayList<Student> studentList = (ArrayList<Student>) intent.getSerializableExtra("studentData");
//            if(studentList!=null){
//                StringBuilder builder = new StringBuilder();
//                for(Student student : studentList){
//                    builder.append("name: "+student.getName()+" faculty: "+student.getFaculty()+"\n");
//                }
//                this.intentResult.setText(builder.toString());
//            }else{
//                this.intentResult.setText("no data found from modal array class");
//            }
//        }else{
//            this.intentResult.setText("no data found from intent");
//        }

    }
}