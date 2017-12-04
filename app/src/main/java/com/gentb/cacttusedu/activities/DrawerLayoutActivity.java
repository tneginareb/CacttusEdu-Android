package com.gentb.cacttusedu.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.gentb.cacttusedu.R;

/**
 * Created by gentberani on 12/4/17.
 */

public class DrawerLayoutActivity extends Activity {

    DrawerLayout drawerLayout;
    Button openCloseButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        openCloseButton = (Button) findViewById(R.id.openCloseButton);

        openCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout.closeDrawer(Gravity.LEFT);
                } else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                }
            }
        });
    }
}
