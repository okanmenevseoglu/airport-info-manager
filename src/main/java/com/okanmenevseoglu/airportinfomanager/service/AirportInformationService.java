package com.okanmenevseoglu.airportinfomanager.service;

import com.okanmenevseoglu.airportinfomanager.dto.request.AirportInformationQueryRequest;
import com.okanmenevseoglu.airportinfomanager.dto.response.*;
import com.okanmenevseoglu.airportinfomanager.util.builder.response.AirportInformationQueryResponseBuilder;
import com.okanmenevseoglu.airportinfomanager.util.builder.response.AirportInformationReportResponseBuilder;
import com.okanmenevseoglu.airportinfomanager.util.helper.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportInformationService {

    private final CountryService countryService;

    private final RunwayService runwayService;

    @Autowired
    public AirportInformationService(CountryService countryService, RunwayService runwayService) {
        this.countryService = countryService;
        this.runwayService = runwayService;
    }

    public AirportInformationReportResponse getAirportInformationReport() {
        List<CountryWithAirportCountResponse> countriesWithHighestAirportCount = countryService.getCountriesWithHighestNumberOfAirports();
        List<CountryWithAirportCountResponse> countriesWithLowestAirportCount = countryService.getCountriesWithLowestNumberOfAirports();
        List<TypeOfRunwayByCountryResponse> typeOfRunwaysByCountry = countryService.getTypeOfRunwaysByCountry();
        List<RunwayIdentificationWithCountResponse> runwayIdentificationsWithCount = runwayService.getRunwayIdentificationsWithCount();

        return AirportInformationReportResponseBuilder.anAirportInformationReportResponse()
                .countriesWithHighestAirportCount(countriesWithHighestAirportCount)
                .countriesWithLowestAirportCount(countriesWithLowestAirportCount)
                .runwayIdentificationsWithCount(runwayIdentificationsWithCount)
                .typeOfRunwaysByCountry(typeOfRunwaysByCountry)
                .build();
    }

    public AirportInformationQueryResponse getAirportInformationQuery(AirportInformationQueryRequest airportInformationQueryRequest) {
        String countryCode = StringHelper.isNotBlank(airportInformationQueryRequest.getCountryCode()) ? airportInformationQueryRequest.getCountryCode() + '%' : "";
        String countryName = StringHelper.isNotBlank(airportInformationQueryRequest.getCountryName()) ? airportInformationQueryRequest.getCountryName() + '%' : "";

        List<AirportInformationByCountryResponse> airportInformationByCountryResponses = countryService.getAirportInformationByCountryResponses(countryCode, countryName);

        return AirportInformationQueryResponseBuilder.anAirportInformationQueryResponse()
                .airportInformationByCountryResponses(airportInformationByCountryResponses)
                .build();
    }
}