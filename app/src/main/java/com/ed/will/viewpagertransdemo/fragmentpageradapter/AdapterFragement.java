package com.ed.will.viewpagertransdemo.fragmentpageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by will on 17-9-15.
 */

public class AdapterFragement extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    public AdapterFragement(FragmentManager fm){
        super(fm);
    }

    public AdapterFragement(FragmentManager fm,List<Fragment> mFragments) {
        super(fm);
        this.mFragments=mFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getClass().getSimpleName();
    }
}
