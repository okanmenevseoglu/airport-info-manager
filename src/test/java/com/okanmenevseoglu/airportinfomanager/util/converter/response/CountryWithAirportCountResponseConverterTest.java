package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.CountryWithAirportCountResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CountryWithAirportCountResponseConverterTest {

    @InjectMocks
    private CountryWithAirportCountResponseConverter countryWithAirportCountResponseConverter;

    @Test
    public void shouldConvert() {
        Object[] objects = new Object[2];
        objects[0] = "country";
        objects[1] = BigInteger.TEN;

        CountryWithAirportCountResponse countryWithAirportCountResponse = countryWithAirportCountResponseConverter.apply(objects);

        assertThat(countryWithAirportCountResponse.getCountry()).isEqualTo("country");
        assertThat(countryWithAirportCountResponse.getAirportCount()).isEqualTo(10);
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        Object[] objects = new Object[9];

        CountryWithAirportCountResponse countryWithAirportCountResponse = countryWithAirportCountResponseConverter.apply(objects);

        assertThat(countryWithAirportCountResponse).isNull();
    }
}