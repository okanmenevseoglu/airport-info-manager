package com.okanmenevseoglu.airportinfomanager.util.builder.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.RunwayIdentificationWithCountResponse;

import java.math.BigInteger;

public final class RunwayIdentificationWithCountResponseBuilder {
    private String runwayIdentification;
    private BigInteger count;

    private RunwayIdentificationWithCountResponseBuilder() {
    }

    public static RunwayIdentificationWithCountResponseBuilder aRunwayIdentificationWithCountResponse() {
        return new RunwayIdentificationWithCountResponseBuilder();
    }

    public RunwayIdentificationWithCountResponseBuilder runwayIdentification(String runwayIdentification) {
        this.runwayIdentification = runwayIdentification;
        return this;
    }

    public RunwayIdentificationWithCountResponseBuilder count(BigInteger count) {
        this.count = count;
        return this;
    }

    public RunwayIdentificationWithCountResponse build() {
        RunwayIdentificationWithCountResponse runwayIdentificationWithCountResponse = new RunwayIdentificationWithCountResponse();
        runwayIdentificationWithCountResponse.setRunwayIdentification(runwayIdentification);
        runwayIdentificationWithCountResponse.setCount(count);
        return runwayIdentificationWithCountResponse;
    }
}
