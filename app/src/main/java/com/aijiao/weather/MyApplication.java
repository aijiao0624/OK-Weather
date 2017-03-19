package com.aijiao.weather;

import android.app.Application;
import android.content.Context;

import com.aijiao.weather.Data.Cache.Config;
import com.aijiao.weather.common.CrashHandler;

/**
 * Created by 25858 on 2017/3/19.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context = this;
        CrashHandler.getCrashHandler().init(context);
        Config.init(context);
    }

    public static Context getAppContext(){
        return context;
    }

}
