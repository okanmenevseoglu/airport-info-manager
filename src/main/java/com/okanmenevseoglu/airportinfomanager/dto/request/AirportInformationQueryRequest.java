package com.okanmenevseoglu.airportinfomanager.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AirportInformationQueryRequest {

    private String countryCode;

    private String countryName;
}