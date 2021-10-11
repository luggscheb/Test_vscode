package com.example.taschenrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view) {
        double result = 0;
        Spinner spn = findViewById(R.id.spinner);
        String num1s = "0";
        num1s=((TextView)findViewById(R.id.num1)).getText().toString();
        String num2s="0";
        num2s=((TextView)findViewById(R.id.num2)).getText().toString();
        double num1=0;
        double num2 = 0;
        if(!num1s.isEmpty()){

         num1 = Double.parseDouble(num1s);
         return;
        }else if(!num2s.isEmpty()){
         num2 = Double.parseDouble(num2s);
         return;
        }else {
            Snackbar.make(view, "You need to type a number", Snackbar.LENGTH_LONG).show();

        }

        String operator =(String)spn.getSelectedItem();




            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        Snackbar.make(view, "Division by zero", Snackbar.LENGTH_LONG).show();
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
            }
        TextView txt = findViewById(R.id.result);
        txt.setText(result+"");

        TextView txt2 = findViewById(R.id.timeline);
        txt2.append("\n"+num1+" "+operator+" "+ num2+" = " + result);
        }

    }

