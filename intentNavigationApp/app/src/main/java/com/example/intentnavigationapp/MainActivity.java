
package com.example.intentnavigationapp;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonNavigate, buttonIntroduction, buttonPersonalInfo, buttonGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNavigate = findViewById(R.id.buttonNavigate);

        buttonNavigate.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        buttonIntroduction = findViewById(R.id.buttonIntroduction);

        buttonIntroduction.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, IntroductionActivity.class);
            startActivity(intent);
        });

        buttonPersonalInfo = findViewById(R.id.buttonPersonalInfo);

        buttonPersonalInfo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, personalActivity.class);
            startActivity(intent);
        });

        buttonGallery = findViewById(R.id.buttonGallery);

        buttonGallery.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, umpsaGallery.class);
            startActivity(intent);
        });

    }
}
