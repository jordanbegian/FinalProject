package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.Stations;
import com.detroitlabs.FinalProject.model.StationsWrapper;
import com.detroitlabs.FinalProject.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class tripController {

    @Autowired
    Stations stations;

    @Autowired
    TripService tripService;

    @Autowired
    StationsWrapper stationsWrapper;

//    @RequestMapping("/")
//    public String displayHomePage(){
//        return "index";
//    }

    @RequestMapping("/")
    @ResponseBody
    public String displayAllIssues(ModelMap modelMap){
        StationsWrapper stationsWrapper = tripService.DisplayAllGasStation();
      List<Stations> allGasStations = stationsWrapper.getStations();
        modelMap.put("allGasStations", allGasStations);
        return allGasStations.toString();
    }


}
