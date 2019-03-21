package com.detroitlabs.FinalProject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Businesses {


    private ArrayList<BusinessInformation> businesses = new ArrayList<>();

    public ArrayList<BusinessInformation> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(ArrayList<BusinessInformation> businesses) {
        this.businesses = businesses;
    }
}
