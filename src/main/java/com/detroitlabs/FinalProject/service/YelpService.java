package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.Businesses;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class YelpService {

    @Value("${YELP_KEY}")
    private String yelpKey;

    public Businesses fetchYelpData(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization", "BEARER" + yelpKey);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Businesses> responseEntity =
                restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location=detroit",
                        HttpMethod.GET, httpEntity, Businesses.class);

        return responseEntity.getBody();
    }

    public Businesses fetchYelpMostRatedBars(String location){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization", "BEARER " + yelpKey);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Businesses> responseEntity =
                restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location=" + location +
                                "&radius=20000&term=bar&sort_by=review_count&limit=5",
                        HttpMethod.GET, httpEntity, Businesses.class);

        return responseEntity.getBody();
    }

    public Businesses fetchYelpMostRatedRestaurants(String location){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization","BEARER " + yelpKey);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Businesses> responseEntity =
                restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location=" + location +
                                "&radius=20000&term=restaurant&sort_by=review_count&limit=5",
                        HttpMethod.GET, httpEntity, Businesses.class);

        return responseEntity.getBody();
    }

    public Businesses fetchYelpMostRatedHotels(String location){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization","BEARER " + yelpKey);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Businesses> responseEntity =
                restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location=" + location +
                                "&radius=20000&term=hotels&sort_by=review_count&limit=5",
                        HttpMethod.GET, httpEntity, Businesses.class);

        return responseEntity.getBody();
    }

    public Businesses fetchYelpMostRatedEntertainment(String location){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization","BEARER " + yelpKey);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Businesses> responseEntity =
                restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location=" + location +
                                "&radius=20000&term=entertainment&sort_by=review_count&limit=5",
                        HttpMethod.GET, httpEntity, Businesses.class);

        return responseEntity.getBody();
    }
}
