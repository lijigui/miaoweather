package com.yangfan8688.miaoweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/2/26.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherID;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCountyCode() {
        return weatherID;
    }

    public void setCountyCode(int weatherID) {
        this.weatherID = weatherID;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
