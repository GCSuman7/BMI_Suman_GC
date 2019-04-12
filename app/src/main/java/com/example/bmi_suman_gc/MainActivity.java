package com.example.bmi_suman_gc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtweight, txtResult, txtheight;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
        setbutton();
    }

    private void initiate() {
        txtweight = findViewById(R.id.textweight);
        txtheight = findViewById(R.id.textheight);
        txtResult = findViewById(R.id.textresult);
        btnCalculate = findViewById(R.id.btnCalculate);


    }

    private void setbutton() {
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculateBMI();
            }
        });
    }

    private void CalculateBMI() {
        float weight = Float.parseFloat(txtweight.getText().toString());
        float height = Float.parseFloat(txtheight.getText().toString()) / 100;
        WeightModel wm = new WeightModel(weight, height);
        float result = wm.getWeight() / (wm.getHeight() * wm.getHeight());
        txtResult.setText("" + result);
        
        if (result < 18.5) {
            Toast.makeText(MainActivity.this, "You are Underweight", Toast.LENGTH_LONG).show();
        } else if (result >= 18.5 && result <= 24.9) {
            Toast.makeText(MainActivity.this, "You are Normal Weight", Toast.LENGTH_LONG).show();
        } else if (result >= 25 && result <= 29.9) {
            Toast.makeText(MainActivity.this, "You have Overweight", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "You are Obese", Toast.LENGTH_LONG).show();
        }


    }
}
