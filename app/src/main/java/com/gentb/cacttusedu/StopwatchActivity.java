package com.gentb.cacttusedu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by gentberani on 11/16/17.
 */

public class StopwatchActivity extends Activity {


    // UI Objects
    TextView timeText;
    Button startButton, stopButton, resetButton;

    // Class Properties
    private Handler handler;

    private int seconds = 0;
    private boolean running = false;

    // Class Static Properties
    private final static String SECONDS_KEY = "seconds_key";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt(SECONDS_KEY);
        }

        initializeViews();
        runTimer();

        onClickListeners();
    }

    private void onClickListeners() {

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                running = true;
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                running = false;
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                running = false;
                seconds = 0;
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
        running = false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("onSaveInstanceState");
        outState.putInt(SECONDS_KEY, seconds);
        outState.putBoolean("running", running);
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
        running = true;
    }

    private void runTimer() {
        handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                final int hours = seconds / 3600;
                final int minutes = (seconds % 3600) / 60;
                final int finalSeconds = seconds % 60;

                final String time =
                        String.format("%d:%02d:%02d", hours, minutes, finalSeconds);

                updateUI(time);
                if (running) {
                    seconds++;
                }

                handler.postDelayed(this, getSecondsFromMiliseconds(1));
            }
        });
    }

    private void updateUI(final String time) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                timeText.setText(time);
            }
        });
    }

    private void initializeViews() {
        timeText = findViewById(R.id.timeText);
        startButton = findViewById(R.id.startButton);
        stopButton = findViewById(R.id.stopButton);
        resetButton = findViewById(R.id.resetButton);
    }

    private long getSecondsFromMiliseconds(long seconds) {
        return seconds * 1000;
    }
}
