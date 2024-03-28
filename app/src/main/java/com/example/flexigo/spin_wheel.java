






package com.example.flexigo;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

import android.animation.ObjectAnimator;
        import android.os.Bundle;
        import android.os.CountDownTimer;
        import android.view.View;
        import android.view.animation.DecelerateInterpolator;
        import android.widget.ImageView;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;
        import java.util.Random;

public class spin_wheel extends AppCompatActivity {

    private ImageView wheelImageView;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_wheel);

        wheelImageView = findViewById(R.id.wheelImageView);
    }

    public void spinWheel(View view) {
        // Generate a random number between 0 and 360 for wheel rotation
        Random random = new Random();
        int randomAngle = random.nextInt(360) + 1;

        // Spin the wheel with animation
        ObjectAnimator rotateAnimation = ObjectAnimator.ofFloat(wheelImageView, "rotation", 0f, randomAngle + 3600);
        rotateAnimation.setDuration(5000); // 5 seconds
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.start();

        // Start the countdown timer after wheel stops
        rotateAnimation.addListener(new ObjectAnimator.AnimatorListener() {
            @Override
            public void onAnimationStart(android.animation.Animator animation) {}

            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                int number = calculateNumber(randomAngle);
                startTimer(number);
            }

            @Override
            public void onAnimationCancel(android.animation.Animator animation) {}

            @Override
            public void onAnimationRepeat(android.animation.Animator animation) {}
        });
    }

    private int calculateNumber(int angle) {
        // Calculate the number based on the angle
        // Here, you need to map the angle to the range of your wheel numbers
        // For example, if your wheel has 20 sections:
        // Each section covers 360 degrees / 20 = 18 degrees
        // So, to find the number, divide the angle by 18 and add 1
        int sections = 20;
        int degreesPerSection = 360 / sections;
        int sectionNumber = (angle / degreesPerSection) + 1;
        return sectionNumber;
    }

    private void startTimer(int number) {
        // Start the timer based on the number obtained
        long duration = number * 1000; // Convert to milliseconds
        countDownTimer = new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Update UI with timer countdown (if needed)
            }

            @Override
            public void onFinish() {
                // Timer finished
                Toast.makeText(spin_wheel.this, "Timer Finished!", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Cancel the timer to avoid memory leaks
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
