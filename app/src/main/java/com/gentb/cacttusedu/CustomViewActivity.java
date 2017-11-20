package com.gentb.cacttusedu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by gentberani on 11/20/17.
 */

public class CustomViewActivity extends Activity {

    private RelativeLayout parentView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customview);
        parentView = (RelativeLayout) findViewById(R.id.parentView);

        Button button = new Button(this);
        button.setId(0);
        button.setBackgroundColor(Color.GRAY);
        button.setText("Button from code");
        button.setTextColor(Color.WHITE);
        button.setLayoutParams(new RelativeLayout.LayoutParams(250, 250));
        button.setGravity(Gravity.CENTER);
        parentView.addView(button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hello there", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
