package com.HT;

public class SortCity {
    private String cityName;
    private long count;

    public SortCity(String cityName, long count) {
        this.cityName = cityName;
        this.count = count;
    }

    public String getCityName() {
        return cityName;
    }

    public long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("City name : %s || count of people :: %d", cityName, count);
    }
}
