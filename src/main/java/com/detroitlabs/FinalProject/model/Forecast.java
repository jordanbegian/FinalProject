package com.detroitlabs.FinalProject.model;

import java.util.ArrayList;

public class Forecast {
    ArrayList<WeatherData> weatherData = new ArrayList<WeatherData>();

    public ArrayList<WeatherData> getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(ArrayList<WeatherData> weatherData) {
        this.weatherData = weatherData;
    }
}
