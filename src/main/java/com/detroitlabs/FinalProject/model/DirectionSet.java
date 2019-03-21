package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionSet {

    private ArrayList<TripLeg> routes = new ArrayList();

    @JsonProperty("routes")
    public ArrayList<TripLeg> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(ArrayList<TripLeg> routes) {
        this.routes = routes;
    }
}
