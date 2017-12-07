package com.gentb.cacttusedu.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.adapters.PersonsAdapter;
import com.gentb.cacttusedu.models.Person;

import java.util.ArrayList;

/**
 * Created by gentberani on 11/23/17.
 */

public class ListViewActivity extends Activity {

    private ListView listView;
    private ArrayList<Person> persons = new ArrayList<>();
    private PersonsAdapter adapter;

    private Button addButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        fillPersonsArray();
        setupListView();

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }

    private void fillPersonsArray() {
        Person person = new Person(1, 19,
                "Arianit", "Bobaj");
        persons.add(person);

        person = new Person(2, 21,
                "Meriton", "Ferati");
        persons.add(person);

        person = new Person(3, 23,
                "Ndriqim", "Haxhaj");
        persons.add(person);


        person = new Person(4, 20,
                "Endrit", "Zhuri");
        persons.add(person);


        person = new Person(5, 24,
                "Arlind", "Rexhepi");
        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);
        persons.add(person);

        System.out.println("Persons size: " + this.persons.size());
    }

    private void setupListView() {
        listView = (ListView) findViewById(R.id.listView);
        adapter = new PersonsAdapter(ListViewActivity.this, persons);
        listView.setAdapter(adapter);
    }
}
