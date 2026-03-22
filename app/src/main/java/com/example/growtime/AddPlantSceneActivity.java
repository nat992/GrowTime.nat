package com.example.growtime;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.ComponentActivity;

import android.view.View;

import com.example.growtime.access_hardiness_zone.ApiCall;
import com.example.growtime.access_hardiness_zone.DataModel;

public class AddPlantSceneActivity extends ComponentActivity {
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.add_plant_scene);
    }

    public void addPlant(View view){
        // TODO save the plant
    }
}