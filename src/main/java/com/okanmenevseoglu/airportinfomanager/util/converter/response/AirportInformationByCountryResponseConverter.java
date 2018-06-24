package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationByCountryResponse;
import com.okanmenevseoglu.airportinfomanager.util.builder.response.AirportInformationByCountryResponseBuilder;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Objects;

@Component
public class AirportInformationByCountryResponseConverter implements BaseConverter<Object[], AirportInformationByCountryResponse> {

    private static final int AIRPORT_INFO_BY_COUNTRY_COLUMN_COUNT = 4;

    @Override
    public AirportInformationByCountryResponse apply(Object[] objects) {
        AirportInformationByCountryResponse airportInformationByCountryResponse = null;

        if (Objects.nonNull(objects) && objects.length == AIRPORT_INFO_BY_COUNTRY_COLUMN_COUNT) {
            airportInformationByCountryResponse = AirportInformationByCountryResponseBuilder
                    .anAirportInformationByCountryResponse()
                    .countryCode((String) objects[0])
                    .countryName((String) objects[1])
                    .airportName((String) objects[2])
                    .runwayId((BigInteger) objects[3])
                    .build();
        }

        return airportInformationByCountryResponse;
    }
}