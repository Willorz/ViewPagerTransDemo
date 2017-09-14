package com.ed.will.viewpagertransdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by will on 17-9-14.
 */

public class OneMoreActivity extends AppCompatActivity {

    List<View> viewList;
    @BindView(R.id.mViewPager)
    ViewPager mViewPager;
    @BindView(R.id.mRoot)
    RelativeLayout mRoot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_onemore);
        ButterKnife.bind(this);

        LayoutInflater lf = getLayoutInflater().from(this);
        View view1 = lf.inflate(R.layout.view1, null);
        View view2 = lf.inflate(R.layout.view2, null);
        View view3 = lf.inflate(R.layout.view3, null);
        viewList = new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        mViewPager.setAdapter(new MyViewPagerAdapter(viewList));
        mViewPager.setCurrentItem(0);
        mViewPager.setPageMargin(40);
        mViewPager.setOffscreenPageLimit(2);
        mViewPager.setPageTransformer(true,new DepthPageTransformer());
        //mViewPager.setOnPageChangeListener(new My);
    }
}
