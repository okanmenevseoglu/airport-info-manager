package com.okanmenevseoglu.airportinfomanager.util.helper;

import java.math.BigDecimal;
import java.util.Objects;

public class StringHelper {

    public static Boolean getBooleanValueWithNullControl(String string, String stringToCompare) {
        return Objects.isNull(string) ? null : string.equals(stringToCompare);
    }

    public static BigDecimal getBigDecimalValueWithNullControl(String string) {
        return Objects.isNull(string) ? null : new BigDecimal(string);
    }

    public static Integer getIntegerValueWithNullControl(String string) {
        return Objects.isNull(string) ? null : Integer.valueOf(string);
    }

    public static boolean isNotBlank(String s) {
        return Objects.nonNull(s) && s.trim().length() > 0;
    }
}