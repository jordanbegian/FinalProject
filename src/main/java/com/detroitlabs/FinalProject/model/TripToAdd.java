package com.detroitlabs.FinalProject.model;

public class TripToAdd {
    private String cityName;
    private String businessName;
    private String url;

    public TripToAdd(){}

    public TripToAdd(String businessName){
        this.businessName = businessName;
    }

    public TripToAdd(String cityName, String url){
        this.cityName = cityName;
        this.url = url;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBusinessName(){
        return businessName;
    }

    public void setBusinessName(String url) {
        this.url = url;
    }
}
