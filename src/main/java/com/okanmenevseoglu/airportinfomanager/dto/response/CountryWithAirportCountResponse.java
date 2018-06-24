package com.okanmenevseoglu.airportinfomanager.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class CountryWithAirportCountResponse {

    private String country;

    private BigInteger airportCount;
}