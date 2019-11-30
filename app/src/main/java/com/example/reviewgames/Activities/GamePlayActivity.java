package com.example.reviewgames.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

import com.example.reviewgames.Data.DataGameplay;
import com.example.reviewgames.R;

public class GamePlayActivity extends AppCompatActivity {

    int position;
    WebView videoDetail1, videoDetail2, videoDetail3, videoDetail4;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        videoDetail1 = findViewById(R.id.video_1);
        videoDetail2 = findViewById(R.id.video_2);
        videoDetail3 = findViewById(R.id.video_3);
        videoDetail4 = findViewById(R.id.video_4);
        btnBack = findViewById(R.id.btn_menu);

        position = getIntent().getIntExtra("position", 0);

        videoDetail1.getSettings().setJavaScriptEnabled(true);
        videoDetail1.getSettings().setLoadWithOverviewMode(true);
        videoDetail1.getSettings().setAppCacheEnabled(true);
        videoDetail1.setWebChromeClient(new WebChromeClient());
        videoDetail1.setBackgroundColor(0x00000000);
        videoDetail1.loadDataWithBaseURL("", DataGameplay.urlVideoDetail1[position], "text/html", "UTF-8", null);

        videoDetail2.getSettings().setJavaScriptEnabled(true);
        videoDetail2.getSettings().setLoadWithOverviewMode(true);
        videoDetail2.getSettings().setAppCacheEnabled(true);
        videoDetail2.setWebChromeClient(new WebChromeClient());
        videoDetail2.setBackgroundColor(0x00000000);
        videoDetail2.loadDataWithBaseURL("", DataGameplay.urlVideoDetail2[position], "text/html", "UTF-8", null);

        videoDetail3.getSettings().setJavaScriptEnabled(true);
        videoDetail3.getSettings().setLoadWithOverviewMode(true);
        videoDetail3.getSettings().setAppCacheEnabled(true);
        videoDetail3.setWebChromeClient(new WebChromeClient());
        videoDetail3.setBackgroundColor(0x00000000);
        videoDetail3.loadDataWithBaseURL("", DataGameplay.urlVideoDetail3[position], "text/html", "UTF-8", null);

        videoDetail4.getSettings().setJavaScriptEnabled(true);
        videoDetail4.getSettings().setLoadWithOverviewMode(true);
        videoDetail4.getSettings().setAppCacheEnabled(true);
        videoDetail4.setWebChromeClient(new WebChromeClient());
        videoDetail4.setBackgroundColor(0x00000000);
        videoDetail4.loadDataWithBaseURL("", DataGameplay.urlVideoDetail4[position], "text/html", "UTF-8", null);

        View.OnClickListener toMenuClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        };

        btnBack.setOnClickListener(toMenuClick);
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }
}
