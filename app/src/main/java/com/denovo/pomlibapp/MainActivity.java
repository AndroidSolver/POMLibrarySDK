package com.denovo.pomlibapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private TextView txtLogo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //txtLogo = findViewById(R.id.txtLogo);
        //txtLogo.setText("SDK page starts");
        //Glide.with(MainActivity.this.getApplicationContext()).load("https://picsum.photos/id/237/200/300").into(appCompatImageView);

    }
}