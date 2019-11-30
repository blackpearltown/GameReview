package com.example.reviewgames.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.reviewgames.R;

public class CategoryActivity extends AppCompatActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        position = getIntent().getIntExtra("position", 0);
    }
}
