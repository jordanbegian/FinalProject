package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.DirectionSet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DirectionsService {

    @Value("${GOOGLE_MAPS_KEY}")
    private String googleMapsKey;

    public DirectionSet fetchDirectionSetForRoute(String tripStart, String tripEnd) {
        RestTemplate restTemplate = new RestTemplate();

        String googleDirectionsRequest = "https://maps.googleapis.com/maps/api/directions/json?origin=" + tripStart + "&destination=" + tripEnd + "&key=" + googleMapsKey;
        return restTemplate.getForObject(googleDirectionsRequest, DirectionSet.class);

    }

}



