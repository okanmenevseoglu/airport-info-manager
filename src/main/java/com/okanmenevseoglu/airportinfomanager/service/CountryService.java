package com.okanmenevseoglu.airportinfomanager.service;

import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationByCountryResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.CountryWithAirportCountResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.TypeOfRunwayByCountryResponse;
import com.okanmenevseoglu.airportinfomanager.repository.CountryRepository;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.AirportInformationByCountryResponseConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.CountryWithAirportCountResponseConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.response.TypeOfRunwayByCountryResponseConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    private final CountryWithAirportCountResponseConverter countryWithAirportCountResponseConverter;

    private final TypeOfRunwayByCountryResponseConverter typeOfRunwayByCountryResponseConverter;

    private final AirportInformationByCountryResponseConverter airportInformationByCountryResponseConverter;

    @Autowired
    public CountryService(CountryRepository countryRepository, CountryWithAirportCountResponseConverter countryWithAirportCountResponseConverter, TypeOfRunwayByCountryResponseConverter typeOfRunwayByCountryResponseConverter, AirportInformationByCountryResponseConverter airportInformationByCountryResponseConverter) {
        this.countryRepository = countryRepository;
        this.countryWithAirportCountResponseConverter = countryWithAirportCountResponseConverter;
        this.typeOfRunwayByCountryResponseConverter = typeOfRunwayByCountryResponseConverter;
        this.airportInformationByCountryResponseConverter = airportInformationByCountryResponseConverter;
    }

    List<TypeOfRunwayByCountryResponse> getTypeOfRunwaysByCountry() {
        return typeOfRunwayByCountryResponseConverter.convertToList(countryRepository.getTypeOfRunwaysByCountryWithSurfaceInfo());
    }

    List<AirportInformationByCountryResponse> getAirportInformationByCountryResponses(String countryCode, String countryName) {
        List<Object[]> airportsAndRunwaysByCountryNameOrCountryCode = countryRepository.getAirportsAndRunwaysByCountryNameOrCountryCode(countryCode, countryName);
        return airportInformationByCountryResponseConverter.convertToList(airportsAndRunwaysByCountryNameOrCountryCode);
    }

    List<CountryWithAirportCountResponse> getCountriesWithHighestNumberOfAirports() {
        List<Object[]> countriesWithHighestAirportCounts = countryRepository.getCountriesWithHighestNumberOfAirports();
        return convertAndGetCountryWithAirportCountResponses(countriesWithHighestAirportCounts);
    }

    List<CountryWithAirportCountResponse> getCountriesWithLowestNumberOfAirports() {
        List<Object[]> countriesWithLowestAirportCounts = countryRepository.getCountriesWithLowestNumberOfAirports();
        return convertAndGetCountryWithAirportCountResponses(countriesWithLowestAirportCounts);
    }

    private List<CountryWithAirportCountResponse> convertAndGetCountryWithAirportCountResponses(List<Object[]> countriesWithAirportCounts) {
        return countryWithAirportCountResponseConverter.convertToList(countriesWithAirportCounts);
    }
}