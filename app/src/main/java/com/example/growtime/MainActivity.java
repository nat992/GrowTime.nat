package com.example.growtime;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.RecommendButton).setOnClickListener(v ->
                startActivity(new Intent(this, RecommendSceneActivity.class)));

        findViewById(R.id.Honors_button).setOnClickListener(v ->
                startActivity(new Intent(this, HonExtSceneActivity.class)));

        findViewById(R.id.LocationButton).setOnClickListener(v ->
                startActivity(new Intent(this, LocationSceneActivity.class)));

        findViewById(R.id.MyGarden).setOnClickListener(v ->
                startActivity(new Intent(this, MyPlantsSceneActivity.class)));

        findViewById(R.id.addPlantHome).setOnClickListener(v ->
                startActivity(new Intent(this, AddPlantSceneActivity.class)));

        findViewById(R.id.editPlantHome).setOnClickListener(v ->
                startActivity(new Intent(this, EditPlantSceneActivity.class)));
        // Eventually this screen will be removed and start at another screen
        // startActivity(new Intent(this, RecommendSceneActivity.class));
        // finish();
    }
}
