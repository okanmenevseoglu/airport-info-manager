package com.okanmenevseoglu.airportinfomanager.util.converter.model;

import com.okanmenevseoglu.airportinfomanager.model.Runway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class RunwayConverterTest {

    @InjectMocks
    private RunwayConverter runwayConverter;

    @Test
    public void shouldConvert() {
        String[] runwayString = new String[20];
        runwayString[0] = "1";
        runwayString[1] = "10";
        runwayString[2] = "airportIdent";
        runwayString[3] = "60";
        runwayString[4] = "60";
        runwayString[5] = "surface";
        runwayString[6] = "1";
        runwayString[7] = "0";
        runwayString[8] = "leIdent";
        runwayString[9] = "9.0";
        runwayString[10] = "10.1";
        runwayString[11] = "11";
        runwayString[12] = "12.2";
        runwayString[13] = "13";
        runwayString[14] = "heIdent";
        runwayString[15] = "15.5";
        runwayString[16] = "16.6";
        runwayString[17] = "17";
        runwayString[18] = "18.8";
        runwayString[19] = "19";

        Runway runway = runwayConverter.apply(runwayString);

        assertThat(runway.getId()).isEqualTo(1L);
        assertThat(runway.getAirportRef()).isEqualTo(10L);
        assertThat(runway.getAirportIdent()).isEqualTo("airportIdent");
        assertThat(runway.getLengthFt()).isEqualTo(60);
        assertThat(runway.getWidthFt()).isEqualTo(60);
        assertThat(runway.getSurface()).isEqualTo("surface");
        assertThat(runway.getLighted()).isTrue();
        assertThat(runway.getClosed()).isFalse();
        assertThat(runway.getLeIdent()).isEqualTo("leIdent");
        assertThat(runway.getLeLatitudeDeg()).isEqualByComparingTo(BigDecimal.valueOf(9));
        assertThat(runway.getLeLongitudeDeg()).isEqualByComparingTo(BigDecimal.valueOf(10.1));
        assertThat(runway.getLeElevationFt()).isEqualTo(11);
        assertThat(runway.getLeHeadingDegT()).isEqualByComparingTo(BigDecimal.valueOf(12.2));
        assertThat(runway.getLeDisplacedThresholdFt()).isEqualTo(13);
        assertThat(runway.getHeIdent()).isEqualTo("heIdent");
        assertThat(runway.getHeLatitudeDeg()).isEqualTo(BigDecimal.valueOf(15.5));
        assertThat(runway.getHeLongitudeDeg()).isEqualTo(BigDecimal.valueOf(16.6));
        assertThat(runway.getHeElevationFt()).isEqualTo(17);
        assertThat(runway.getHeHeadingDegT()).isEqualTo(BigDecimal.valueOf(18.8));
        assertThat(runway.getHeDisplacedThresholdFt()).isEqualTo(19);
    }

    @Test
    public void shouldReturnNullIfDifferentSizeOfArray() {
        String[] runwayString = new String[9];

        Runway runway = runwayConverter.apply(runwayString);

        assertThat(runway).isNull();
    }
}