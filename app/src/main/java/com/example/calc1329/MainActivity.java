package com.example.calc1329;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 7, b = 9;
        int c = a * b;
        int d = a ^ c ^ 67890;
        System.out.println(d ^ d);
        System.out.println("kek");
        //lmao
    }
}
