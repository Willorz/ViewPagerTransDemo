package com.ed.will.viewpagertransdemo.fragmentpageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.ed.will.viewpagertransdemo.DepthPageTransformer;
import com.ed.will.viewpagertransdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by will on 17-9-15.
 */

public class FragemtActivity extends AppCompatActivity {
    @BindView(R.id.mViewPager)
    ViewPager mViewPager;
    @BindView(R.id.mRoot)
    RelativeLayout mRoot;

    List<Fragment> mFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_onemore);
        ButterKnife.bind(this);

        Fragment fg1=new Fragment1();
        Fragment fg2=new Fragment2();
        Fragment fg3=new Fragment3();

        mFragment=new ArrayList<Fragment>();
        mFragment.add(fg1);
        mFragment.add(fg2);
        mFragment.add(fg3);

        mViewPager.setAdapter(new AdapterFragement(getSupportFragmentManager(),mFragment));
        mViewPager.setPageMargin(40);
        mViewPager.setCurrentItem(0);
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setPageTransformer(true,new DepthPageTransformer());

    }
}
