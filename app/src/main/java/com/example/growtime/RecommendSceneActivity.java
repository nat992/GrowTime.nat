package com.example.growtime;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.ComponentActivity;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.example.growtime.access_hardiness_zone.ApiCall;
import com.example.growtime.access_hardiness_zone.DataModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecommendSceneActivity extends ComponentActivity {

    EditText zipcode_input;
    TextView zip_res;
    TextView hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recommend_scene);

        zipcode_input = findViewById(R.id.zipcode_input);
        zip_res = findViewById(R.id.zip_res);
        hard = findViewById(R.id.hard_zone);

        Button button = findViewById(R.id.sub_butt);
        button.setOnClickListener(v -> {
            updateText(v);
            showZone(v);
        });

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setSelectedItemId(R.id.nav_recommend);
        bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_honors) {
                startActivity(new Intent(this, HonExtSceneActivity.class));
                finish();
            } else if (id == R.id.nav_my_plants) {
                startActivity(new Intent(this, MyPlantsSceneActivity.class));
                finish();
            }
            return true;
        });
    }

    public void updateText(View view) {
        String zip = zipcode_input.getText().toString();
        zip_res.setText("Zip: " + zip);
    }

    public void showZone(View view) {
        String zip = zipcode_input.getText().toString();
        new ApiCall().getHard(RecommendSceneActivity.this, zip, new ApiCall.CallbackFunction() {
            @Override
            public void onCallback(DataModel data) {
                if (data != null) {
                    hard.setText(data.getZone());
                }
            }
        });
    }
}
