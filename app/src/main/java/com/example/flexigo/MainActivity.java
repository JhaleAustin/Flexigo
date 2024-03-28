package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button,button2,button3,button4,button5,button6;
    private ImageButton imgbtn1,imgbtn2;
    private TextView studentNoTextView;
    private TextInputLayout studentNoTextInputLayout;
    private TextView passwordTextView,textView4,textView5,textView6,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView19,
            textView23,textView24,textView25,textView26;
    private TextInputLayout passwordTextInputLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);

        button4 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button16);

        button5 = findViewById(R.id.button6);
        studentNoTextView = findViewById(R.id.textView);
        studentNoTextInputLayout = findViewById(R.id.textInputLayout);
        passwordTextView = findViewById(R.id.textView3);
        passwordTextInputLayout = findViewById(R.id.textInputLayout2);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);

        textView11 = findViewById(R.id.textView11);


        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);

        textView19 = findViewById(R.id.textView19);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25= findViewById(R.id.textView25);
        textView26= findViewById(R.id.textView26);


        imgbtn1= findViewById(R.id.imageButton);
        imgbtn2= findViewById(R.id.imageButton2);

        textView16= findViewById(R.id.textView16);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the visibility of TextView and TextInputLayout
                studentNoTextView.setVisibility(View.VISIBLE);
                studentNoTextInputLayout.setVisibility(View.VISIBLE);
                passwordTextView.setVisibility(View.VISIBLE);
                passwordTextInputLayout.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                // Change the image in the ImageView
                imageView.setImageResource(R.drawable._3_3);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the visibility of TextView and TextInputLayout
                studentNoTextView.setVisibility(View.INVISIBLE);
                studentNoTextInputLayout.setVisibility(View.INVISIBLE);
                passwordTextView.setVisibility(View.INVISIBLE);
                passwordTextInputLayout.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);

                textView4.setVisibility(View.VISIBLE);
                textView5.setVisibility(View.VISIBLE);
                textView6.setVisibility(View.VISIBLE);
                textView6.setText("1.FLEXI-GO is purposely built for the\n" +
                        "students of the University of Batangas -\n" +
                        "Senior High School to encourage\n" +
                        "physically fit students who are able to\n" +
                        "perform moderate-to-vigorous\n" +
                        "activities. Therefore, participating in this\n" +
                        "game means that you are a student of\n" +
                        "the university and capable of\n" +
                        "performing such exercises. \\n\n" +
                        "2.The researchers provided a clear set of\n" +
                        "instructions and assured that it would\n" +
                        "be moderated in a controlled setting\n" +
                        "during the usage of the entire duration\n" +
                        "of the game to avoid any forms of\n" +
                        "injuries or misuse of the application.\\n\n" +
                        "3.Users of the app (UBians) are expected\n" +
                        "to provide valid medical information\n" +
                        "and disclose any medical conditions\n" +
                        "regarding their current health status to\n" +
                        "monitor any improvements or effects of\n" +
                        "using the game.\\n\n" +
                        "4.Users are required to abide by the set of\n" +
                        "Warm-Up exercises before proceeding\n" +
                        "onwards to the game to lessen any\n" +
                        "strain or injuries to the body.\\n\n" +
                        "5.Users shall watch the Tutorial Video for\n" +
                        "each game mode to gain knowledge of\n" +
                        "each set of exercise cards and to\n" +
                        "effectively execute each set of exercise.");
                button3.setVisibility(View.VISIBLE);

                // Change the image in the ImageView
                imageView.setImageResource(R.drawable._1_1);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setVisibility(View.VISIBLE);
                textView5.setVisibility(View.INVISIBLE);
                textView6.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);

                textView8.setVisibility(View.VISIBLE);
                textView9.setText("1.s a student of the University of\n" +
                        "Batangas - Senior High School, you\n" +
                        "must fall under the age of 16 (sixteen) to\n" +
                        "18 (eighteen) years of age under the\n" +
                        "supervision of any moderators or\n" +
                        "physical education teachers. By using\n" +
                        "this website, you warrant that you are\n" +
                        "at least 16 to 18 years of age and\n" +
                        "capable of understanding and\n" +
                        "following the terms and conditions\n" +
                        "provided. FLEXI-GO assumes no\n" +
                        "responsibility for liabilities related to\n" +
                        "age misinterpretation.");
                textView9.setVisibility(View.VISIBLE);
                textView10.setVisibility(View.VISIBLE);
                textView11.setVisibility(View.VISIBLE);

                textView11.setText("1.FLEXI-GO may ask you for access to\n" +
                        "some of your personal health-related\n" +
                        "information, and that you bear\n" +
                        "responsibility for the accuracy of this\n" +
                        "information and for maintaining the\n" +
                        "safety and security of your account.\n");
                button4.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable._1_1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setVisibility(View.VISIBLE) ;

                textView8.setVisibility(View.INVISIBLE);

                textView9.setVisibility(View.INVISIBLE);
                textView10.setVisibility(View.INVISIBLE);
                textView11.setVisibility(View.INVISIBLE);

                button4.setVisibility(View.INVISIBLE);


                textView12.setVisibility(View.VISIBLE);
                textView13.setText("1.To monitor the app’s effectiveness, you\n" +
                        "will be asked to constantly update the\n" +
                        "health-related information through a\n" +
                        "series of tests that you shall go through\n" +
                        "for each FIVE sessions of the game.\n" +
                        "\\n2.The series of tests are tested and\n" +
                        "approved by the physicians at the\n" +
                        "MAYO Clinic Research Hospital and\n" +
                        "Medical Center.");
                textView13.setVisibility(View.VISIBLE);


                textView15.setText("      1.In accordance with the 'Data Privacy\n" +
                        "                Act of 2012,\n" +
                        "                        ' all information obtained\n" +
                        "                will only be used for research-purposes\n" +
                        "                within the bounds of the University of\n" +
                        "                Batangas and will remain private\n" +
                        "                between the app and the user unless\n" +
                        "                the user itself discloses it to the public.");
                textView14.setVisibility(View.VISIBLE);
                textView15.setVisibility(View.VISIBLE);
                textView16.setText("1***You hereby agree that by accessing the\n" +
                        "app, you have read, understood, and agree\n" +
                        "to be bound by all of these Terms and\n" +
                        "Conditions. If you do not agree with all of\n" +
                        "these Terms and Conditions, you are strictly\n" +
                        "prohibited from using the website and\n" +
                        "suggested to discontinue use immediately   ");
                button5.setVisibility(View.VISIBLE);

                textView16.setVisibility(View.VISIBLE);
                imageView.setImageResource(R.drawable._1_1);
            }
        });



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView19.setVisibility(View.VISIBLE);

                textView23.setVisibility(View.VISIBLE);
                textView24.setVisibility(View.VISIBLE);
                textView25.setVisibility(View.VISIBLE);
                textView26.setVisibility(View.VISIBLE);


                imgbtn1.setVisibility(View.VISIBLE);
                imgbtn2.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);

                 }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}
