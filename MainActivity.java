package com.example.lab_8_implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        View openBrowser = findViewById(R.id.btnOpenBrowser);

        openBrowser.setOnClickListener(v -> {
            // Create an implicit intent to open a URL
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://google.com"));
            startActivity(intent);
        });

    }
}