package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TripLegs {

    ArrayList<StepRepository> stepRepository = new ArrayList<>();

    @JsonProperty("legs")
    public ArrayList<StepRepository> getStepRepository() {
        return stepRepository;
    }

    @JsonProperty("legs")
    public void setStepRepository(ArrayList<StepRepository> stepRepository) {
        this.stepRepository = stepRepository;
    }
}

