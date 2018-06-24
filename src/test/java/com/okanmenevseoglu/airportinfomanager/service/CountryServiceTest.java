package com.okanmenevseoglu.airportinfomanager.service;

import com.okanmenevseoglu.airportinfomanager.repository.CountryRepository;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.AirportInformationByCountryResponseConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.CountryWithAirportCountResponseConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.TypeOfRunwayByCountryResponseConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CountryServiceTest {

    @Mock
    private CountryRepository countryRepository;

    @Mock
    private CountryWithAirportCountResponseConverter countryWithAirportCountResponseConverter;

    @Mock
    private TypeOfRunwayByCountryResponseConverter typeOfRunwayByCountryResponseConverter;

    @Mock
    private AirportInformationByCountryResponseConverter airportInformationByCountryResponseConverter;

    @InjectMocks
    private CountryService countryService;

    @Test
    public void getCountriesWithHighestNumberOfAirports() {
        List<Object[]> objects = Arrays.asList(new Object[]{}, new Object[]{});

        when(countryRepository.getCountriesWithHighestNumberOfAirports()).thenReturn(objects);

        countryService.getCountriesWithHighestNumberOfAirports();

        verify(countryWithAirportCountResponseConverter).convertToList(objects);
    }

    @Test
    public void getCountriesWithLowestNumberOfAirports() {
        List<Object[]> objects = Arrays.asList(new Object[]{}, new Object[]{});

        when(countryRepository.getCountriesWithLowestNumberOfAirports()).thenReturn(objects);

        countryService.getCountriesWithLowestNumberOfAirports();

        verify(countryWithAirportCountResponseConverter).convertToList(objects);
    }

    @Test
    public void getTypeOfRunwaysByCountry() {
        List<Object[]> objects = Arrays.asList(new Object[]{}, new Object[]{});

        when(countryRepository.getTypeOfRunwaysByCountryWithSurfaceInfo()).thenReturn(objects);

        countryService.getTypeOfRunwaysByCountry();

        verify(typeOfRunwayByCountryResponseConverter).convertToList(objects);
    }

    @Test
    public void getAirportInformationByCountryResponses() {
        List<Object[]> objects = Arrays.asList(new Object[]{}, new Object[]{});

        when(countryRepository.getAirportsAndRunwaysByCountryNameOrCountryCode("countryCode", "countryName")).thenReturn(objects);

        countryService.getAirportInformationByCountryResponses("countryCode", "countryName");

        verify(airportInformationByCountryResponseConverter).convertToList(objects);
    }
}