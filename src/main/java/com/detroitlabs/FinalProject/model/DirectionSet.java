package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionSet {

    private ArrayList<TripLegs> routes = new ArrayList();

    @JsonProperty("routes")
    public ArrayList<TripLegs> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(ArrayList<TripLegs> routes) {
        this.routes = routes;
    }
}
