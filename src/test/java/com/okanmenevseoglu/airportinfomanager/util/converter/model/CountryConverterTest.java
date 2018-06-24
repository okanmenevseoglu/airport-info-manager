package com.okanmenevseoglu.airportinfomanager.util.converter.model;

import com.okanmenevseoglu.airportinfomanager.model.Country;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CountryConverterTest {

    @InjectMocks
    private CountryConverter countryConverter;

    @Test
    public void shouldConvert() {
        String[] countryString = new String[6];
        countryString[0] = "1";
        countryString[1] = "code";
        countryString[2] = "name";
        countryString[3] = "continent";
        countryString[4] = "wikipediaLink";
        countryString[5] = "keywords";

        Country country = countryConverter.apply(countryString);

        assertThat(country.getId()).isEqualTo(1L);
        assertThat(country.getCode()).isEqualTo("code");
        assertThat(country.getName()).isEqualTo("name");
        assertThat(country.getContinent()).isEqualTo("continent");
        assertThat(country.getWikipediaLink()).isEqualTo("wikipediaLink");
        assertThat(country.getKeywords()).isEqualTo("keywords");
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        String[] countryString = new String[9];

        Country country = countryConverter.apply(countryString);

        assertThat(country).isNull();
    }
}