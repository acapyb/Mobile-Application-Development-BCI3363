
package com.example.lab36_radiobutton;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button btnSubmit;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupFaculty);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtResult = findViewById(R.id.txtResult);

        btnSubmit.setOnClickListener(view -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId != -1) {

                RadioButton selectedRadio =
                        findViewById(selectedId);

                String selectedFaculty =
                        selectedRadio.getText().toString();

                txtResult.setText(
                        "Selected: " + selectedFaculty
                );

                Toast.makeText(
                        MainActivity.this,
                        "Selected: " + selectedFaculty,
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                txtResult.setText("Please select a faculty");

                Toast.makeText(
                        MainActivity.this,
                        "Please select a faculty",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
