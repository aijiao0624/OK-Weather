package com.aijiao.weather.common;

import com.google.gson.Gson;

/**
 * Created by 25858 on 2017/3/19.
 */

public class GsonUtils {

    private static Gson gson;

    private GsonUtils() {

    }

    public static Gson getSingleInstance() {
        if (gson == null) {
            synchronized (GsonUtils.class) {
                if (gson == null) {
                    gson = new Gson();
                }
            }
        }
        return gson;
    }

    public static Gson newInstance(){
        return new Gson();
    }

    public static String toJson(Object obj){
        return getSingleInstance().toJson(obj);
    }

}
