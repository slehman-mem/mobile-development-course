package com.example.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String command = "go east";
        switch (command) {
            case "go east":
                Log.i("Info", "Player moves to the east");
                break;
            case "go west":
                Log.i("Info", "Player moves to the west");
                break;
            case "go north":
                Log.i("Info", "Player moves to the north");
                break;
            case "go south":
                Log.i("Info", "Player moves to the south");
                break;
            case "take sword":
                Log.i("Info", "Player takes the silver sword");
                break;


                default:
                    Log.i("Info", "Sorry I don’t speak Elfish");
            }
        }

    }






