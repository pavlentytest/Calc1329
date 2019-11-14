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
        int g = a/b;
        int l = g + c;
        System.out.println(l);
        //fghfghgfhfghfghfghfgh
    }
}
