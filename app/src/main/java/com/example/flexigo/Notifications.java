package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Notifications extends AppCompatActivity {

    private TextView infoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        // Get reference to the TextView
        infoTextView = findViewById(R.id.infoTextView);

        // Array of notifications
        String[] notifications = {
                "Notification 1: This is the first notification.",
                "Notification 2: This is the second notification.",
                "Notification 3: This is the third notification.",
                "Notification 4: This is the fourth notification.",
                "Notification 5: This is the fifth notification."
        };

        // Display each notification in the TextView
        StringBuilder stringBuilder = new StringBuilder();
        for (String notification : notifications) {
            stringBuilder.append(notification).append("\n\n");
        }
        infoTextView.setText(stringBuilder.toString());
    }
}
