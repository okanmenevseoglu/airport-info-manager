package com.okanmenevseoglu.airportinfomanager.util.builder.model;

import com.okanmenevseoglu.airportinfomanager.model.Airport;

import java.math.BigDecimal;

public final class AirportBuilder {
    private String ident;
    private String type;
    private String name;
    private Long id;
    private BigDecimal latitudeDeg;
    private BigDecimal longitudeDeg;
    private Integer elevationFt;
    private String continent;
    private String isoCountry;
    private String isoRegion;
    private String municipality;
    private Boolean scheduledService;
    private String gpsCode;
    private String iataCode;
    private String localCode;
    private String homeLink;
    private String wikipediaLink;
    private String keywords;

    private AirportBuilder() {
    }

    public static AirportBuilder anAirport() {
        return new AirportBuilder();
    }

    public AirportBuilder ident(String ident) {
        this.ident = ident;
        return this;
    }

    public AirportBuilder type(String type) {
        this.type = type;
        return this;
    }

    public AirportBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AirportBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public AirportBuilder latitudeDeg(BigDecimal latitudeDeg) {
        this.latitudeDeg = latitudeDeg;
        return this;
    }

    public AirportBuilder longitudeDeg(BigDecimal longitudeDeg) {
        this.longitudeDeg = longitudeDeg;
        return this;
    }

    public AirportBuilder elevationFt(Integer elevationFt) {
        this.elevationFt = elevationFt;
        return this;
    }

    public AirportBuilder continent(String continent) {
        this.continent = continent;
        return this;
    }

    public AirportBuilder isoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
        return this;
    }

    public AirportBuilder isoRegion(String isoRegion) {
        this.isoRegion = isoRegion;
        return this;
    }

    public AirportBuilder municipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public AirportBuilder scheduledService(Boolean scheduledService) {
        this.scheduledService = scheduledService;
        return this;
    }

    public AirportBuilder gpsCode(String gpsCode) {
        this.gpsCode = gpsCode;
        return this;
    }

    public AirportBuilder iataCode(String iataCode) {
        this.iataCode = iataCode;
        return this;
    }

    public AirportBuilder localCode(String localCode) {
        this.localCode = localCode;
        return this;
    }

    public AirportBuilder homeLink(String homeLink) {
        this.homeLink = homeLink;
        return this;
    }

    public AirportBuilder wikipediaLink(String wikipediaLink) {
        this.wikipediaLink = wikipediaLink;
        return this;
    }

    public AirportBuilder keywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    public Airport build() {
        Airport airport = new Airport();
        airport.setIdent(ident);
        airport.setType(type);
        airport.setName(name);
        airport.setId(id);
        airport.setLatitudeDeg(latitudeDeg);
        airport.setLongitudeDeg(longitudeDeg);
        airport.setElevationFt(elevationFt);
        airport.setContinent(continent);
        airport.setIsoCountry(isoCountry);
        airport.setIsoRegion(isoRegion);
        airport.setMunicipality(municipality);
        airport.setScheduledService(scheduledService);
        airport.setGpsCode(gpsCode);
        airport.setIataCode(iataCode);
        airport.setLocalCode(localCode);
        airport.setHomeLink(homeLink);
        airport.setWikipediaLink(wikipediaLink);
        airport.setKeywords(keywords);
        return airport;
    }
}
