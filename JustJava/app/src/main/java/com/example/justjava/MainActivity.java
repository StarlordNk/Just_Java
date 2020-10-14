package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        setter(1);
    }

    public void sub(View view) {
        setter(-1);
        }
    protected void setter(int n){
        TextView t = (TextView) findViewById(
                R.id.varaiable);
        int a;
        a = Integer.parseInt((String) t.getText());
        if(a+n>=0)
            t.setText(""+(a+n));

    }

    public void onOrder(View view){
        displayPrice();
    }
     private int rate=5;
     private void displayPrice(){
        TextView t=(TextView)findViewById(
                R.id.varaiable);
        int a= Integer.parseInt((String) t.getText());
        a=a*rate;
        TextView price= (TextView) findViewById(R.id.price);
        price.setText(NumberFormat.getCurrencyInstance().format(a));
    }
}