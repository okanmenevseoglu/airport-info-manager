package com.okanmenevseoglu.airportinfomanager.util.builder.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationByCountryResponse;

import java.math.BigInteger;

public final class AirportInformationByCountryResponseBuilder {
    private String countryName;
    private String countryCode;
    private String airportName;
    private BigInteger runwayId;

    private AirportInformationByCountryResponseBuilder() {
    }

    public static AirportInformationByCountryResponseBuilder anAirportInformationByCountryResponse() {
        return new AirportInformationByCountryResponseBuilder();
    }

    public AirportInformationByCountryResponseBuilder countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public AirportInformationByCountryResponseBuilder countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public AirportInformationByCountryResponseBuilder airportName(String airportName) {
        this.airportName = airportName;
        return this;
    }

    public AirportInformationByCountryResponseBuilder runwayId(BigInteger runwayId) {
        this.runwayId = runwayId;
        return this;
    }

    public AirportInformationByCountryResponse build() {
        AirportInformationByCountryResponse airportInformationByCountryResponse = new AirportInformationByCountryResponse();
        airportInformationByCountryResponse.setCountryName(countryName);
        airportInformationByCountryResponse.setCountryCode(countryCode);
        airportInformationByCountryResponse.setAirportName(airportName);
        airportInformationByCountryResponse.setRunwayId(runwayId);
        return airportInformationByCountryResponse;
    }
}
