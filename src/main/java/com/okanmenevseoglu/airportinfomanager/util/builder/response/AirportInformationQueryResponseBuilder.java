package com.okanmenevseoglu.airportinfomanager.util.builder.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationByCountryResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationQueryResponse;

import java.util.List;

public final class AirportInformationQueryResponseBuilder {
    private List<AirportInformationByCountryResponse> airportInformationByCountryResponses;

    private AirportInformationQueryResponseBuilder() {
    }

    public static AirportInformationQueryResponseBuilder anAirportInformationQueryResponse() {
        return new AirportInformationQueryResponseBuilder();
    }

    public AirportInformationQueryResponseBuilder airportInformationByCountryResponses(List<AirportInformationByCountryResponse> airportInformationByCountryResponses) {
        this.airportInformationByCountryResponses = airportInformationByCountryResponses;
        return this;
    }

    public AirportInformationQueryResponse build() {
        AirportInformationQueryResponse airportInformationQueryResponse = new AirportInformationQueryResponse();
        airportInformationQueryResponse.setAirportInformationByCountryResponses(airportInformationByCountryResponses);
        return airportInformationQueryResponse;
    }
}
