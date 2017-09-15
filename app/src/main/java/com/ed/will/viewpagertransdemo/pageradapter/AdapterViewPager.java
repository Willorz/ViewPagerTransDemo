package com.ed.will.viewpagertransdemo.pageradapter;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by will on 17-9-14.
 */

public class AdapterViewPager extends PagerAdapter {

    private List<View> mListViews;


    public AdapterViewPager(List<View> mListViews){
        this.mListViews=mListViews;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mListViews.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mListViews.get(position),0);
        Log.d("Position",position+"");
        return mListViews.get(position);
    }

    @Override
    public int getCount() {
        return mListViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
