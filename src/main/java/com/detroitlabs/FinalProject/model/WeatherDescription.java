package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDescription {

    private String description;

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "WeatherDescription{" +
                "description='" + description + '\'' +
                '}';
    }
}
