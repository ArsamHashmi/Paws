package com.axiomindustries.paws.Views;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.axiomindustries.paws.R;

public class BreedsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds);

        getSupportActionBar().hide();

        (findViewById(R.id.btn_back)).setOnClickListener(v->{
            finish();
        });
    }
}