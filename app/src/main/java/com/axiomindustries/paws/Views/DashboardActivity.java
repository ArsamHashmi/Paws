package com.axiomindustries.paws.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.axiomindustries.paws.Fragments.AdoptionFragment;
import com.axiomindustries.paws.Fragments.BreedFragment;
import com.axiomindustries.paws.R;

import me.ibrahimsn.lib.SmoothBottomBar;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().hide();

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment_container, new BreedFragment()).commit();

        SmoothBottomBar bottomBar = findViewById(R.id.bottom_nav);

        bottomBar.setOnItemSelectedListener(i -> {
            if(i==0)
                manager.beginTransaction().replace(R.id.fragment_container, new BreedFragment()).commit();
            else if(i==1)
                manager.beginTransaction().replace(R.id.fragment_container, new AdoptionFragment()).commit();
//            else
//                manager.beginTransaction().replace(R.id.fragment_container, new AboutUS_Fragment()).commit();
            return false;
        });

    }

    @Override
    public void onResume(){
        super.onResume();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BreedFragment()).commit();
    }
}