package com.okanmenevseoglu.airportinfomanager.util.converter.model;

import com.okanmenevseoglu.airportinfomanager.model.Airport;
import com.okanmenevseoglu.airportinfomanager.util.builder.model.AirportBuilder;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import com.okanmenevseoglu.airportinfomanager.util.helper.StringHelper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AirportConverter implements BaseConverter<String[], Airport> {

    private static final int AIRPORT_INFO_COLUMN_COUNT = 18;

    @Override
    public Airport apply(String[] strings) {
        Airport airport = null;
        if (Objects.nonNull(strings) && strings.length == AIRPORT_INFO_COLUMN_COUNT) {
            airport = AirportBuilder.anAirport()
                    .id(Long.valueOf(strings[0]))
                    .ident(strings[1])
                    .type(strings[2])
                    .name(strings[3])
                    .latitudeDeg(StringHelper.getBigDecimalValueWithNullControl(strings[4]))
                    .longitudeDeg(StringHelper.getBigDecimalValueWithNullControl(strings[5]))
                    .elevationFt(StringHelper.getIntegerValueWithNullControl(strings[6]))
                    .continent(strings[7])
                    .isoCountry(strings[8])
                    .isoRegion(strings[9])
                    .municipality(strings[10])
                    .scheduledService(StringHelper.getBooleanValueWithNullControl(strings[11], "yes"))
                    .gpsCode(strings[12])
                    .iataCode(strings[13])
                    .localCode(strings[14])
                    .homeLink(strings[15])
                    .wikipediaLink(strings[16])
                    .keywords(strings[17])
                    .build();
        }
        return airport;
    }
}