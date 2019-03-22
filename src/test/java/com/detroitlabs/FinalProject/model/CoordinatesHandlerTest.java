package com.detroitlabs.FinalProject.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CoordinatesHandlerTest {

    private CoordinatesHandler coordinatesHandler;

    @Before
    public void create(){
        coordinatesHandler = new CoordinatesHandler();
    }

    @Test
    public void filterDuplicateCities() {
        ArrayList<String> testCities = new ArrayList<>(Arrays.asList("Detroit", "Detroit", "Dearborn", "Dearborn",
                "Taylor", "Flatrock", "Flatrock", "Flatrock"));

        ArrayList<String> testFilteredCities = coordinatesHandler.filterDuplicateCities(testCities);

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