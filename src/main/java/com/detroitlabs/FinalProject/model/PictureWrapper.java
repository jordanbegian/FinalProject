package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PictureWrapper {
    ArrayList<PictureResults> pictureResults = new ArrayList<>();

    @JsonProperty("results")
    public ArrayList<PictureResults> getPictureResults() {
        return pictureResults;
    }

    @JsonProperty("results")
    public void setPictureResults(ArrayList<PictureResults> pictureResults) {
        this.pictureResults = pictureResults;
    }

    @Override
    public String toString() {
        return "PictureWrapper{" +
                "pictureResults=" + pictureResults +
                '}';
    }
}
