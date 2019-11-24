package com.example.reviewgames.Data;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reviewgames.Activities.MainActivity;

public class LoadingScreen extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(LoadingScreen.this, MainActivity.class));
        finish();
    }
}
