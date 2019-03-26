package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Component
public class Stations {

    ArrayList<StationsContents> stationsContents = new ArrayList<>();

    @JsonProperty("stations")
    public ArrayList<StationsContents> getStationsContents() {
        return stationsContents;
    }

    @JsonProperty("stations")
    public void setStationsContents(ArrayList<StationsContents> stationsContents) {
        this.stationsContents = stationsContents;
    }

}
