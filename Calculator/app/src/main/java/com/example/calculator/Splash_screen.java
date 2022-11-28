package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_sscreen);
        getSupportActionBar().hide();


        int s_time = 2500;
        new Handler().postDelayed(() ->{
            Intent i = new Intent(Splash_screen.this,MainActivity.class);
            startActivity(i);
            finish();
        }, s_time);
    }
}