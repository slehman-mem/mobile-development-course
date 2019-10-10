package com.example.shannonlehmanassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editText(View v) {

            int c;

        if (c<1)
        Log.i("Info", "Please input a valid number between 1 and 10");
            }
        }
    }

    public void countUp(View v) {

        Log.i("message", "In countUp Method");

        int x = 0;
        while (true) {
            x++;
            Log.i("x=", "" + x);
            if (x == 3) {
                break;

            }


        }
    }
}
