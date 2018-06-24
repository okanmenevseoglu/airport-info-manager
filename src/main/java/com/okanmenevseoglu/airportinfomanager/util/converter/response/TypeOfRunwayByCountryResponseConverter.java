package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.TypeOfRunwayByCountryResponse;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class TypeOfRunwayByCountryResponseConverter implements BaseConverter<Object[], TypeOfRunwayByCountryResponse> {

    private static final int TYPE_OF_RUNWAY_COLUMN_LENGTH = 2;

    @Override
    public TypeOfRunwayByCountryResponse apply(Object[] objects) {
        TypeOfRunwayByCountryResponse typeOfRunwayByCountryResponse = null;
        if (Objects.nonNull(objects) && objects.length == TYPE_OF_RUNWAY_COLUMN_LENGTH) {
            typeOfRunwayByCountryResponse = new TypeOfRunwayByCountryResponse();
            typeOfRunwayByCountryResponse.setCountry(objects[0].toString());
            typeOfRunwayByCountryResponse.setTypeOfRunway(objects[1].toString());
        }
        return typeOfRunwayByCountryResponse;
    }
}