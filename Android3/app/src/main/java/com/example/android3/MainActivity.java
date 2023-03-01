package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.e("Activity Lyfe Cycle","Created");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//        Log.e("Activity Life Cycle", "Stopped");
//    }
//
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Log.e("Activity Life Cycle", "Resumed");
//    }
//
//    @Override
//    protected void onStart(){
//        super.onStart();
//        Log.e("Activity Life Cycle", "Started");
//    }
//
//    @Override
//    protected void onPause(){
//        super.onPause();
//        Log.e("Activity Life Cycle", "Paused");
//    }
//
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        Log.e("Activity Life Cycle", "Destroyed");
//    }
//
//    @Override
//    protected void onRestart(){
//        super.onRestart();
//        Log.e("Activity Life Cycle", "Restarted");
//    }
}