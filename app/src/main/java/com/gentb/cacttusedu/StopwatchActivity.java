package com.gentb.cacttusedu;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by gentberani on 11/16/17.
 */

public class StopwatchActivity extends Activity {

    // UI Objects
    TextView timeText;
    Button startButton, stopButton, resetButton;

    // UI Objects
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        initializeViews();

    }

    private void initializeViews() {
        timeText = findViewById(R.id.timeText);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        resetButton = findViewById(R.id.resetButton);
    }
}
