package com.gentb.cacttusedu.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gentb.cacttusedu.R;

import org.w3c.dom.Text;

/**
 * Created by gentberani on 11/27/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {


    Context context;
    public ViewPagerAdapter(Context context){
        this.context = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View customView = inflater.inflate(R.layout.pager_cell,container,false);
        System.out.println("fff");
        TextView title = (TextView) customView.findViewById(R.id.titleTextView);
        title.setText(""+position);
        container.addView(customView);
        return customView;
    }



    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super.destroyItem(container, position, object);
        ((ViewPager) container).removeView((View) object);

    }

}
