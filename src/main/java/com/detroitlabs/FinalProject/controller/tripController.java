package com.detroitlabs.FinalProject.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tripController {

    @RequestMapping("/")
    public String displayHomePage(){
        return "home";
    }

}
