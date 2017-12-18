package com.gentb.cacttusedu.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.gentb.cacttusedu.R;

/**
 * Created by gentberani on 12/18/17.
 */

public class ServiceActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_service);
    }

}
