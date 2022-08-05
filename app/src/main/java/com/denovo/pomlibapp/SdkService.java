package com.denovo.pomlibapp;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class SdkService extends AppCompatActivity {

    private Context context;

    public SdkService(Context context) {
        this.context = context;
    }

    public void openMainActivity() {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
