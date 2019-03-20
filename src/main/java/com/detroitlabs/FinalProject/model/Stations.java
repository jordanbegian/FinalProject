package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Stations {

    private String country;
    private String zipCode;
    private String regPrice;
    private String midPrice;
    private String prePrice;
    private String address;
    private String diesel;
    private String id;
    private String lattitude;
    private String longitude;
    private String station;
    private String region;
    private String city;
    private String distance;


    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRegPrice() {
        return regPrice;
    }

    public void setRegPrice(String regPrice) {
        this.regPrice = regPrice;
    }

    public String getMidPrice() {
        return midPrice;
    }

    public void setMidPrice(String midPrice) {
        this.midPrice = midPrice;
    }

    public String getPrePrice() {
        return prePrice;
    }

    public void setPrePrice(String prePrice) {
        this.prePrice = prePrice;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiesel() {
        return diesel;
    }

    public void setDiesel(String diesel) {
        this.diesel = diesel;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Stations{" +
                "country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", regPrice='" + regPrice + '\'' +
                ", midPrice='" + midPrice + '\'' +
                ", prePrice='" + prePrice + '\'' +
                ", address='" + address + '\'' +
                ", diesel='" + diesel + '\'' +
                ", id='" + id + '\'' +
                ", lattitude='" + lattitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", station='" + station + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
