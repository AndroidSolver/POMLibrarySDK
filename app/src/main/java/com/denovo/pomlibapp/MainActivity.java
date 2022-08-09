package com.denovo.pomlibapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.apache.commons.lang3.StringEscapeUtils;

public class MainActivity extends AppCompatActivity {

    private TextView txtLogo;
    private ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogo = findViewById(R.id.txtLogo);
        txtLogo.setText(StringEscapeUtils.unescapeHtml3("SDK page starts"));
        imageView = findViewById(R.id.imageView);
        Glide.with(MainActivity.this).load("https://picsum.photos/id/237/200/300").into(imageView);

    }
}