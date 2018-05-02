package com.example.cjcu.comtqcgdd01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText input_lend;
    private EditText input_rate;
    private EditText input_number;
    private Button submit;
    private TextView amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           this.input_lend =findViewById(R.id.input_lend);
           this.input_rate =findViewById(R.id.input_rate);
           this.input_number =findViewById(R.id.input_number);
           this.submit =findViewById(R.id.submit);
           this.submit.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   double calculate=Double.parseDouble(input_lend.getText().toString())*Math.pow((Double.parseDouble(input_rate.getText().toString()))/12/100+1,Double.parseDouble(input_number.getText().toString()));
                   amount.setText("本利和為:"+(int)calculate);
               }
           });
           this.amount=findViewById(R.id.amount);

            }
        }


