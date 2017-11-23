package com.gentb.cacttusedu.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.models.Person;

/**
 * Created by gentberani on 11/23/17.
 */

public class PersonActivity extends Activity {

    private TextView nameText;
    private Person mainPerson;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        setupViews();
        fillModelData();

        fillViewsWithData();
    }

    private void fillModelData() {
        this.mainPerson = new Person(1, 19,
                "Arianit", "Bobaj");
    }

    private void setupViews() {
        nameText = (TextView) findViewById(R.id.nameText);
    }

    private void fillViewsWithData() {
        nameText.setText("Mosha:" + mainPerson.getAge());
    }


}
