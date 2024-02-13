package com.example.gojekstudio;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class kalkulator extends AppCompatActivity {

    private EditText angka1;
    private EditText angka2;
    private TextView resultView;
    private Button buttonResult;
    private Spinner spOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        buttonResult = findViewById(R.id.btnCalculate);
        spOperator = findViewById(R.id.dropdown_menu);
        resultView = findViewById(R.id.result);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.option,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spOperator.setAdapter(adapter);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungTambah();
            }
        });
    }

    private void hitungTambah() {
        String selectedOperator = spOperator.getSelectedItem().toString();

        if (angka1.getText().toString().equals("") || angka2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Masukkan Angka Di Kedua Inputan", Toast.LENGTH_SHORT).show();
            return;
        } else {
            if ("Pilih".equals(selectedOperator)) {
                Toast.makeText(getApplicationContext(), "Pilih Operator", Toast.LENGTH_SHORT).show();
                return;
            } else {
                double angka1Number = Double.parseDouble(angka1.getText().toString());
                double angka2Number = Double.parseDouble(angka2.getText().toString());
                double result;

                switch (selectedOperator) {
                    case "Addition":
                        result = angka1Number + angka2Number;
                        resultView.setText("Result: " + result);
                        break;
                    case "Subtraction":
                        result = angka1Number - angka2Number;
                        resultView.setText("Result: " + result);
                        break;
                    case "Multiplication":
                        result = angka1Number * angka2Number;
                        resultView.setText("Result: " + result);
                        break;
                    case "Divide":
                        result = angka1Number / angka2Number;
                        resultView.setText("Result: " + result);
                        break;
                }
            }
        }
    }
}
