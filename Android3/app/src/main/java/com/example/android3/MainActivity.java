package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Activity Lyfe Cycle","Created");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("Activity Life Cycle", "Stopped");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("Activity Life Cycle", "Resumed");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("Activity Life Cycle", "Started");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("Activity Life Cycle", "Paused");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("Activity Life Cycle", "Destroyed");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("Activity Life Cycle", "Restarted");
    }
}