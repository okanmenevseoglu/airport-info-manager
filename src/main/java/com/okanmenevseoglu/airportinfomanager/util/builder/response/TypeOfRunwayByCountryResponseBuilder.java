package com.okanmenevseoglu.airportinfomanager.util.builder.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.TypeOfRunwayByCountryResponse;

public final class TypeOfRunwayByCountryResponseBuilder {
    private String typeOfRunway;
    private String country;

    private TypeOfRunwayByCountryResponseBuilder() {
    }

    public static TypeOfRunwayByCountryResponseBuilder aTypeOfRunwayByCountryResponse() {
        return new TypeOfRunwayByCountryResponseBuilder();
    }

    public TypeOfRunwayByCountryResponseBuilder typeOfRunway(String typeOfRunway) {
        this.typeOfRunway = typeOfRunway;
        return this;
    }

    public TypeOfRunwayByCountryResponseBuilder country(String country) {
        this.country = country;
        return this;
    }

    public TypeOfRunwayByCountryResponse build() {
        TypeOfRunwayByCountryResponse typeOfRunwayByCountryResponse = new TypeOfRunwayByCountryResponse();
        typeOfRunwayByCountryResponse.setTypeOfRunway(typeOfRunway);
        typeOfRunwayByCountryResponse.setCountry(country);
        return typeOfRunwayByCountryResponse;
    }
}
