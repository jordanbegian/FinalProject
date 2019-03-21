package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionSetRepository {

    private DirectionSet directionSet = new DirectionSet();

    public DirectionSet getDirectionSet() {
        return directionSet;
    }

    public void setDirectionSet(DirectionSet directionSet) {
        this.directionSet = directionSet;
    }
}
