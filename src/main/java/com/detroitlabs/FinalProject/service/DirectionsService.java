package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.StationsWrapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DirectionsService {

    @Value("${GOOGLE_MAPS_KEY}")
    private String googleMapsKey;

    public StationsWrapper fetchDirectionsForRoute() {
        RestTemplate restTemplate = new RestTemplate();

        String googleDirectionsRequest = "https://maps.googleapis.com/maps/api/directions/json?origin=Disneyland&destination=Universal+Studios+Hollywood&key=" + googleMapsKey;
        return restTemplate.getForObject(googleDirectionsRequest, StationsWrapper.class);

    }

}



