package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.RunwayIdentificationWithCountResponse;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Objects;

@Component
public class RunwayIdentificationWithCountResponseConverter implements BaseConverter<Object[], RunwayIdentificationWithCountResponse> {

    private static final int RUNAWAY_IDS_COLUMN_LENGTH = 2;

    @Override
    public RunwayIdentificationWithCountResponse apply(Object[] objects) {
        RunwayIdentificationWithCountResponse runwayIdentificationWithCountResponse = null;
        if (Objects.nonNull(objects) && objects.length == RUNAWAY_IDS_COLUMN_LENGTH) {
            runwayIdentificationWithCountResponse = new RunwayIdentificationWithCountResponse();
            runwayIdentificationWithCountResponse.setRunwayIdentification((String) objects[0]);
            runwayIdentificationWithCountResponse.setCount((BigInteger) objects[1]);
        }
        return runwayIdentificationWithCountResponse;
    }
}