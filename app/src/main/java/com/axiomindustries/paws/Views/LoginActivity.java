package com.axiomindustries.paws.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.axiomindustries.paws.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        findViewById(R.id.btn_signup).setOnClickListener(v->{
            startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            finish();
        });

        getSupportActionBar().hide();

        findViewById(R.id.btn_login).setOnClickListener(v->{
            startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
            finish();
        });
    }
}