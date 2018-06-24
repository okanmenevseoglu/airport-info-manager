package com.okanmenevseoglu.airportinfomanager.service;

import com.okanmenevseoglu.airportinfomanager.dto.request.AirportInformationQueryRequest;
import com.okanmenevseoglu.airportinfomanager.dto.response.*;
import com.okanmenevseoglu.airportinfomanager.util.builder.request.AirportInformationQueryRequestBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AirportInformationServiceTest {

    @Mock
    private CountryService countryService;

    @Mock
    private RunwayService runwayService;

    @InjectMocks
    private AirportInformationService airportInformationService;

    @Test
    public void shouldGetAirportInformationReport() {
        List<CountryWithAirportCountResponse> countriesWithHighestAirportCount = new ArrayList<>();
        List<CountryWithAirportCountResponse> countriesWithLowestAirportCount = new ArrayList<>();
        List<TypeOfRunwayByCountryResponse> typeOfRunwaysByCountry = new ArrayList<>();
        List<RunwayIdentificationWithCountResponse> runwayIdentificationsWithCount = new ArrayList<>();

        when(countryService.getCountriesWithHighestNumberOfAirports()).thenReturn(countriesWithHighestAirportCount);
        when(countryService.getCountriesWithLowestNumberOfAirports()).thenReturn(countriesWithLowestAirportCount);
        when(countryService.getTypeOfRunwaysByCountry()).thenReturn(typeOfRunwaysByCountry);
        when(runwayService.getRunwayIdentificationsWithCount()).thenReturn(runwayIdentificationsWithCount);

        AirportInformationReportResponse airportInformationReportResponse = airportInformationService.getAirportInformationReport();

        assertThat(airportInformationReportResponse.getCountriesWithHighestAirportCount()).isEqualTo(countriesWithHighestAirportCount);
        assertThat(airportInformationReportResponse.getCountriesWithLowestAirportCount()).isEqualTo(countriesWithLowestAirportCount);
        assertThat(airportInformationReportResponse.getTypeOfRunwaysByCountry()).isEqualTo(typeOfRunwaysByCountry);
        assertThat(airportInformationReportResponse.getRunwayIdentificationsWithCount()).isEqualTo(runwayIdentificationsWithCount);
    }

    @Test
    public void shouldGetAirportInformationQuery() {
        AirportInformationQueryRequest airportInformationQueryRequest = AirportInformationQueryRequestBuilder.anAirportInformationQueryRequest()
                .countryCode("countryCode")
                .countryName("countryName")
                .build();

        List<AirportInformationByCountryResponse> airportInformationByCountryResponses = new ArrayList<>();

        when(countryService.getAirportInformationByCountryResponses("countryCode", "countryName")).thenReturn(airportInformationByCountryResponses);

        AirportInformationQueryResponse airportInformationQueryResponse = airportInformationService.getAirportInformationQuery(airportInformationQueryRequest);

        assertThat(airportInformationQueryResponse.getAirportInformationByCountryResponses()).isEqualTo(airportInformationByCountryResponses);
    }
}