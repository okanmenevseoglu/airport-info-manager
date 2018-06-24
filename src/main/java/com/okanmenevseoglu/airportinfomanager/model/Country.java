package com.okanmenevseoglu.airportinfomanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class Country extends BaseEntity {

    private String code;

    private String name;

    private String continent;

    private String wikipediaLink;

    private String keywords;
}