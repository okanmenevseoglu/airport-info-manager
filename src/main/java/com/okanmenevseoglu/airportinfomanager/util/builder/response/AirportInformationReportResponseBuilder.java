package com.okanmenevseoglu.airportinfomanager.util.builder.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationReportResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.CountryWithAirportCountResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.RunwayIdentificationWithCountResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.TypeOfRunwayByCountryResponse;

import java.util.List;

public final class AirportInformationReportResponseBuilder {
    private List<CountryWithAirportCountResponse> countriesWithHighestAirportCount;
    private List<CountryWithAirportCountResponse> countriesWithLowestAirportCount;
    private List<TypeOfRunwayByCountryResponse> typeOfRunwaysByCountry;
    private List<RunwayIdentificationWithCountResponse> runwayIdentificationsWithCount;

    private AirportInformationReportResponseBuilder() {
    }

    public static AirportInformationReportResponseBuilder anAirportInformationReportResponse() {
        return new AirportInformationReportResponseBuilder();
    }

    public AirportInformationReportResponseBuilder countriesWithHighestAirportCount(List<CountryWithAirportCountResponse> countriesWithHighestAirportCount) {
        this.countriesWithHighestAirportCount = countriesWithHighestAirportCount;
        return this;
    }

    public AirportInformationReportResponseBuilder countriesWithLowestAirportCount(List<CountryWithAirportCountResponse> countriesWithLowestAirportCount) {
        this.countriesWithLowestAirportCount = countriesWithLowestAirportCount;
        return this;
    }

    public AirportInformationReportResponseBuilder typeOfRunwaysByCountry(List<TypeOfRunwayByCountryResponse> typeOfRunwaysByCountry) {
        this.typeOfRunwaysByCountry = typeOfRunwaysByCountry;
        return this;
    }

    public AirportInformationReportResponseBuilder runwayIdentificationsWithCount(List<RunwayIdentificationWithCountResponse> runwayIdentificationsWithCount) {
        this.runwayIdentificationsWithCount = runwayIdentificationsWithCount;
        return this;
    }

    public AirportInformationReportResponse build() {
        AirportInformationReportResponse airportInformationReportResponse = new AirportInformationReportResponse();
        airportInformationReportResponse.setCountriesWithHighestAirportCount(countriesWithHighestAirportCount);
        airportInformationReportResponse.setCountriesWithLowestAirportCount(countriesWithLowestAirportCount);
        airportInformationReportResponse.setTypeOfRunwaysByCountry(typeOfRunwaysByCountry);
        airportInformationReportResponse.setRunwayIdentificationsWithCount(runwayIdentificationsWithCount);
        return airportInformationReportResponse;
    }
}
