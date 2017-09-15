package com.ed.will.viewpagertransdemo.fragmentstatepageradapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ed.will.viewpagertransdemo.fragmentpageradapter.AdapterFragement;

import java.util.List;

/**
 * Created by will on 17-9-15.
 */

public class AdapterFragmentState extends FragmentStatePagerAdapter {
    List<Fragment> fragmentList;

    public AdapterFragmentState(FragmentManager fm) {
        super(fm);
    }

    public AdapterFragmentState(FragmentManager fm,List<Fragment> fragmentList){
        super(fm);
        this.fragmentList=fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
