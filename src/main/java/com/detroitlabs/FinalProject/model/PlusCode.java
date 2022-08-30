package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;

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


    public String parseCityNameFromCode(){
        String[] splitCityCode = getCityCodeName().split("\\s+");

        ArrayList<String> splitCode = new ArrayList<>(Arrays.asList(splitCityCode));

        splitCode.remove(0);

       return splitCode.toString().replaceAll(",,", ",").replaceAll("\\[", "").replaceAll("\\]","");

    }
}
