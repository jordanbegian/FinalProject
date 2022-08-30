package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessInformation {
    private String name;
    private String imageUrl;
    private String url;
    private YelpCoordinates coordinates;
    private double rating;
    private int reviewCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String image_url) {
        this.imageUrl = image_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public YelpCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(YelpCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @JsonProperty("review_count")
    public int getReviewCount() {
        return reviewCount;
    }

    @JsonProperty("review_count")
    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getLowercaseName(){
       return getName().toLowerCase().replaceAll(" ","-" );
    }
}
