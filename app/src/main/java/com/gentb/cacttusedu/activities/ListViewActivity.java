package com.gentb.cacttusedu.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        fillPersonsArray();
        setupListView();

    }

    private void fillPersonsArray() {
        Person person = new Person(1, 19,
                "Arianit", "Bobaj");
        this.persons.add(person);

        person = new Person(2, 21,
                "Meriton", "Ferati");
        this.persons.add(person);

        person = new Person(3, 23,
                "Ndriqim", "Haxhaj");
        this.persons.add(person);


        person = new Person(4, 20,
                "Endrit", "Zhuri");
        this.persons.add(person);


        person = new Person(5, 24,
                "Arlind", "Rexhepi");
        this.persons.add(person);


        System.out.println("Persons size: " + this.persons.size());
    }

    private void setupListView() {
        listView = (ListView) findViewById(R.id.listView);
        adapter = new PersonsAdapter(ListViewActivity.this, persons);
        listView.setAdapter(adapter);
        adapter.notifyDataSetInvalidated();
    }
}
