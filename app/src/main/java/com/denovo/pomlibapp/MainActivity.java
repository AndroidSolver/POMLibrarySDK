package com.denovo.pomlibapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private AppCompatImageView appCompatImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatImageView = findViewById(R.id.imgLogo);
        Glide.with(MainActivity.this).load("https://picsum.photos/id/237/200/300").into(appCompatImageView);

    }
}