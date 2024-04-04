package com.example.flexigo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class advanced extends AppCompatActivity {
    private Button button,button2,button3,button4,button5,button6;
    private ImageView imgView1,imgView2,imgView3;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        button = findViewById(R.id.button17);
        button2 = findViewById(R.id.button19);
        button3= findViewById(R.id.button20);

        button4 =  findViewById(R.id.button21);
        imgView1= findViewById(R.id.imageView);
        button.setVisibility(View.VISIBLE);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.VISIBLE);
                imgView1.setImageResource(R.drawable._6);



            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button2.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.VISIBLE);

                imgView1.setImageResource(R.drawable._2);



            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView1.setVisibility(View.VISIBLE);
                imgView1.setImageResource(R.drawable._4);
                webView.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button4.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.VISIBLE);

                webView = findViewById(R.id.webView);
                webView.setWebViewClient(new WebViewClient());
                webView.setVisibility(View.VISIBLE);
                imgView1.setVisibility(View.INVISIBLE);


                // Enable JavaScript (required for YouTube embed)
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                // Load the YouTube video URL
                String youtubeUrl = "https://www.youtube.com/embed/f3zOrYCwquE?si=aXQojxUR9zx2Wdw_";
                webView.loadUrl(youtubeUrl);
                imgView1.setImageResource(R.drawable._4);

            }
        });
    }
}