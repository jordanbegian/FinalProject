package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StepCoordinates {

    private double latitude;
    private double longitude;

    @JsonProperty("lat")
    public double getLatitude() {
        return latitude;
    }

    @JsonProperty("lat")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    @JsonProperty("lng")
    public double getLongitude() {
        return longitude;
    }

    @JsonProperty("lng")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getFormattedLatAndLong(){
        return String.valueOf(getLatitude()) + "," + String.valueOf(getLongitude());
    }
}
