package com.gentb.cacttusedu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.models.Person;

import java.util.ArrayList;

/**
 * Created by gentberani on 11/23/17.
 */

public class PersonsAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private ArrayList<Person> persons = new ArrayList<>();
    private Context context;

    public PersonsAdapter(Context context, ArrayList<Person> persons) {
        this.context = context;
        this.persons = persons;
        setupInflater();
    }

    private void setupInflater() {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    class Holder {
        TextView personName;
    }

    @Override
    public int getCount() {
        System.out.println("Persons: " + persons.size());
        return persons.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {
            view = mInflater.inflate(R.layout.person_cell, viewGroup, false);
            holder = new Holder();
            holder.personName = (TextView) view.findViewById(R.id.personName);

            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }

        Person person = persons.get(position);
        holder.personName.setText(person.getName() +" Position: "+position);

        return view;
    }
}
