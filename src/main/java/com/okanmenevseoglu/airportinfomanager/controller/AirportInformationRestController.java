package com.okanmenevseoglu.airportinfomanager.controller;

import com.okanmenevseoglu.airportinfomanager.dto.request.AirportInformationQueryRequest;
import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationQueryResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationReportResponse;
import com.okanmenevseoglu.airportinfomanager.service.AirportInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("airport-information")
@RestController
public class AirportInformationRestController {

    private final AirportInformationService airportInformationService;

    @Autowired
    public AirportInformationRestController(AirportInformationService airportInformationService) {
        this.airportInformationService = airportInformationService;
    }

    @GetMapping("report")
    public AirportInformationReportResponse getAirportInformationReport() {
        return airportInformationService.getAirportInformationReport();
    }

    @PostMapping("query")
    public AirportInformationQueryResponse getAirportInformationQuery(@RequestBody AirportInformationQueryRequest airportInformationQueryRequest) {
        return airportInformationService.getAirportInformationQuery(airportInformationQueryRequest);
    }
}