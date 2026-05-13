package com.example.uts_pemrogramanmobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        findViewById(R.id.btnToB).setOnClickListener(v -> startActivity(new Intent(this, ActivityB.class)));
        findViewById(R.id.btnToC).setOnClickListener(v -> startActivity(new Intent(this, ActivityC.class)));
        findViewById(R.id.btnToD).setOnClickListener(v -> startActivity(new Intent(this, ActivityD.class)));
        findViewById(R.id.btnToSecond).setOnClickListener(v -> finish());
    }
}
