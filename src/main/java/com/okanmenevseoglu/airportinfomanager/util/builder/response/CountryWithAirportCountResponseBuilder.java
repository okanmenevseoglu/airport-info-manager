package com.okanmenevseoglu.airportinfomanager.util.builder.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.CountryWithAirportCountResponse;

import java.math.BigInteger;

public final class CountryWithAirportCountResponseBuilder {
    private String country;
    private BigInteger airportCount;

    private CountryWithAirportCountResponseBuilder() {
    }

    public static CountryWithAirportCountResponseBuilder aCountryWithAirportCountResponse() {
        return new CountryWithAirportCountResponseBuilder();
    }

    public CountryWithAirportCountResponseBuilder country(String country) {
        this.country = country;
        return this;
    }

    public CountryWithAirportCountResponseBuilder airportCount(BigInteger airportCount) {
        this.airportCount = airportCount;
        return this;
    }

    public CountryWithAirportCountResponse build() {
        CountryWithAirportCountResponse countryWithAirportCountResponse = new CountryWithAirportCountResponse();
        countryWithAirportCountResponse.setCountry(country);
        countryWithAirportCountResponse.setAirportCount(airportCount);
        return countryWithAirportCountResponse;
    }
}
