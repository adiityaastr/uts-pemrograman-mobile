package com.example.uts_pemrogramanmobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String username = getIntent().getStringExtra("username");

        TextView tvWelcome = findViewById(R.id.tvWelcome);
        tvWelcome.setText("Muhamad Aditya Saputra");

        findViewById(R.id.btnActivityA).setOnClickListener(v -> startActivity(new Intent(this, ActivityA.class)));
        findViewById(R.id.btnActivityB).setOnClickListener(v -> startActivity(new Intent(this, ActivityB.class)));
        findViewById(R.id.btnActivityC).setOnClickListener(v -> startActivity(new Intent(this, ActivityC.class)));
        findViewById(R.id.btnActivityD).setOnClickListener(v -> startActivity(new Intent(this, ActivityD.class)));
        findViewById(R.id.btnGallery).setOnClickListener(v -> startActivity(new Intent(this, GalleryActivity.class)));

        findViewById(R.id.btnLogout).setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        });
    }
}
