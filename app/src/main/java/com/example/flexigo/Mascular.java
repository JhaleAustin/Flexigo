package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Mascular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascular);

        final ImageView imageView4 = findViewById(R.id.imageView4);
        final ImageView imageView5 = findViewById(R.id.imageView5);
        final TextView textView20 = findViewById(R.id.textView20);
        final TextView textView21 = findViewById(R.id.textView21);

        Button completeButton = findViewById(R.id.button14);

        Button completeButton1 = findViewById(R.id.button15);
        completeButton1.setVisibility(View.INVISIBLE);
        completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change content of ImageViews
                imageView4.setImageResource(R.drawable.image__10_);
                imageView5.setImageResource(R.drawable.image__1_);
                Button completeButton = findViewById(R.id.button15);
                textView21.setText("Assessment:\n" +
                        "B. Curl Up\n" +
                        "Sit on mat carpet with your legs bent more\n" +
                        "than 90 degrees so your feet remain flat on\n" +
                        "the floor.\n" +
                        "Make 2 tape marks 4.5 inches apart or lay a 4.5\n" +
                        "inches strip of paper on the floor.\n" +
                        "Lie with your arms extended at your sides,\n" +
                        "palms down and the finger extended so that\n" +
                        "your fingertips touch one tape mark.\n" +
                        "Keeping your heels in contact with the floor,\n" +
                        "curl the head and shoulders forward until\n" +
                        "your fingers reaches 4.5 inches.\n" +
                        "Lower slowly the beginning position and\n" +
                        "continue until unable to keep the pace.\n" +
                        "Record your score and check the rating\n" +
                        "below.");
                completeButton1.setVisibility(View.INVISIBLE);
            }
        });

        completeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
