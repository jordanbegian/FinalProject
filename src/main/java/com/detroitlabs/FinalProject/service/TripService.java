package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.StationsWrapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TripService {

    public StationsWrapper DisplayAllGasStation(double gaslongitude, double gaslatitude){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "spring");
        HttpEntity entity = new HttpEntity(headers);
        String fetchAllIssues = "http://api.mygasfeed.com/stations/radius/" + gaslatitude + "/" + gaslongitude + "/2/reg/Distance/aww3vx3d8t.json";
        ResponseEntity<StationsWrapper> response = restTemplate.exchange(fetchAllIssues, HttpMethod.GET, entity, StationsWrapper.class);
        return response.getBody();
    }
}
