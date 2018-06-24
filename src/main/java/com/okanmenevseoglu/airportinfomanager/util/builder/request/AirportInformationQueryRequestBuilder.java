package com.okanmenevseoglu.airportinfomanager.util.builder.request;

import com.okanmenevseoglu.airportinfomanager.dto.request.AirportInformationQueryRequest;

public final class AirportInformationQueryRequestBuilder {
    private String countryCode;
    private String countryName;

    private AirportInformationQueryRequestBuilder() {
    }

    public static AirportInformationQueryRequestBuilder anAirportInformationQueryRequest() {
        return new AirportInformationQueryRequestBuilder();
    }

    public AirportInformationQueryRequestBuilder countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public AirportInformationQueryRequestBuilder countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public AirportInformationQueryRequest build() {
        AirportInformationQueryRequest airportInformationQueryRequest = new AirportInformationQueryRequest();
        airportInformationQueryRequest.setCountryCode(countryCode);
        airportInformationQueryRequest.setCountryName(countryName);
        return airportInformationQueryRequest;
    }
}
