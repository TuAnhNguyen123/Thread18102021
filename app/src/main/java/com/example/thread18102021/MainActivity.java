package com.example.thread18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100000000;i++){

                }
                Log.d("BBB","Thread A");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100000000;i++){

                }
                Log.d("BBB","Thread B");
            }
        });
        threadA.start();
        threadB.start();

        CountDownTimer countDownTimer = new CountDownTimer(1000,500) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Log.d("BBB","State Thread A: " + threadA.getState());
                Log.d("BBB","State Thread B: " + threadB.getState());
            }
        }.start();
    }
}