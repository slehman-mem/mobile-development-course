package com.example.realworldmethods;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String result = joinThese("John", "Doe", "author");
        Log.i("Info", " result = " + result);
        Log.i("Info", " result = " +
                joinThese("abc", "def", "whatever"));

        float area = getAreaCircle(5f);
       Log.e("area =", ""+area);

       int a =0;
       a=changeA(a);
       Log.e(" a = ", ""+a);
    }


    public String joinThese(String a, String b, String c) {

        String result = a + b + c;
        return result;


    }

    public float getAreaCircle(float radius) {
        return 3.14f * radius * radius;
    }

    public int changeA(int a){return ++a; }


    }

