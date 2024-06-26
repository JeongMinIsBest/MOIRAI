package com.example.gpt_test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class StartLoading extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        // 2초 후에 activity_main으로 전환
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartLoading.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000); // 1초 딜레이 부여
    }
}