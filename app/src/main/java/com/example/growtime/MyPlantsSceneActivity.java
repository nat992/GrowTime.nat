package com.example.growtime;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.ComponentActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyPlantsSceneActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.my_plants_scene);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setSelectedItemId(R.id.nav_my_plants);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_recommend) {
                startActivity(new Intent(this, RecommendSceneActivity.class));
                finish();
            } else if (id == R.id.nav_honors) {
                startActivity(new Intent(this, HonExtSceneActivity.class));
                finish();
            }
            return true;
        });
    }
}
