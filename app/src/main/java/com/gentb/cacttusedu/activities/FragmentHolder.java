package com.gentb.cacttusedu.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.gentb.cacttusedu.R;

/**
 * Created by gentberani on 12/11/17.
 */

public class FragmentHolder extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_holder);
    }
}
