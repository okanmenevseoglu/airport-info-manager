package com.okanmenevseoglu.airportinfomanager.util.builder.model;

import com.okanmenevseoglu.airportinfomanager.model.Country;

public final class CountryBuilder {
    private String code;
    private String name;
    private String continent;
    private String wikipediaLink;
    private Long id;
    private String keywords;

    private CountryBuilder() {
    }

    public static CountryBuilder aCountry() {
        return new CountryBuilder();
    }

    public CountryBuilder code(String code) {
        this.code = code;
        return this;
    }

    public CountryBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CountryBuilder continent(String continent) {
        this.continent = continent;
        return this;
    }

    public CountryBuilder wikipediaLink(String wikipediaLink) {
        this.wikipediaLink = wikipediaLink;
        return this;
    }

    public CountryBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public CountryBuilder keywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    public Country build() {
        Country country = new Country();
        country.setCode(code);
        country.setName(name);
        country.setContinent(continent);
        country.setWikipediaLink(wikipediaLink);
        country.setId(id);
        country.setKeywords(keywords);
        return country;
    }
}
