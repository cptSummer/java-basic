package com.HT;

public class CityName {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public CityName(String cityName) {
        this.cityName = cityName;

    }

    @Override
    public String toString() {
        return String.format("%s", cityName);
    }
}
