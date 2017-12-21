package com.gentb.cacttusedu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.gentb.cacttusedu.R;
import com.gentb.cacttusedu.models.Lenda;

import java.util.ArrayList;

/**
 * Created by gentberani on 11/23/17.
 */

public class LendetAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private ArrayList<Lenda> lendet = new ArrayList<>();
    private Context context;

    public LendetAdapter(Context context, ArrayList<Lenda> lendet) {
        this.context = context;
        this.lendet = lendet;
        setupInflater();
    }

    private void setupInflater() {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    class Holder {
        TextView personName, lendaTitle;
    }

    @Override
    public int getCount() {
        return lendet.size();
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
    public View getView(final int position, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {
            view = mInflater.inflate(R.layout.lendet_cell, viewGroup, false);
            holder = new Holder();
            holder.personName = (TextView) view.findViewById(R.id.personName);
            holder.lendaTitle = (TextView) view.findViewById(R.id.lendaTitle);

            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }

        Lenda lenda = lendet.get(position);
        holder.lendaTitle.setText(lenda.getTitulli());
        holder.personName.setText(lenda.getProfesori());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "" + position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
