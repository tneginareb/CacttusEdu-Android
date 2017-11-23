package com.gentb.cacttusedu.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.SeekBar;

import com.gentb.cacttusedu.R;

/**
 * Created by gentberani on 11/13/17.
 */

public class MultiSupportActivity extends Activity {

    SeekBar seekBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multisupport);
        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                System.out.println("i: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
