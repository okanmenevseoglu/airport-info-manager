package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.TypeOfRunwayByCountryResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TypeOfRunwayByCountryResponseConverterTest {

    @InjectMocks
    private TypeOfRunwayByCountryResponseConverter typeOfRunwayByCountryResponseConverter;

    @Test
    public void shouldConvert() {
        Object[] objects = new Object[2];
        objects[0] = "country";
        objects[1] = "typeOfRunway";

        TypeOfRunwayByCountryResponse typeOfRunwayByCountryResponse = typeOfRunwayByCountryResponseConverter.apply(objects);

        assertThat(typeOfRunwayByCountryResponse.getCountry()).isEqualTo("country");
        assertThat(typeOfRunwayByCountryResponse.getTypeOfRunway()).isEqualTo("typeOfRunway");
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        Object[] objects = new Object[9];

        TypeOfRunwayByCountryResponse typeOfRunwayByCountryResponse = typeOfRunwayByCountryResponseConverter.apply(objects);

        assertThat(typeOfRunwayByCountryResponse).isNull();
    }
}