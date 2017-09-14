package com.ed.will.viewpagertransdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.onemore_btn)
    Button onemoreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.onemore_btn)
    public void onViewClicked() {
        Intent intent=new Intent(MainActivity.this,OneMoreActivity.class);
        startActivity(intent);
    }
}
