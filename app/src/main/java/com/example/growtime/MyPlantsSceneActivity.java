package com.example.growtime;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.ComponentActivity;

public class MyPlantsSceneActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.my_plants_scene);
    }
}