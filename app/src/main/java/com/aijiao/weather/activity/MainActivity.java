package com.aijiao.weather.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aijiao.weather.R;
import com.tencent.bugly.Bugly;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bugly.init(getApplicationContext(), "641148bef5", true);

    }


}
