package com.detroitlabs.FinalProject.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BusinessInformation {
    private String name;
    private String image_url;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
