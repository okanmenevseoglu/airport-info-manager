package com.okanmenevseoglu.airportinfomanager.util.converter.model;

import com.okanmenevseoglu.airportinfomanager.model.Runway;
import com.okanmenevseoglu.airportinfomanager.util.builder.model.RunwayBuilder;
import com.okanmenevseoglu.airportinfomanager.util.converter.BaseConverter;
import com.okanmenevseoglu.airportinfomanager.util.helper.StringHelper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RunwayConverter implements BaseConverter<String[], Runway> {

    private static final int RUNWAY_INFO_COLUMN_COUNT = 20;

    @Override
    public Runway apply(String[] strings) {
        Runway runway = null;
        if (Objects.nonNull(strings) && strings.length == RUNWAY_INFO_COLUMN_COUNT) {
            runway = RunwayBuilder.aRunway()
                    .id(Long.valueOf(strings[0]))
                    .airportRef(Long.valueOf(strings[1]))
                    .airportIdent(strings[2])
                    .lengthFt(StringHelper.getIntegerValueWithNullControl(strings[3]))
                    .widthFt(StringHelper.getIntegerValueWithNullControl(strings[4]))
                    .surface(strings[5])
                    .lighted(StringHelper.getBooleanValueWithNullControl(strings[6], "1"))
                    .closed(StringHelper.getBooleanValueWithNullControl(strings[7], "1"))
                    .leIdent(strings[8])
                    .leLatitudeDeg(StringHelper.getBigDecimalValueWithNullControl(strings[9]))
                    .leLongitudeDeg(StringHelper.getBigDecimalValueWithNullControl(strings[10]))
                    .leElevationFt(StringHelper.getIntegerValueWithNullControl(strings[11]))
                    .leHeadingDegT(StringHelper.getBigDecimalValueWithNullControl(strings[12]))
                    .leDisplacedThresholdFt(StringHelper.getIntegerValueWithNullControl(strings[13]))
                    .heIdent(strings[14])
                    .heLatitudeDeg(StringHelper.getBigDecimalValueWithNullControl(strings[15]))
                    .heLongitudeDeg(StringHelper.getBigDecimalValueWithNullControl(strings[16]))
                    .heElevationFt(StringHelper.getIntegerValueWithNullControl(strings[17]))
                    .heHeadingDegT(StringHelper.getBigDecimalValueWithNullControl(strings[18]))
                    .heDisplacedThresholdFt(StringHelper.getIntegerValueWithNullControl(strings[19]))
                    .build();
        }
        return runway;
    }
}