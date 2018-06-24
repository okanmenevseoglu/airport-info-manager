package com.okanmenevseoglu.airportinfomanager.util.helper;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class StringHelperTest {

    @Test
    public void shouldGetBooleanValuesWithNullControl() {
        assertThat(StringHelper.getBooleanValueWithNullControl(null, null)).isNull();
        assertThat(StringHelper.getBooleanValueWithNullControl(null, "")).isNull();
        assertThat(StringHelper.getBooleanValueWithNullControl(null, "t")).isNull();
        assertThat(StringHelper.getBooleanValueWithNullControl(null, "test")).isNull();
        assertThat(StringHelper.getBooleanValueWithNullControl("", null)).isFalse();
        assertThat(StringHelper.getBooleanValueWithNullControl("t", null)).isFalse();
        assertThat(StringHelper.getBooleanValueWithNullControl("test", null)).isFalse();
        assertThat(StringHelper.getBooleanValueWithNullControl("", "")).isTrue();
        assertThat(StringHelper.getBooleanValueWithNullControl("", "t")).isFalse();
        assertThat(StringHelper.getBooleanValueWithNullControl("t", "t")).isTrue();
        assertThat(StringHelper.getBooleanValueWithNullControl("test", "test")).isTrue();
    }

    @Test
    public void shouldGetBigDecimalValuesWithNullControl() {
        assertThat(StringHelper.getBigDecimalValueWithNullControl(null)).isNull();
        assertThat(StringHelper.getBigDecimalValueWithNullControl("0")).isEqualByComparingTo(BigDecimal.ZERO);
        assertThat(StringHelper.getBigDecimalValueWithNullControl("0.00")).isEqualByComparingTo(BigDecimal.ZERO);
        assertThat(StringHelper.getBigDecimalValueWithNullControl("5")).isEqualByComparingTo(BigDecimal.valueOf(5));
        assertThat(StringHelper.getBigDecimalValueWithNullControl("5.123")).isEqualByComparingTo(BigDecimal.valueOf(5.123));
    }

    @Test
    public void shouldGetIntegerValuesWithNullControl() {
        assertThat(StringHelper.getIntegerValueWithNullControl(null)).isNull();
        assertThat(StringHelper.getIntegerValueWithNullControl("0")).isEqualByComparingTo(0);
        assertThat(StringHelper.getIntegerValueWithNullControl("5")).isEqualByComparingTo(5);
    }

    @Test
    public void shouldAssertTrueIfNotBlank() {
        assertThat(StringHelper.isNotBlank(null)).isFalse();
        assertThat(StringHelper.isNotBlank("")).isFalse();
        assertThat(StringHelper.isNotBlank(" ")).isFalse();
        assertThat(StringHelper.isNotBlank("a")).isTrue();
        assertThat(StringHelper.isNotBlank(" a ")).isTrue();
        assertThat(StringHelper.isNotBlank("t  es")).isTrue();
    }
}