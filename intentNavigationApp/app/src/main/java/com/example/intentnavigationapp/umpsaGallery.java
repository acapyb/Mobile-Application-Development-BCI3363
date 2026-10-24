
package com.example.intentnavigationapp;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class umpsaGallery extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_umpsa_gallery);

        // Connect Back Button
        btnBack = findViewById(R.id.btnBack);

        // Back to Main Activity
        btnBack.setOnClickListener(view -> {
            finish();
        });
    }
}
