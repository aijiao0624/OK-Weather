package com.aijiao.weather.View.BaseView;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by 25858 on 2017/3/19.
 */

public abstract class BaseActivity extends AppCompatActivity {

    //初始化数据请求(不是必须的，习惯了)
    abstract protected void initData();

    //初始化View
    abstract protected void initView();

    //给View添加监听器
    abstract protected void addListener();

}
