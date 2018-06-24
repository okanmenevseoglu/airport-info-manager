package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationByCountryResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AirportInformationByCountryResponseConverterTest {

    @InjectMocks
    private AirportInformationByCountryResponseConverter airportInformationByCountryResponseConverter;

    @Test
    public void shouldConvert() {
        Object[] objects = new Object[4];
        objects[0] = "countryCode";
        objects[1] = "countryName";
        objects[2] = "airportName";
        objects[3] = BigInteger.TEN;

        AirportInformationByCountryResponse airportInformationByCountryResponse = airportInformationByCountryResponseConverter.apply(objects);

        assertThat(airportInformationByCountryResponse.getCountryName()).isEqualTo("countryName");
        assertThat(airportInformationByCountryResponse.getCountryCode()).isEqualTo("countryCode");
        assertThat(airportInformationByCountryResponse.getAirportName()).isEqualTo("airportName");
        assertThat(airportInformationByCountryResponse.getRunwayId()).isEqualTo(10);
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        Object[] objects = new Object[9];

        AirportInformationByCountryResponse airportInformationByCountryResponse = airportInformationByCountryResponseConverter.apply(objects);

        assertThat(airportInformationByCountryResponse).isNull();
    }
}