
package com.example.lab32_linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName, birth, country;
    Button submit;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Part 1: Vertical View
        // setContentView(R.layout.vertical_layout);

        // Part 2: Horizontal View
        // setContentView(R.layout.horizontal_layout););

        // Part 3: Personal Profile Form
        setContentView(R.layout.activity_profile);

        // Initialize views
        firstName = findViewById(R.id.firstNameInput);
        lastName = findViewById(R.id.lastNameInput);
        birth = findViewById(R.id.dobInput);
        country = findViewById(R.id.countryInput);
        submit = findViewById(R.id.submitButton);
        output = findViewById(R.id.resultText);

        // Submit button logic
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fName = firstName.getText().toString().trim();
                String lName = lastName.getText().toString().trim();
                String bth = birth.getText().toString().trim();
                String cty = country.getText().toString().trim();

                String result = "First Name:\t" + fName +
                        "\nLast Name:\t" + lName +
                        "\nBirth:\t\t" + bth +
                        "\nCountry:\t" + cty;

                output.setText(result);
            }
        });
    }
}
