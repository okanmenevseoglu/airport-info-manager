package com.okanmenevseoglu.airportinfomanager.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AirportInformationReportResponse {

    private List<CountryWithAirportCountResponse> countriesWithHighestAirportCount;

    private List<CountryWithAirportCountResponse> countriesWithLowestAirportCount;

    private List<TypeOfRunwayByCountryResponse> typeOfRunwaysByCountry;

    private List<RunwayIdentificationWithCountResponse> runwayIdentificationsWithCount;
}