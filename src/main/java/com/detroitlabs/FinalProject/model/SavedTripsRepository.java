package com.detroitlabs.FinalProject.model;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;


@Transactional
public interface SavedTripsRepository extends CrudRepository<SavedTrip, Long> {


    @Query("SELECT s FROM SavedTrip s WHERE s.userid = 1")
    Collection<SavedTrip> findTripsByUser();

    // public ArrayList<SavedTrip> findUsersTripsByUserid(long userid);

    //public void deleteSavedTripByTripId(long tripid);

}
