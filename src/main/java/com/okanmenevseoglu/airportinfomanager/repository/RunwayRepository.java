package com.okanmenevseoglu.airportinfomanager.repository;

import com.okanmenevseoglu.airportinfomanager.model.Runway;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RunwayRepository extends BaseJpaRepository<Runway> {

    @Query(value = "SELECT r.le_ident, COUNT(r.le_ident)\n" +
            "FROM runway r\n" +
            "GROUP BY r.le_ident\n" +
            "ORDER BY COUNT(r.le_ident) DESC\n" +
            "LIMIT 10;", nativeQuery = true)
    List<Object[]> getMostCommonRunwayIdentifications();
}