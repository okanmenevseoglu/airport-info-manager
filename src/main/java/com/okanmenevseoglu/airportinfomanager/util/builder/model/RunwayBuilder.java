package com.okanmenevseoglu.airportinfomanager.util.builder.model;

import com.okanmenevseoglu.airportinfomanager.model.Runway;

import java.math.BigDecimal;

public final class RunwayBuilder {
    private Long airportRef;
    private String airportIdent;
    private Long id;
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

    private RunwayBuilder() {
    }

    public static RunwayBuilder aRunway() {
        return new RunwayBuilder();
    }

    public RunwayBuilder airportRef(Long airportRef) {
        this.airportRef = airportRef;
        return this;
    }

    public RunwayBuilder airportIdent(String airportIdent) {
        this.airportIdent = airportIdent;
        return this;
    }

    public RunwayBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public RunwayBuilder lengthFt(Integer lengthFt) {
        this.lengthFt = lengthFt;
        return this;
    }

    public RunwayBuilder widthFt(Integer widthFt) {
        this.widthFt = widthFt;
        return this;
    }

    public RunwayBuilder surface(String surface) {
        this.surface = surface;
        return this;
    }

    public RunwayBuilder lighted(Boolean lighted) {
        this.lighted = lighted;
        return this;
    }

    public RunwayBuilder closed(Boolean closed) {
        this.closed = closed;
        return this;
    }

    public RunwayBuilder leIdent(String leIdent) {
        this.leIdent = leIdent;
        return this;
    }

    public RunwayBuilder leLatitudeDeg(BigDecimal leLatitudeDeg) {
        this.leLatitudeDeg = leLatitudeDeg;
        return this;
    }

    public RunwayBuilder leLongitudeDeg(BigDecimal leLongitudeDeg) {
        this.leLongitudeDeg = leLongitudeDeg;
        return this;
    }

    public RunwayBuilder leElevationFt(Integer leElevationFt) {
        this.leElevationFt = leElevationFt;
        return this;
    }

    public RunwayBuilder leHeadingDegT(BigDecimal leHeadingDegT) {
        this.leHeadingDegT = leHeadingDegT;
        return this;
    }

    public RunwayBuilder leDisplacedThresholdFt(Integer leDisplacedThresholdFt) {
        this.leDisplacedThresholdFt = leDisplacedThresholdFt;
        return this;
    }

    public RunwayBuilder heIdent(String heIdent) {
        this.heIdent = heIdent;
        return this;
    }

    public RunwayBuilder heLatitudeDeg(BigDecimal heLatitudeDeg) {
        this.heLatitudeDeg = heLatitudeDeg;
        return this;
    }

    public RunwayBuilder heLongitudeDeg(BigDecimal heLongitudeDeg) {
        this.heLongitudeDeg = heLongitudeDeg;
        return this;
    }

    public RunwayBuilder heElevationFt(Integer heElevationFt) {
        this.heElevationFt = heElevationFt;
        return this;
    }

    public RunwayBuilder heHeadingDegT(BigDecimal heHeadingDegT) {
        this.heHeadingDegT = heHeadingDegT;
        return this;
    }

    public RunwayBuilder heDisplacedThresholdFt(Integer heDisplacedThresholdFt) {
        this.heDisplacedThresholdFt = heDisplacedThresholdFt;
        return this;
    }

    public Runway build() {
        Runway runway = new Runway();
        runway.setAirportRef(airportRef);
        runway.setAirportIdent(airportIdent);
        runway.setId(id);
        runway.setLengthFt(lengthFt);
        runway.setWidthFt(widthFt);
        runway.setSurface(surface);
        runway.setLighted(lighted);
        runway.setClosed(closed);
        runway.setLeIdent(leIdent);
        runway.setLeLatitudeDeg(leLatitudeDeg);
        runway.setLeLongitudeDeg(leLongitudeDeg);
        runway.setLeElevationFt(leElevationFt);
        runway.setLeHeadingDegT(leHeadingDegT);
        runway.setLeDisplacedThresholdFt(leDisplacedThresholdFt);
        runway.setHeIdent(heIdent);
        runway.setHeLatitudeDeg(heLatitudeDeg);
        runway.setHeLongitudeDeg(heLongitudeDeg);
        runway.setHeElevationFt(heElevationFt);
        runway.setHeHeadingDegT(heHeadingDegT);
        runway.setHeDisplacedThresholdFt(heDisplacedThresholdFt);
        return runway;
    }
}
