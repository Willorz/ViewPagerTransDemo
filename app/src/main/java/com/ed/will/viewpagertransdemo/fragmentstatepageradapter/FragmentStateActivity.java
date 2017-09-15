package com.ed.will.viewpagertransdemo.fragmentstatepageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.ed.will.viewpagertransdemo.DepthPageTransformer;
import com.ed.will.viewpagertransdemo.R;
import com.ed.will.viewpagertransdemo.fragmentpageradapter.Fragment1;
import com.ed.will.viewpagertransdemo.fragmentpageradapter.Fragment2;
import com.ed.will.viewpagertransdemo.fragmentpageradapter.Fragment3;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by will on 17-9-15.
 */

public class FragmentStateActivity extends AppCompatActivity {

    List<Fragment> fragmentList;
    @BindView(R.id.mViewPager)
    ViewPager mViewPager;
    @BindView(R.id.mRoot)
    RelativeLayout mRoot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_onemore);
        ButterKnife.bind(this);

        Fragment fg1=new Fragment1();
        Fragment fg2=new Fragment2();
        Fragment fg3=new Fragment3();
        Fragment fg4=new Fragment2();
        Fragment fg5=new Fragment3();
        fragmentList=new ArrayList<Fragment>();
        fragmentList.add(fg1);
        fragmentList.add(fg2);
        fragmentList.add(fg3);
        fragmentList.add(fg4);
        fragmentList.add(fg5);

        mViewPager.setAdapter(new AdapterFragmentState(getSupportFragmentManager(),fragmentList));
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setPageMargin(20);
        mViewPager.setCurrentItem(0);
        mViewPager.setPageTransformer(true,new DepthPageTransformer());

    }
}
