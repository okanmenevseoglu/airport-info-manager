package com.okanmenevseoglu.airportinfomanager.util.converter.model;

import com.okanmenevseoglu.airportinfomanager.model.Country;
import com.okanmenevseoglu.airportinfomanager.util.builder.model.CountryBuilder;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CountryConverter implements BaseConverter<String[], Country> {

    private static final int COUNTRY_INFO_COLUMN_COUNT = 6;

    @Override
    public Country apply(String[] strings) {
        Country country = null;
        if (Objects.nonNull(strings) && strings.length == COUNTRY_INFO_COLUMN_COUNT) {
            country = CountryBuilder.aCountry()
                    .id(Long.valueOf(strings[0]))
                    .code(strings[1])
                    .name(strings[2])
                    .continent(strings[3])
                    .wikipediaLink(strings[4])
                    .keywords(strings[5])
                    .build();
        }
        return country;
    }
}