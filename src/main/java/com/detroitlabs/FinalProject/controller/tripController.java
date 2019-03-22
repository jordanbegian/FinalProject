package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.*;
import com.detroitlabs.FinalProject.service.DirectionsService;
import com.detroitlabs.FinalProject.service.TripService;
import com.detroitlabs.FinalProject.service.YelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
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
    DirectionsService directionsService;

    @Autowired
    StationsWrapper stationsWrapper;

    @Value("${GOOGLE_MAPS_KEY}")
    private String googleMapsKey;

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

       //YELP

       Businesses barBusinesses = yelpService.fetchYelpMostRatedBars(blankTrip.getEnd());
       modelMap.put("barBusinesses",barBusinesses.getBusinesses());

       Businesses restaurantBusinesses = yelpService.fetchYelpMostRatedRestaurants(blankTrip.getEnd());
       modelMap.put("restaurantBusinesses", restaurantBusinesses.getBusinesses());

       Businesses hotelBusinesses = yelpService.fetchYelpMostRatedHotels(blankTrip.getEnd());
       modelMap.put("hotelBusinesses", hotelBusinesses.getBusinesses());

       Businesses entertainmentBusinesses = yelpService.fetchYelpMostRatedEntertainment(blankTrip.getEnd());
       modelMap.put("entertainmentBusinesses", entertainmentBusinesses.getBusinesses());

       //Google Directions

       DirectionSet directionSet =  directionsService.fetchDirectionSetForRoute(tripStart, tripEnd);
       ArrayList<Step> tripSteps = directionSet.getRoutes().get(0).getStepRepository().get(0).getSteps();



       modelMap.put("tripSteps", tripSteps);

       modelMap.put("googleMapsKey", googleMapsKey);

        return "showtrip";
    }
//putting in a comment
//    @RequestMapping("/")
//    @ResponseBody
//    public String displayAllIssues(ModelMap modelMap){
//        StationsWrapper stationsWrapper = tripService.DisplayAllGasStation();
//      List<Stations> allGasStations = stationsWrapper.getStations();
//        modelMap.put("allGasStations", allGasStations);
//        return allGasStations.toString();
//    }


}
