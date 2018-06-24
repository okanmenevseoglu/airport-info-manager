package com.okanmenevseoglu.airportinfomanager.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class RunwayIdentificationWithCountResponse {

    private String runwayIdentification;

    private BigInteger count;
}