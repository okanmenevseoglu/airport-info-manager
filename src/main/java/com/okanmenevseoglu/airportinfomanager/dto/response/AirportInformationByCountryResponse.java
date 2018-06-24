package com.okanmenevseoglu.airportinfomanager.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Setter
@Getter
public class AirportInformationByCountryResponse {

    private String countryName;

    private String countryCode;

    private String airportName;

    private BigInteger runwayId;
}