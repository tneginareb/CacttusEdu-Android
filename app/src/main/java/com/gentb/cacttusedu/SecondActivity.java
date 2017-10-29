package com.gentb.cacttusedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by gentberani on 10/23/17.
 */

public class SecondActivity extends Activity {

    private boolean itsMonday;
    private String titulli;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        itsMonday = getIntent().getBooleanExtra("itsMonday", false);
        titulli = getIntent().getStringExtra("titulli");
        System.out.println("itsMonday value: " + itsMonday);
        System.out.println("titulli value: " + titulli);

    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        System.out.println("onBackPressed");

        Intent intent = new Intent();
        intent.putExtra("eenjte",true);
        setResult(Activity.RESULT_OK,intent);
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
