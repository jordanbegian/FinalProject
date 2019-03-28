package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.Forecast;
import com.detroitlabs.FinalProject.model.StationsWrapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
//public class WeatherService {
//
//
//    public Forecast fetchWeatherData(double gaslongitude, double gaslatitude) {
//
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        return restTemplate.getForObject("api.openweathermap.org/data/2.5/forecast?lat=" + gaslatitude + "&lon=" + gaslongitude + "&APPID=3397e242f4c306e5875092fcba62cebc", Forecast.class);
//    }
//}
