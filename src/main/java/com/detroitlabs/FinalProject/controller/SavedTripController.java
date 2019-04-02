package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class SavedTripController {

    @Autowired
    SavedTripsRepository savedTripsRepository;


    @RequestMapping("/savetrip/{tripStart}-{tripEnd}")
    @ResponseBody
    public String createSavedTrip(@PathVariable(name="tripStart") String tripStart, @PathVariable(name="tripEnd") String tripEnd) {
        try {
            SavedTrip tripToSave = new SavedTrip(1, tripStart, tripEnd);
            savedTripsRepository.save(tripToSave);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "index";
    }

    @RequestMapping("/createTripToSave/{tripStart}/{tripEnd}/{waypoints}")
    @ResponseBody
    public String createSavedTrip(@PathVariable(name="tripStart") String tripStart, @PathVariable(name="tripEnd") String tripEnd, @PathVariable(name="waypoints") String waypoints) {


        try {
            SavedTrip tripToSave = new SavedTrip(1, tripStart, tripEnd, waypoints);
            savedTripsRepository.save(tripToSave);
        }
        catch (Exception ex) {
            return "Error creating the trip";
        }
        return "CurrentUsersTripsTemplate";
    }


//    @RequestMapping("/delete-saved-trip")
//    @ResponseBody
//    public String deleteSavedTripByTripId(long tripid) {
//        try {
//            savedTripsRepository.delete(tripid);
//        }
//        catch (Exception ex) {
//            return "Error deleting the user:" + ex.toString();
//        }
//        return "User succesfully deleted!";
//    }


    @RequestMapping("/get-trips-by-userid")
    @ResponseBody
    public Collection<SavedTrip> getByUserid() {


        Collection<SavedTrip> returnedTrips = savedTripsRepository.findTripsByUser();

        return returnedTrips;

    }


}

