package com.ed.will.viewpagertransdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ed.will.viewpagertransdemo.fragmentpageradapter.FragemtActivity;
import com.ed.will.viewpagertransdemo.fragmentstatepageradapter.FragmentStateActivity;
import com.ed.will.viewpagertransdemo.pageradapter.OneMoreActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.pageradapter_btn)
    Button pageradapterBtn;
    @BindView(R.id.fmpadapter_btn)
    Button fmpadapterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.pageradapter_btn, R.id.fmpadapter_btn,R.id.fmpstateadapter_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.pageradapter_btn:
                Intent intent = new Intent(MainActivity.this, OneMoreActivity.class);
                startActivity(intent);
                break;
            case R.id.fmpadapter_btn:
                Intent intent2 = new Intent(MainActivity.this, FragemtActivity.class);
                startActivity(intent2);
                //Toast.makeText(this,"fragment",Toast.LENGTH_LONG).show();
                break;
            case R.id.fmpstateadapter_btn:
                Intent intent3=new Intent(MainActivity.this, FragmentStateActivity.class);
                startActivity(intent3);
                break;
        }
    }

}
