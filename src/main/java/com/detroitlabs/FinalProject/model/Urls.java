package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Urls {
    private String regular;

    @JsonProperty("full")
    public String getRegular() {
        return regular;
    }


    @JsonProperty("full")
    public void setRegular(String regular) {
        this.regular = regular;
    }

    @Override
    public String toString() {
        return "Urls{" +
                "regular='" + regular + '\'' +
                '}';
    }
}
