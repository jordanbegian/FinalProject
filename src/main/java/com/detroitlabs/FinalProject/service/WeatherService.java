package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.Forecast;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {


    public Forecast fetchWeatherData(double gaslongitude, double gaslatitude) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "spring");
        HttpEntity entity = new HttpEntity(headers);
        String fetchAllIssues = "api.openweathermap.org/data/2.5/forecast?lat=" + gaslatitude + "&lon=" + gaslongitude + "&APPID=3397e242f4c306e5875092fcba62cebc";
        ResponseEntity<Forecast> response = restTemplate.exchange(fetchAllIssues, HttpMethod.GET, entity, Forecast.class);
        return response.getBody();
    }
}
