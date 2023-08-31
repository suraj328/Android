package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button1=findViewById(R.id.button);
        this.button2=findViewById(R.id.button2);
        this.button1.setOnClickListener(this);
        this.button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            FragmentOne fragmentOne = new FragmentOne();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout,fragmentOne);
            fragmentTransaction.commit();
            Toast.makeText(getApplicationContext(),"FragmentOne Loaded",Toast.LENGTH_SHORT).show();
        }
        if(view.getId() == R.id.button2){
            FragmentTwo fragmentTwo = new FragmentTwo();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout,fragmentTwo);
            fragmentTransaction.commit();
            Toast.makeText(getApplicationContext(),"FragmentTwo Loaded",Toast.LENGTH_SHORT).show();
        }

    }
}