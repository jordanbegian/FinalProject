package com.detroitlabs.FinalProject.controller;

import com.detroitlabs.FinalProject.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.spi.ServiceRegistry;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.security.auth.login.Configuration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

//        String queryString = "FROM SavedTrip WHERE userid = " + userid;
//        Session session = sessionFactory.openSession();
//        Query query = session.createQuery(queryString);
//        List<SavedTrip> returnedTrips = ((org.hibernate.query.Query) query).list();

        Collection<SavedTrip> returnedTrips = savedTripsRepository.findTripsByUser();

        return returnedTrips;

    }


}

