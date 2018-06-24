package com.okanmenevseoglu.airportinfomanager.service;

import com.okanmenevseoglu.airportinfomanager.repository.RunwayRepository;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.RunwayIdentificationWithCountResponseConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RunwayServiceTest {

    @Mock
    private RunwayRepository runwayRepository;

    @Mock
    private RunwayIdentificationWithCountResponseConverter runwayIdentificationWithCountResponseConverter;

    @InjectMocks
    private RunwayService runwayService;

    @Test
    public void shouldGetRunwayIdentificationsWithCount() {
        List<Object[]> objects = Arrays.asList(new Object[]{}, new Object[]{});

        when(runwayRepository.getMostCommonRunwayIdentifications()).thenReturn(objects);

        runwayService.getRunwayIdentificationsWithCount();

        verify(runwayIdentificationWithCountResponseConverter).convertToList(objects);
    }
}