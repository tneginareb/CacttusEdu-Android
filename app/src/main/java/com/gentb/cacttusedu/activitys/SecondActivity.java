package com.gentb.cacttusedu.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageButton;

import com.gentb.cacttusedu.R;

/**
 * Created by gentberani on 10/23/17.
 */

public class SecondActivity extends Activity {

    private boolean itsMonday;
    private String titulli;

    private ImageButton backButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        itsMonday = getIntent().getBooleanExtra("itsMonday", false);
        titulli = getIntent().getStringExtra("titulli");
        System.out.println("itsMonday value: " + itsMonday);
        System.out.println("titulli value: " + titulli);

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        System.out.println("onBackPressed");
        Intent intent = new Intent();
        intent.putExtra("eenjte", true);
        setResult(Activity.RESULT_OK, intent);
        System.out.println("HEL");
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
    }
}
