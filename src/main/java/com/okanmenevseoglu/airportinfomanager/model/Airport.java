package com.okanmenevseoglu.airportinfomanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class Airport extends BaseEntity {

    private String ident;

    private String type;

    private String name;

    private BigDecimal latitudeDeg;

    private BigDecimal longitudeDeg;

    private Integer elevationFt;

    private String continent;

    // Country codes
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
}