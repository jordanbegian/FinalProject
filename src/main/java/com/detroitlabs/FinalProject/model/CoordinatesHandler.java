package com.detroitlabs.FinalProject.model;

import java.util.ArrayList;

public class CoordinatesHandler {
    public ArrayList<String> filterDuplicateCities(ArrayList<String> cities){

        ArrayList<String> filteredCities = new ArrayList<>();

        for (String city : cities){
            if (!filteredCities.contains(city)){
                filteredCities.add(city);
            }
        }

        return filteredCities;
    }
}
