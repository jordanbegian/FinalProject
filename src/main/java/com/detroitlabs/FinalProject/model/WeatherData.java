package com.detroitlabs.FinalProject.model;

import java.util.ArrayList;

public class WeatherData {

    public MainWeatherData mainWeatherData;
    public ArrayList<WeatherDescription> weatherDescriptions = new ArrayList<WeatherDescription>();

    public MainWeatherData getMainWeatherData() {
        return mainWeatherData;
    }

    public void setMainWeatherData(MainWeatherData mainWeatherData) {
        this.mainWeatherData = mainWeatherData;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "mainWeatherData=" + mainWeatherData +
                '}';
    }
}
