package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.CountryWithAirportCountResponse;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Objects;

@Component
public class CountryWithAirportCountResponseConverter implements BaseConverter<Object[], CountryWithAirportCountResponse> {

    private static final int COUNTRY_WITH_COUNT_COLUMN_LENGTH = 2;

    @Override
    public CountryWithAirportCountResponse apply(Object[] objects) {
        CountryWithAirportCountResponse countryWithAirportCountResponse = null;
        if (Objects.nonNull(objects) && objects.length == COUNTRY_WITH_COUNT_COLUMN_LENGTH) {
            countryWithAirportCountResponse = new CountryWithAirportCountResponse();
            countryWithAirportCountResponse.setCountry((String) objects[0]);
            countryWithAirportCountResponse.setAirportCount((BigInteger) objects[1]);
        }
        return countryWithAirportCountResponse;
    }
}