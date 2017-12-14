package com.gentb.cacttusedu.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.fragments.FragmentOne;

/**
 * Created by gentberani on 12/11/17.
 */

public class FragmentHolderDynamic extends FragmentActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_holder_dynamic);
        setupFragmentManager();
        ((Button) findViewById(R.id.showButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentOne();
            }
        });
    }

    private void setupFragmentManager() {
        fragmentManager = getSupportFragmentManager();
    }

    private void showFragmentOne() {
        final FragmentTransaction transaction = fragmentManager.beginTransaction();

        final FragmentOne fragmentOne = new FragmentOne();

        transaction.add(R.id.container, fragmentOne, "FragmentOne");
        transaction.commit();
    }


}
