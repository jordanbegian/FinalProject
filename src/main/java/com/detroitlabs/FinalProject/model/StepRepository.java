package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StepRepository {

    private ArrayList<Step> steps = new ArrayList();

    @JsonProperty("steps")
    public ArrayList<Step> getSteps() {
        return steps;
    }

    @JsonProperty("steps")
    public void setSteps(ArrayList<Step> steps) {
        this.steps = steps;
    }
}
