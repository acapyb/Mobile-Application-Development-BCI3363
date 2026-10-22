
package com.example.lab38_toasts;

import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnShort, btnLong, btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Buttons
        btnShort = findViewById(R.id.btnShort);
        btnLong = findViewById(R.id.btnLong);
        btnCustom = findViewById(R.id.btnCustom);

        // PART 1: Short Toast
        btnShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(
                        getApplicationContext(),
                        "This is a SHORT toast!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // PART 2: Long Toast
        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(
                        getApplicationContext(),
                        "This is a LONG toast displayed for 3.5 seconds!",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        // PART 3: Custom Toast
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast customToast = Toast.makeText(
                        getApplicationContext(),
                        "Welcome to Android Studio!",
                        Toast.LENGTH_LONG
                );

                // Set Toast position to top center
                customToast.setGravity(
                        Gravity.TOP | Gravity.CENTER_HORIZONTAL,
                        0,
                        100
                );

                customToast.show();
            }
        });
    }
}
