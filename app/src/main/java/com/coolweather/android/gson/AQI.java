package com.coolweather.android.gson;

/**
 * Created by j00404708 on 2017/5/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
