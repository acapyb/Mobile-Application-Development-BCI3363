
package com.example.lab37_checkbox;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox chkReading, chkTraveling, chkCooking;
    CheckBox chkSports, chkGaming;
    Button btnShow;
    TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CheckBoxes
        chkReading = findViewById(R.id.chkReading);
        chkTraveling = findViewById(R.id.chkTraveling);
        chkCooking = findViewById(R.id.chkCooking);
        chkSports = findViewById(R.id.chkSports);
        chkGaming = findViewById(R.id.chkGaming);

        // Initialize Button and TextView
        btnShow = findViewById(R.id.btnShow);
        txtOutput = findViewById(R.id.txtOutput);

        // Show selected hobbies
        btnShow.setOnClickListener(view -> {

            StringBuilder result =
                    new StringBuilder("Selected hobbies:\n");

            if (chkReading.isChecked())
                result.append("Reading\n");

            if (chkTraveling.isChecked())
                result.append("Traveling\n");

            if (chkCooking.isChecked())
                result.append("Cooking\n");

            if (chkSports.isChecked())
                result.append("Sports\n");

            if (chkGaming.isChecked())
                result.append("Gaming\n");

            // Display result in TextView
            txtOutput.setText(result.toString());

            // Display result in Toast
            Toast.makeText(
                    MainActivity.this,
                    result.toString(),
                    Toast.LENGTH_LONG
            ).show();
        });
    }
}
