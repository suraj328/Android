package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentOne extends Fragment implements View.OnClickListener {

     private EditText editText1,editText2;
     private TextView textView1;
     private Button button,button2;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        editText1 = view.findViewById(R.id.textField1);
        editText2 = view.findViewById(R.id.textField2);
        textView1 = view.findViewById(R.id.sumResult);
        button = view.findViewById(R.id.sumBtn);
        button2 = view.findViewById(R.id.nextFrag);
        button2.setOnClickListener(this);
        button.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View view) {
        //for sum
        if(view.getId()==R.id.sumBtn){
        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());
        textView1.setText(Integer.toString(num1+num2));
        }
        //for switching another fragment
        if(view.getId()==R.id.nextFrag){
            Bundle bundle = new Bundle();
            bundle.putString("name","suraj");
            FragmentTwo fragmentTwo = new FragmentTwo();
            fragmentTwo.setArguments(bundle);
            FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout,fragmentTwo);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }
}