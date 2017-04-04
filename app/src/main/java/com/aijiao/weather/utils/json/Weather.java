package com.aijiao.weather.utils.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 25858 on 2017/4/4.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
