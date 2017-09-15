package com.ed.will.viewpagertransdemo.pageradapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.ed.will.viewpagertransdemo.DepthPageTransformer;
import com.ed.will.viewpagertransdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by will on 17-9-14.
 * 当ViewPager的内部选项卡为View时
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

        mViewPager.setAdapter(new AdapterViewPager(viewList));
        mViewPager.setCurrentItem(0);
        mViewPager.setPageMargin(40);//设置页卡间距
        mViewPager.setOffscreenPageLimit(2);//默认为1
        //这个方法是用来控制fragment不重新走生命周期的个数的，
        // 打个比方一共4个fragment页面，如果mViewPager.setOffscreenPageLimit(3)，那么所有的fragment都只走一次生命周期，
        // 如果是mViewPager.setOffscreenPageLimit(2)，那么其中有一个fragment会在切换的时候重新走一遍生命周期，
        // FragmentStatePagerAdapter和FragmentPagerAdapter都是这样，
        // 但是FragmentPagerAdapter设置setOffscreenPageLimit不影响fragment缓存的个数,
        // 而FragmentStatePagerAdapter缓存的fragment实例个数就是setOffscreenPageLimit设置的值+1。
        // 另外setOffscreenPageLimit的缺省值是1，设置0是无效的会被强制赋值成1。

        mViewPager.setPageTransformer(true,new DepthPageTransformer()); //添加切换页卡的动画
        //mViewPager.setOnPageChangeListener(new My);
    }
}
