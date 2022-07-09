package com.axiomindustries.paws.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.axiomindustries.paws.Models.ItemIntroScreen;
import com.axiomindustries.paws.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(()->{
            Intent intent = new Intent(SplashActivity.this, IntroActivity.class);
            startActivity(intent);
            finish();
        },3000);
    }
}