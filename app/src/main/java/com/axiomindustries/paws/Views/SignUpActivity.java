package com.axiomindustries.paws.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.axiomindustries.paws.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        findViewById(R.id.btn_login).setOnClickListener(v->{
            startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            finish();
        });
        findViewById(R.id.btn_signup).setOnClickListener(v->{
            startActivity(new Intent(SignUpActivity.this, DashboardActivity.class));
            finish();
        });
    }
}