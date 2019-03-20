package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.BlankTrip;
import com.detroitlabs.FinalProject.model.Stations;
import com.detroitlabs.FinalProject.model.StationsWrapper;
import com.detroitlabs.FinalProject.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping("/")
    public String displayHomePage(Model model){
        model.addAttribute("blankTrip", new BlankTrip());
        return "bootstrapHome";
    }

    @RequestMapping("/showtrip")
    public String displayTripPage(@ModelAttribute BlankTrip blankTrip, ModelMap modelMap){
       String tripStart = blankTrip.getStart();
       String tripEnd = blankTrip.getEnd();
       modelMap.put("tripStart", tripStart);
       modelMap.put("tripEnd", tripEnd);
        return "showtrip";
    }

//    @RequestMapping("/")
//    @ResponseBody
//    public String displayAllIssues(ModelMap modelMap){
//        StationsWrapper stationsWrapper = tripService.DisplayAllGasStation();
//      List<Stations> allGasStations = stationsWrapper.getStations();
//        modelMap.put("allGasStations", allGasStations);
//        return allGasStations.toString();
//    }


}
