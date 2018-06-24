package com.okanmenevseoglu.airportinfomanager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class Runway extends BaseEntity {

    // Airport ids
    private Long airportRef;

    private String airportIdent;

    private Integer lengthFt;

    private Integer widthFt;

    private String surface;

    private Boolean lighted;

    private Boolean closed;

    private String leIdent;

    private BigDecimal leLatitudeDeg;

    private BigDecimal leLongitudeDeg;

    private Integer leElevationFt;

    private BigDecimal leHeadingDegT;

    private Integer leDisplacedThresholdFt;

    private String heIdent;

    private BigDecimal heLatitudeDeg;

    private BigDecimal heLongitudeDeg;

    private Integer heElevationFt;

    private BigDecimal heHeadingDegT;

    private Integer heDisplacedThresholdFt;
}