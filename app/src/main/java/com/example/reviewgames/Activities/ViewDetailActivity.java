package com.example.reviewgames.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.reviewgames.Data.Data;
import com.example.reviewgames.Data.DownloadPhoto;
import com.example.reviewgames.R;

public class ViewDetailActivity extends AppCompatActivity {
    int position;
    TextView tvName, tvFullDecs/*, tvId*/;
    ImageView imageDetail;
    WebView videoDetail;
    RatingBar ratingDetail;
    Button btnBack, btnGameplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_detail);

//        tvId = findViewById(R.id.id_game_detail);
        tvName = findViewById(R.id.tv_game_name);
        tvFullDecs = findViewById(R.id.tv_game_fullDesc);
        imageDetail = findViewById(R.id.imv_game_detail);
        videoDetail = findViewById(R.id.video_detail);
        ratingDetail = findViewById(R.id.game_rate);
        btnBack = findViewById(R.id.btn_back);
        btnGameplay = findViewById(R.id.btn_detail_gameplay);

        position = getIntent().getIntExtra("id", 0);
//        tvId.setText(Data.id[position] + "");
        tvName.setText(Data.nameGame[position]);
        tvFullDecs.setText(Data.fullDesc[position]);
        new DownloadPhoto(imageDetail).execute(Data.urlPhoto[position]);
        videoDetail.getSettings().setJavaScriptEnabled(true);
        videoDetail.getSettings().setLoadWithOverviewMode(true);
        videoDetail.getSettings().setAppCacheEnabled(true);
        videoDetail.setWebChromeClient(new WebChromeClient());
        videoDetail.setBackgroundColor(0x00000000);
        videoDetail.loadDataWithBaseURL("", Data.urlVideo[position], "text/html", "UTF-8", null);
        ratingDetail.setRating(Data.rating[position]);

        View.OnClickListener toMenuClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        };

        View.OnClickListener toGamePlayClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GamePlayActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        };

        btnBack.setOnClickListener(toMenuClick);
        btnGameplay.setOnClickListener(toGamePlayClick);

    }


    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }
}
