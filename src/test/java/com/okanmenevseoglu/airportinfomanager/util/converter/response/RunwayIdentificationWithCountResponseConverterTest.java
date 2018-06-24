package com.okanmenevseoglu.airportinfomanager.util.converter.response;

import com.okanmenevseoglu.airportinfomanager.dto.response.RunwayIdentificationWithCountResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class RunwayIdentificationWithCountResponseConverterTest {

    @InjectMocks
    private RunwayIdentificationWithCountResponseConverter runwayIdentificationWithCountResponseConverter;

    @Test
    public void shouldConvert() {
        Object[] objects = new Object[2];
        objects[0] = "runawayIdentification";
        objects[1] = BigInteger.TEN;

        RunwayIdentificationWithCountResponse runwayIdentificationWithCountResponse = runwayIdentificationWithCountResponseConverter.apply(objects);

        assertThat(runwayIdentificationWithCountResponse.getRunwayIdentification()).isEqualTo("runawayIdentification");
        assertThat(runwayIdentificationWithCountResponse.getCount()).isEqualTo(10);
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        Object[] objects = new Object[9];

        RunwayIdentificationWithCountResponse runwayIdentificationWithCountResponse = runwayIdentificationWithCountResponseConverter.apply(objects);

        assertThat(runwayIdentificationWithCountResponse).isNull();
    }
}