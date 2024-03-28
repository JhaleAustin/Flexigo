package com.example.flexigo;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tutorial extends AppCompatActivity {

    private WebView videoWebView;
    private TextView videoTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        videoWebView = findViewById(R.id.videoWebView);
        videoTitleTextView = findViewById(R.id.videoTitleTextView);

        String[] videoUrls = {
                "https://www.youtube.com/embed/LGYoirN6KKY",
                "https://www.youtube.com/embed/CLw__a1yGpM",
                "https://www.youtube.com/embed/ct4lCp0jzCU",
                "https://www.youtube.com/embed/RxcztiXit5s",
                "https://www.youtube.com/embed/oop4eqTTkrQ"
        };

        String[] videoTitles = {
                "Video Title 1",
                "Video Title 2",
                "Video Title 3",
                "Video Title 4",
                "Video Title 5"
        };

        for (int i = 0; i < videoUrls.length; i++) {
            videoWebView.loadData("<iframe width=\"100%\" height=\"100%\" src=\"" + videoUrls[i] + "\" frameborder=\"0\" allowfullscreen></iframe>", "text/html", "utf-8");
            videoTitleTextView.setText(videoTitles[i]);
        }
    }
}
