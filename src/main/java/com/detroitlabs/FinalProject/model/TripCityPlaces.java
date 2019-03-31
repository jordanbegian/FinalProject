package com.detroitlabs.FinalProject.model;

import java.util.ArrayList;

public class TripCityPlaces {
    private ArrayList<CityPlaces> tripCityPlaces;

    public void addTripCityPlace(CityPlaces cityPlace){
        getTripCityPlaces().add(cityPlace);
    }

    public TripCityPlaces() {
        this.tripCityPlaces = new ArrayList<>();
    }

    public ArrayList<CityPlaces> getTripCityPlaces() {
        return tripCityPlaces;
    }

    public void setTripCityPlaces(ArrayList<CityPlaces> tripCityPlaces) {
        this.tripCityPlaces = tripCityPlaces;
    }
}
