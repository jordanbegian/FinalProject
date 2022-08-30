package com.detroitlabs.FinalProject.controller;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class TripControllerTest {

    private TripController tripController;

    @Before
    public void create(){
        tripController = new TripController();
    }

    @Test
    public void filterDuplicateCities() {
        ArrayList<String> testCities = new ArrayList<>(Arrays.asList("Detroit", "Detroit", "Dearborn", "Dearborn",
                "Taylor", "Flatrock", "Flatrock", "Flatrock"));

        ArrayList<String> testFilteredCities = tripController.filterDuplicateCities(testCities);

        String resultIndex0 = testFilteredCities.get(0);
        String resultIndex1 = testFilteredCities.get(1);
        String resultIndex2 = testFilteredCities.get(2);
        String resultIndex3 = testFilteredCities.get(3);

        int resultFilteredCitiesSize = testFilteredCities.size();

        assertThat(resultIndex0, equalTo("Detroit"));
        assertThat(resultIndex1, equalTo("Dearborn"));
        assertThat(resultIndex2, equalTo("Taylor"));
        assertThat(resultIndex3, equalTo("Flatrock"));

        assertThat(resultFilteredCitiesSize, equalTo(4));
    }
}