package com.aijiao.weather.View.activitys;

import com.aijiao.weather.View.BaseView.MvpView;

/**
 * Created by 25858 on 2017/3/19.
 */

public interface MainActivityView extends MvpView {

    void updateSimpleWeatherDatas(SimpleWeather simpleWeather);

    void addCityPage(String cityName);

    void subtractCityPage(int position);

}
