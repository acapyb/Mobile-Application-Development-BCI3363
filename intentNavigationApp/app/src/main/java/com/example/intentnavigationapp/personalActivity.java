
package com.example.intentnavigationapp;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class personalActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.personal_info);

        // Connect Button with XML
        btnBack = findViewById(R.id.btnBack);

        // Back to Home
        btnBack.setOnClickListener(view -> {
            finish();
        });
    }
}
