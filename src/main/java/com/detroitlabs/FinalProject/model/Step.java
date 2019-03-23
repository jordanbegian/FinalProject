package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Step {

    private StepCoordinates startLocation;
    private StepCoordinates endLocation;

    @JsonProperty("start_location")
    public StepCoordinates getStartLocation() {
        return startLocation;
    }

    @JsonProperty("start_location")
    public void setStartLocation(StepCoordinates startLocation) {
        this.startLocation = startLocation;
    }

    @JsonProperty("end_location")
    public StepCoordinates getEndLocation() {
        return endLocation;
    }

    @JsonProperty("end_location")
    public void setEndLocation(StepCoordinates endLocation) {
        this.endLocation = endLocation;
    }


}
