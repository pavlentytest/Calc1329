package com.example.calc1329;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 100;
        int b = 200;
        int c = a+b;
        b = a;
        c = 0;
        a = b + 5;
        System.out.println("Hello from Jedi!");
        //ffff
    }
}
