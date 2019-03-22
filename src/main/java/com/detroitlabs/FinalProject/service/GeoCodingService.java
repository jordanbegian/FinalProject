package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.DirectionSet;
import com.detroitlabs.FinalProject.model.GeoLocationCityInfo;
import com.detroitlabs.FinalProject.model.StepCoordinates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GeoCodingService {

    @Value("${GOOGLE_MAPS_KEY}")
    private String googleMapsKey;

    public GeoLocationCityInfo fetchCityInfoByCoordinate(StepCoordinates coordinates) {

       Double longitude = coordinates.getLongitude();
       Double latitude = coordinates.getLatitude();

        RestTemplate restTemplate = new RestTemplate();

        String googleDirectionsRequest = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + latitude + "," + longitude + "&key=" + googleMapsKey;
        return restTemplate.getForObject(googleDirectionsRequest, GeoLocationCityInfo.class);

    }
}
