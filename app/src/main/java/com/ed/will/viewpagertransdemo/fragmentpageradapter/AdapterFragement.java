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
        this.mFragments=mFragments;//写构造方法，方便赋值调用
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);//根据Item的位置返回对应位置的Fragment，绑定item和Fragment
    }

    @Override
    public int getCount() {
        return mFragments.size();//设置Item的数量
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getClass().getSimpleName();
    }
}
