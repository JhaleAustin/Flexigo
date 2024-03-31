package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhysicalFitness extends AppCompatActivity {
    private Button button,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical_fitness);

        button = findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PhysicalFitness.this, Aerobic.class);
                startActivity(intent);

            }
        });

        button2 = findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PhysicalFitness.this, Mascular.class);
                startActivity(intent);

            }
        });

        button3 = findViewById(R.id.button12);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PhysicalFitness.this, Flexibility.class);
                startActivity(intent);

            }
        });

        button4 = findViewById(R.id.button13);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PhysicalFitness.this, Flexibility.class);
                startActivity(intent);

            }
        });
    }
}