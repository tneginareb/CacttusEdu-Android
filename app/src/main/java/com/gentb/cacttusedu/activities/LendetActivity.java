package com.gentb.cacttusedu.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.adapters.LendetAdapter;
import com.gentb.cacttusedu.models.Lenda;
import com.gentb.cacttusedu.network.LendetCallback;
import com.gentb.cacttusedu.network.LendetTask;

import java.util.ArrayList;

/**
 * Created by gentberani on 12/18/17.
 */

public class LendetActivity extends Activity {

    private LendetCallback lendetCallback;
    private LendetTask lendetTask;
    private ArrayList<Lenda> lendet = new ArrayList<>();
    private ListView listView;
    private LendetAdapter adapter;

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lendet);
        listView = findViewById(R.id.listView);
        adapter = new LendetAdapter(getApplicationContext(), lendet);
        listView.setAdapter(adapter);
        initializeServiceObjects();
        requestLendetData();
    }

    private void initializeServiceObjects() {
        lendetCallback = new LendetCallback() {
            @Override
            public void onLendetResponse(ArrayList<Lenda> inLendet, boolean success) {
                if (success) {
                    lendet.addAll(inLendet);
                    adapter.notifyDataSetChanged();
                }
            }
        };

        lendetTask = new LendetTask(lendetCallback);
    }

    private void requestLendetData() {
        lendetTask.execute();
    }
}
