package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PictureResults {
    private Urls urls;

    @JsonProperty("urls")
    public Urls getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "PictureResults{" +
                "urls=" + urls +
                '}';
    }
}
