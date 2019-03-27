package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainWeatherData {

    public String temp;
    public int humidity;

    @JsonProperty("temp")
    public String getTemp() {
        return temp;
    }


    @JsonProperty("temp")
    public void setTemp(String temp) {
        this.temp = temp;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "MainWeatherData{" +
                "temp='" + temp + '\'' +
                ", humidity=" + humidity +
                '}';
    }
}
