package com.okanmenevseoglu.airportinfomanager.repository;

import com.okanmenevseoglu.airportinfomanager.model.Country;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends BaseJpaRepository<Country> {

    @Query(value = "SELECT c.name, COUNT(a.iso_country) " +
            "FROM country c " +
            "LEFT JOIN airport a " +
            "ON a.iso_country = c.code " +
            "GROUP BY c.name, a.iso_country " +
            "ORDER BY COUNT(a.iso_country) DESC " +
            "LIMIT 10;", nativeQuery = true)
    List<Object[]> getCountriesWithHighestNumberOfAirports();

    @Query(value = "SELECT c.name, COUNT(a.iso_country) " +
            "FROM country c " +
            "LEFT JOIN airport a " +
            "ON a.iso_country = c.code " +
            "GROUP BY c.name, a.iso_country " +
            "ORDER BY COUNT(a.iso_country) " +
            "LIMIT 10;", nativeQuery = true)
    List<Object[]> getCountriesWithLowestNumberOfAirports();

    @Query(value = "SELECT c.name, r.surface " +
            "FROM country c " +
            "LEFT JOIN airport a " +
            "ON a.iso_country = c.code " +
            "LEFT JOIN runway r " +
            "ON a.id = r.airport_ref " +
            "WHERE r.surface IS NOT NULL " +
            "GROUP BY c.name, r.surface " +
            "ORDER BY c.name, COUNT(r.surface) DESC", nativeQuery = true)
    List<Object[]> getTypeOfRunwaysByCountryWithSurfaceInfo();

    @Query(value = "SELECT c.name as countryName, c.code, a.name as airportName, r.id " +
            "FROM country c " +
            "LEFT JOIN airport a " +
            "ON a.iso_country = c.code " +
            "LEFT JOIN runway r " +
            "ON a.id = r.airport_ref " +
            "WHERE c.code LIKE ?1 OR c.name LIKE ?2 " +
            "ORDER BY c.name;", nativeQuery = true)
    List<Object[]> getAirportsAndRunwaysByCountryNameOrCountryCode(String countryCode, String countryName);
}