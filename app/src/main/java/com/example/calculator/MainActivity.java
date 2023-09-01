package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button [] btn = new Button[18];
    private String expression = "";
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn[0]= findViewById(R.id.zero);
        this.btn[1]= findViewById(R.id.one);
        this.btn[2]= findViewById(R.id.two);
        this.btn[3]= findViewById(R.id.three);
        this.btn[4]= findViewById(R.id.four);
        this.btn[5]= findViewById(R.id.five);
        this.btn[6]= findViewById(R.id.six);
        this.btn[7]= findViewById(R.id.seven);
        this.btn[8]= findViewById(R.id.eight);
        this.btn[9]= findViewById(R.id.nine);
        this.btn[10]= findViewById(R.id.add);
        this.btn[11]= findViewById(R.id.sub);
        this.btn[12]= findViewById(R.id.mul);
        this.btn[13]= findViewById(R.id.divide);
        this.btn[14] = findViewById(R.id.total);
        this.btn[15] = findViewById(R.id.leftC);
        this.btn[16] = findViewById(R.id.rightC);
        this.btn[17] = findViewById(R.id.clear);


        this.textView1 = findViewById(R.id.calcResult);

        for (Button tempBtn:btn) {
            tempBtn.setOnClickListener(this);
        }
    }

    public void showClick(String btnVal){
        this.textView1.setText(" ");
        this.textView1.setText(this.expression+=btnVal);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.zero){
            showClick(Integer.toString(0));
        }
        if(view.getId() == R.id.one){
            showClick(Integer.toString(1));
        }
        if(view.getId() == R.id.two){
            showClick(Integer.toString(2));
        }
        if(view.getId() == R.id.three){
            showClick(Integer.toString(3));
        }
        if(view.getId() == R.id.four){
            showClick(Integer.toString(4));
        }
        if(view.getId() == R.id.five){
            showClick(Integer.toString(5));
        }
        if(view.getId() == R.id.six){
            showClick(Integer.toString(6));
        }
        if(view.getId() == R.id.seven){
            showClick(Integer.toString(7));
        }
        if(view.getId() == R.id.eight){
            showClick(Integer.toString(8));
        }
        if(view.getId() == R.id.nine){
            showClick(Integer.toString(9));
        }
        if(view.getId() == R.id.sub){
            showClick("-");
        }
        if(view.getId() == R.id.add){
            showClick("+");
        }
        if(view.getId() == R.id.leftC){
            showClick("(");
        }
        if(view.getId() == R.id.rightC){
            showClick(")");
        }
        if(view.getId() == R.id.mul){
            showClick("*");
        }
        if(view.getId() == R.id.divide){
            showClick("/");
        }
        if(view.getId() == R.id.clear){
            this.textView1.setText(" ");
            this.expression = "";
        }
        if(view.getId() == R.id.total){
            this.textView1.setText(" ");
            try {
                Expression e = new ExpressionBuilder(this.expression).build();
                double result = e.evaluate();
                Log.d("TAG", "Result: " + result);
                this.textView1.setText(Double.toString(result));
                this.expression =this.textView1.getText().toString();
            } catch (Exception ex) {
                this.expression =this.textView1.getText().toString();
                this.textView1.setText(expression);
                Toast.makeText(this,"invalid operand", Toast.LENGTH_SHORT).show();
                ex.printStackTrace();
            }
        }
    }
}