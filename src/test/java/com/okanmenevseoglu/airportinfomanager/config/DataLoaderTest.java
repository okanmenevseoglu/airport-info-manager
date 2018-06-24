package com.okanmenevseoglu.airportinfomanager.config;

import com.okanmenevseoglu.airportinfomanager.model.Airport;
import com.okanmenevseoglu.airportinfomanager.model.Country;
import com.okanmenevseoglu.airportinfomanager.model.Runway;
import com.okanmenevseoglu.airportinfomanager.repository.AirportRepository;
import com.okanmenevseoglu.airportinfomanager.repository.CountryRepository;
import com.okanmenevseoglu.airportinfomanager.repository.RunwayRepository;
import com.okanmenevseoglu.airportinfomanager.util.converter.model.AirportConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.model.CountryConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.model.RunwayConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DataLoaderTest {

    @Mock
    private CountryRepository countryRepository;

    @Mock
    private AirportRepository airportRepository;

    @Mock
    private RunwayRepository runwayRepository;

    @Mock
    private CountryConverter countryConverter;

    @Mock
    private AirportConverter airportConverter;

    @Mock
    private RunwayConverter runwayConverter;

    @InjectMocks
    private DataLoader dataLoader;

    @Test
    public void shouldNotSaveToDBIfDataIsNotEmpty() {
        when(countryRepository.count()).thenReturn(1L);
        when(airportRepository.count()).thenReturn(1L);
        when(runwayRepository.count()).thenReturn(1L);

        dataLoader.run(null);

        verify(countryRepository).count();
        verify(airportRepository).count();
        verify(runwayRepository).count();

        verifyZeroInteractions(countryConverter);
        verifyZeroInteractions(airportConverter);
        verifyZeroInteractions(runwayConverter);
    }

    @Test
    public void shouldSaveToDBIfDataIsEmpty() {
        List<Country> countries = new ArrayList<>();

        List<Airport> airports = new ArrayList<>();
        List<Runway> runways = new ArrayList<>();

        when(countryRepository.count()).thenReturn(0L);
        when(airportRepository.count()).thenReturn(0L);
        when(runwayRepository.count()).thenReturn(0L);

        when(countryConverter.convertToList(any())).thenReturn(countries);
        when(airportConverter.convertToList(any())).thenReturn(airports);
        when(runwayConverter.convertToList(any())).thenReturn(runways);

        dataLoader.run(null);

        verify(countryRepository).count();
        verify(airportRepository).count();
        verify(runwayRepository).count();

        verify(countryConverter).convertToList(any());
        verify(airportConverter).convertToList(any());
        verify(runwayConverter).convertToList(any());

        verify(countryRepository).saveAll(countries);
        verify(airportRepository).saveAll(airports);
        verify(runwayRepository).saveAll(runways);
    }
}