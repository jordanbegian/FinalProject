package com.detroitlabs.FinalProject.model;

import com.detroitlabs.FinalProject.service.YelpService;

public class CityPlaces {
    private String cityName;
    private Businesses bars;
    private Businesses restaurants;
    private Businesses hotels;
    private Businesses entertainment;

    public CityPlaces(String cityName, YelpService yelpService) {
        this.cityName = cityName;
        this.bars = yelpService.fetchYelpMostRatedBars(cityName);
        this.restaurants = yelpService.fetchYelpMostRatedRestaurants(cityName);
        this.hotels = yelpService.fetchYelpMostRatedHotels(cityName);
        this.entertainment = yelpService.fetchYelpMostRatedEntertainment(cityName);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Businesses getBars() {
        return bars;
    }

    public void setBars(Businesses bars) {
        this.bars = bars;
    }

    public Businesses getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Businesses restaurants) {
        this.restaurants = restaurants;
    }

    public Businesses getHotels() {
        return hotels;
    }

    public void setHotels(Businesses hotels) {
        this.hotels = hotels;
    }

    public Businesses getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(Businesses entertainment) {
        this.entertainment = entertainment;
    }
}
