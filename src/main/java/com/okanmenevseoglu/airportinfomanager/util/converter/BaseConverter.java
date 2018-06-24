package com.okanmenevseoglu.airportinfomanager.util.converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public interface BaseConverter<A, B> extends Function<A, B> {

    default List<B> convertToList(Collection<A> entities) {
        return entities.stream().map(this).collect(toList());
    }
}