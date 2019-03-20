package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.*;
import com.detroitlabs.FinalProject.service.TripService;
import com.detroitlabs.FinalProject.service.YelpService;
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
    Businesses businesses;

    @Autowired
    BusinessInformation businessInformation;

    @Autowired
    YelpService yelpService;

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

       Businesses businesses = yelpService.fetchYelpMostRatedBars(blankTrip.getEnd());
       modelMap.put("businesses",businesses.getBusinesses());

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
