package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlusCode {

    private String cityCodeName;

    @JsonProperty("compound_code")
    public String getCityCodeName() {
        return cityCodeName;
    }

    @JsonProperty("compound_code")
    public void setCityCodeName(String cityCodeName) {
        this.cityCodeName = cityCodeName;
    }
}
