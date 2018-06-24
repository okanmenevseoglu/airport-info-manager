package com.okanmenevseoglu.airportinfomanager.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AirportInformationQueryResponse {

    private List<AirportInformationByCountryResponse> airportInformationByCountryResponses;
}