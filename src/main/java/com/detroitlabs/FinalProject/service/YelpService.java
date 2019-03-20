package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.Businesses;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class YelpService {

    public Businesses fetchYelpData(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization", "BEARER 5UPI81qcNVTpdwIM4qZD9Wx-b_9L4wJkMaWDEuQEB_kOKv-" +
                "487SlpfN2a3jTdXvAShLUbRgqnHc97CjHtMq6C8JomI2_t8lQTH7ZHPuSjKGT2Fn9bT_xrh68SLKPXHYx");
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

        headers.add("Authorization", "BEARER 5UPI81qcNVTpdwIM4qZD9Wx-b_9L4wJkMaWDEuQEB_kOKv-" +
                "487SlpfN2a3jTdXvAShLUbRgqnHc97CjHtMq6C8JomI2_t8lQTH7ZHPuSjKGT2Fn9bT_xrh68SLKPXHYx");
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<Businesses> responseEntity =
                restTemplate.exchange("https://api.yelp.com/v3/businesses/search?location=" + location +
                                "&radius=20000&term=bar&sort_by=review_count&limit=5",
                        HttpMethod.GET, httpEntity, Businesses.class);

        return responseEntity.getBody();
    }
}
