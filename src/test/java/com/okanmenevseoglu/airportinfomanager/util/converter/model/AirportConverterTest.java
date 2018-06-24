package com.okanmenevseoglu.airportinfomanager.util.converter.model;

import com.okanmenevseoglu.airportinfomanager.model.Airport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class AirportConverterTest {

    @InjectMocks
    private AirportConverter airportConverter;

    @Test
    public void shouldConvert() {
        String[] airportString = new String[18];
        airportString[0] = "1";
        airportString[1] = "ident";
        airportString[2] = "type";
        airportString[3] = "name";
        airportString[4] = "4.0";
        airportString[5] = "5.1";
        airportString[6] = "6";
        airportString[7] = "continent";
        airportString[8] = "isoCountry";
        airportString[9] = "isoRegion";
        airportString[10] = "municipality";
        airportString[11] = "yes";
        airportString[12] = "gpsCode";
        airportString[13] = "iataCode";
        airportString[14] = "localCode";
        airportString[15] = "homeLink";
        airportString[16] = "wikipediaLink";
        airportString[17] = "keywords";

        Airport airport = airportConverter.apply(airportString);

        assertThat(airport.getId()).isEqualTo(1L);
        assertThat(airport.getIdent()).isEqualTo("ident");
        assertThat(airport.getType()).isEqualTo("type");
        assertThat(airport.getName()).isEqualTo("name");
        assertThat(airport.getLatitudeDeg()).isEqualByComparingTo(BigDecimal.valueOf(4));
        assertThat(airport.getLongitudeDeg()).isEqualByComparingTo(BigDecimal.valueOf(5.1));
        assertThat(airport.getElevationFt()).isEqualTo(6);
        assertThat(airport.getContinent()).isEqualTo("continent");
        assertThat(airport.getIsoCountry()).isEqualTo("isoCountry");
        assertThat(airport.getIsoRegion()).isEqualTo("isoRegion");
        assertThat(airport.getMunicipality()).isEqualTo("municipality");
        assertThat(airport.getScheduledService()).isTrue();
        assertThat(airport.getGpsCode()).isEqualTo("gpsCode");
        assertThat(airport.getIataCode()).isEqualTo("iataCode");
        assertThat(airport.getLocalCode()).isEqualTo("localCode");
        assertThat(airport.getHomeLink()).isEqualTo("homeLink");
        assertThat(airport.getWikipediaLink()).isEqualTo("wikipediaLink");
        assertThat(airport.getKeywords()).isEqualTo("keywords");
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        String[] airportString = new String[9];

        Airport airport = airportConverter.apply(airportString);

        assertThat(airport).isNull();
    }
}