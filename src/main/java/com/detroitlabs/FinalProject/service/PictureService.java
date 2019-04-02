package com.detroitlabs.FinalProject.service;

import com.detroitlabs.FinalProject.model.PictureWrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PictureService {

    public PictureWrapper fetchPictureByCity(String tripEnd){
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject("https://api.unsplash.com/search/photos?page=1&query="+ tripEnd + "&client_id=bbea8bf9345fd9d845d0c0998cc646cb2e71c8debe867a7e179ec624c26956ac", PictureWrapper.class);
    }
}
