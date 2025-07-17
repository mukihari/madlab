package com.example.lab_2_orientation_scree;

import android.os.Bundle;
import android.content.res.Configuration;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView messageText; // Declare TextView variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageText = findViewById(R.id.messageText); // Link TextView to message
        showOrientationMessage();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        showOrientationMessage();
    }

    private void showOrientationMessage() {
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            messageText.setText("landscape mode");
        } else {
            messageText.setText("Portrait Mode");
        }
    }
}
