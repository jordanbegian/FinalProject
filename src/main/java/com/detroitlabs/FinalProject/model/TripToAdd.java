package com.detroitlabs.FinalProject.model;

public class TripToAdd {
    private String cityName;
    private String businessName;

    public TripToAdd(){}

    public TripToAdd(String cityName, String businessName){
        this.cityName = cityName;
        this.businessName = businessName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}
