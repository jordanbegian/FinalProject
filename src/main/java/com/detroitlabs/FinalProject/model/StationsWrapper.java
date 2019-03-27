package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown =  true)
@Component
public class StationsWrapper {

    private List<Station> stations;

    @JsonProperty("stations")
    public List<Station> getStations() {
        return stations;
    }

    @JsonProperty("stations")
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "StationsWrapper{" +
                "stations=" + stations +
                '}';
    }
}
