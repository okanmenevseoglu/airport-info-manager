package com.okanmenevseoglu.airportinfomanager.service;

import com.okanmenevseoglu.airportinfomanager.dto.response.RunwayIdentificationWithCountResponse;
import com.okanmenevseoglu.airportinfomanager.repository.RunwayRepository;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.RunwayIdentificationWithCountResponseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunwayService {

    private final RunwayRepository runwayRepository;

    private final RunwayIdentificationWithCountResponseConverter runwayIdentificationWithCountResponseConverter;

    @Autowired
    public RunwayService(RunwayRepository runwayRepository, RunwayIdentificationWithCountResponseConverter runwayIdentificationWithCountResponseConverter) {
        this.runwayRepository = runwayRepository;
        this.runwayIdentificationWithCountResponseConverter = runwayIdentificationWithCountResponseConverter;
    }

    List<RunwayIdentificationWithCountResponse> getRunwayIdentificationsWithCount() {
        return runwayIdentificationWithCountResponseConverter.convertToList(runwayRepository.getMostCommonRunwayIdentifications());
    }
}