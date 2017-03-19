package com.aijiao.weather.View.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aijiao.weather.R;
import com.aijiao.weather.View.BaseView.BaseActivity;
import com.tencent.bugly.Bugly;

public class MainActivity extends BaseActivity implements MainActivityView {

    private MainActivityPresenterApi presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this); //初始化Presenter
        Bugly.init(getApplicationContext(), "641148bef5", true);
        initData();
        initView();
        addListener();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void addListener() {

    }

}
