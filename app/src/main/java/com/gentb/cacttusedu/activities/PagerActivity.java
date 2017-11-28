package com.gentb.cacttusedu.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.adapters.ViewPagerAdapter;

/**
 * Created by Ndriqim Haxhaj on 11/27/2017.
 */

public class PagerActivity extends Activity {

    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        viewPager = findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getApplicationContext());
        viewPager.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}



