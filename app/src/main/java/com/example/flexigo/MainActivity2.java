package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button,button2,button3,button4,button5,button6,button7;

    private TextView textView1,textView2;

    private  ImageView imgView1,imgView2,imgView3;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.button9);

        button3 = findViewById(R.id.button7);
        button4= findViewById(R.id.button8);
        button = findViewById(R.id.button9);

        button2 = findViewById(R.id.button);

        textView1 = findViewById(R.id.textView2);
        textView2= findViewById(R.id.textView7);

        imageView= findViewById(R.id.imageView2);


        button5= findViewById(R.id.button18);

        button7= findViewById(R.id.button22);

        button5= findViewById(R.id.button8);
        button6 = findViewById(R.id.button9);


        button.setVisibility(View.VISIBLE);

        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button.setVisibility(View.VISIBLE);

        textView1.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);

        imageView.setVisibility(View.VISIBLE);

        button2.setVisibility(View.VISIBLE);


        imgView1 = findViewById(R.id.imageView6);
        imgView2 = findViewById(R.id.imageView7);
        imgView3 = findViewById(R.id.imageView8);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, Tutorial.class);
                startActivity(intent);

            }
        });


          button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);

                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);

                textView1.setVisibility(View.INVISIBLE);
                textView2.setVisibility(View.INVISIBLE);

                imageView.setVisibility(View.INVISIBLE);


                imgView1.setVisibility(View.VISIBLE);
                imgView2.setVisibility(View.VISIBLE);
                imgView3.setVisibility(View.VISIBLE);

            }
        });


        //health status
         button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        //beginner
        imgView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, beginner.class);
                startActivity(intent);

            }
        });


        //basic
        imgView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, basic.class);
                startActivity(intent);

            }
        });

        //Advance
        imgView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, advanced.class);
                startActivity(intent);

            }
        });



        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Tutorial.class);
                startActivity(intent);

            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Notifications.class);
                startActivity(intent);

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, PhysicalFitness.class);
                startActivity(intent);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, profile.class);
                startActivity(intent);

            }
        });
    }
}