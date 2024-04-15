package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class spin_wheel extends AppCompatActivity {

    private ImageView wheelImageView,ImageView;
    private TextView countdownTextView;
    private CountDownTimer countDownTimer;
    private int[] sectionDurations = {30000, 45000, 60000}; // Durations for each section in milliseconds
    private String[] sectionMessages = {"30 seconds", "45 seconds", "60 seconds"};


    private int advance1[] ={R.drawable.advanced1,R.drawable.advanced2,R.drawable.advanced3,R.drawable.advanced4,R.drawable.advanced5
    ,R.drawable.advanced6};

    private int advance2[]={R.drawable.advanced_7,R.drawable.advanced_8,R.drawable.advanced_9
    ,R.drawable.advanced_10};

    private int advance3[]={R.drawable.advanced__11,R.drawable.advanced__12,R.drawable.advanced__13,R.drawable.advanced__14};

    private int basic1[]={R.drawable.basic1,R.drawable.basic2,R.drawable.basic3,R.drawable.basic4,R.drawable.basic5,
            R.drawable.basic6,R.drawable.basic7,R.drawable.basic8,R.drawable.basic9};

    private int basic2[]={R.drawable.basic_10,R.drawable.basic_11,R.drawable.basic_12,R.drawable.basic_13,R.drawable.basic_14,
            R.drawable.basic_15,R.drawable.basic_16,R.drawable.basic_17};

    private int basic3[]={R.drawable.basic__18,R.drawable.basic__19,R.drawable.basic__20,R.drawable.basic__21,
            R.drawable.basic__22,R.drawable.basic__23};

    private int beginner1[]={R.drawable.beginner1,R.drawable.beginner2,R.drawable.beginner3,R.drawable.beginner4,
            R.drawable.beginner5,R.drawable.beginner6};

    private int beginner2[]={R.drawable.beginner_7,R.drawable.beginner_8,R.drawable.beginner_9,R.drawable.beginner_10};

    private int beginner3[]={R.drawable.beginner__11,R.drawable.beginner__12,R.drawable.beginner__13};


    String receivedString="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_wheel);

        wheelImageView = findViewById(R.id.wheelImageView);
        countdownTextView = findViewById(R.id.countdownTextView);

        ImageView = findViewById(R.id.imageView11);

        countdownTextView.setVisibility(View.INVISIBLE);

        // Inside spin_wheel activity's onCreate method or wherever appropriate
        Intent intent = getIntent();
        if (intent != null) {
            receivedString = intent.getStringExtra("STRING_KEY");
            // Now you have the string, do whatever you need with it
        }

    }

    public void spinWheel(View view) {
        Random random = new Random();
        int randomAngle = random.nextInt(360) + 1;

        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(wheelImageView, "rotation", 0f, randomAngle + 3600);
        rotateAnimation.setDuration(5000);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.start();

        rotateAnimation.addListener(new ObjectAnimator.AnimatorListener() {
            @Override
            public void onAnimationStart(android.animation.Animator animation) {}

            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                int sectionNumber = calculateSection(randomAngle);
                startTimer(sectionNumber);
            }

            @Override
            public void onAnimationCancel(android.animation.Animator animation) {}

            @Override
            public void onAnimationRepeat(android.animation.Animator animation) {}
        });
    }

    private int calculateSection(int angle) {
        int degreesPerSection = 120;
        // Adjusting the angle to start from 0 degrees at the top of the image
        angle = (angle + 360) % 360; // Ensure angle is positive and within 0-359 degrees
        // Determine which section the angle corresponds to
        if (angle >= 0 && angle < degreesPerSection) {
            if (receivedString != null) {
                switch (receivedString) {
                    case "advance":
                        // Display an image for the advance level
                        setAdvanceImage();
                        break;
                    case "basic":
                        // Display an image for the basic level
                        setBasicImage();
                        break;
                    case "beginner":
                        // Display an image for the beginner level
                        setBeginnerImage();
                        break;
                    default:
                        // Handle any other case if necessary
                        break;
                }
            }
            return 0; // First section
        } else if (angle >= degreesPerSection && angle < 2 * degreesPerSection) {
            if (receivedString != null) {
                switch (receivedString) {
                    case "advance":
                        // Display an image for the advance level
                        setAdvanceImage2();
                        break;
                    case "basic":
                        // Display an image for the basic level
                        setBasicImage2();
                        break;
                    case "beginner":
                        // Display an image for the beginner level
                        setBeginnerImage2();
                        break;
                    default:
                        // Handle any other case if necessary
                        break;
                }
            }
            return 1; // Second section
        } else {
            if (receivedString != null) {
                switch (receivedString) {
                    case "advance":
                        // Display an image for the advance level
                        setAdvanceImage3();
                        break;
                    case "basic":
                        // Display an image for the basic level
                        setBasicImage3();
                        break;
                    case "beginner":
                        // Display an image for the beginner level
                        setBeginnerImage3();
                        break;
                    default:
                        // Handle any other case if necessary
                        break;
                }
            }
            return 2; // Third section
        }
    }

    private void startTimer(int sectionNumber) {
        long duration = sectionDurations[sectionNumber];
        countdownTextView.setText("Countdown: " + sectionMessages[sectionNumber]);
        countDownTimer = new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                long minutes = seconds / 60;
                seconds = seconds % 60;
                countdownTextView.setText("Countdown: " + String.format("%02d:%02d", minutes, seconds));
            }

            @Override
            public void onFinish() {
                Toast.makeText(spin_wheel.this, "Timer Finished!", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }


    private void setAdvanceImage() {
        Random random = new Random();
        int index = random.nextInt(advance1.length);
        ImageView.setImageResource(advance1[index]);
        ImageView.setVisibility(View.VISIBLE);
    }

    // Method to set the ImageView with an image for the basic level
    private void setBasicImage() {
        Random random = new Random();
        int index = random.nextInt(basic1.length);
        ImageView.setImageResource(basic1[index]);
        ImageView.setVisibility(View.VISIBLE);
    }

    // Method to set the ImageView with an image for the beginner level
    private void setBeginnerImage() {
        Random random = new Random();
        int index = random.nextInt(beginner1.length);
        ImageView.setImageResource(beginner1[index]);
        ImageView.setVisibility(View.VISIBLE);
    }



    private void setAdvanceImage2() {
        Random random = new Random();
        int index = random.nextInt(advance2.length);
        ImageView.setImageResource(advance2[index]);
        ImageView.setVisibility(View.VISIBLE);
    }

    // Method to set the ImageView with an image for the basic level
    private void setBasicImage2() {
        Random random = new Random();
        int index = random.nextInt(basic2.length);
        ImageView.setImageResource(basic2[index]);
        ImageView.setVisibility(View.VISIBLE);
    }

    // Method to set the ImageView with an image for the beginner level
    private void setBeginnerImage2() {
        Random random = new Random();
        int index = random.nextInt(beginner2.length);
        ImageView.setImageResource(beginner2[index]);
        ImageView.setVisibility(View.VISIBLE);
    }



    private void setAdvanceImage3() {
        Random random = new Random();
        int index = random.nextInt(advance3.length);
        ImageView.setImageResource(advance3[index]);
        ImageView.setVisibility(View.VISIBLE);
    }

    // Method to set the ImageView with an image for the basic level
    private void setBasicImage3() {
        Random random = new Random();
        int index = random.nextInt(basic3.length);
        ImageView.setImageResource(basic3[index]);
        ImageView.setVisibility(View.VISIBLE);
    }

    // Method to set the ImageView with an image for the beginner level
    private void setBeginnerImage3() {
        Random random = new Random();
        int index = random.nextInt(beginner3.length);
        ImageView.setImageResource(beginner3[index]);
        ImageView.setVisibility(View.VISIBLE);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
