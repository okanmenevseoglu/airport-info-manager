package com.okanmenevseoglu.airportinfomanager.config;

import com.okanmenevseoglu.airportinfomanager.repository.AirportRepository;
import com.okanmenevseoglu.airportinfomanager.repository.CountryRepository;
import com.okanmenevseoglu.airportinfomanager.repository.RunwayRepository;
import com.okanmenevseoglu.airportinfomanager.util.converter.model.AirportConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.model.CountryConverter;
import com.okanmenevseoglu.airportinfomanager.util.converter.model.RunwayConverter;
import com.univocity.parsers.common.processor.RowListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataLoader.class);

    private final CountryRepository countryRepository;

    private final AirportRepository airportRepository;

    private final RunwayRepository runwayRepository;

    private final CountryConverter countryConverter;

    private final AirportConverter airportConverter;

    private final RunwayConverter runwayConverter;

    @Autowired
    public DataLoader(CountryRepository countryRepository, AirportRepository airportRepository, RunwayRepository runwayRepository, CountryConverter countryConverter, AirportConverter airportConverter, RunwayConverter runwayConverter) {
        this.countryRepository = countryRepository;
        this.airportRepository = airportRepository;
        this.runwayRepository = runwayRepository;
        this.countryConverter = countryConverter;
        this.airportConverter = airportConverter;
        this.runwayConverter = runwayConverter;
    }

    public void run(ApplicationArguments args) {
        try {
            CsvParserSettings parserSettings = new CsvParserSettings();
            parserSettings.setLineSeparatorDetectionEnabled(true);

            RowListProcessor rowListProcessor = new RowListProcessor();
            parserSettings.setProcessor(rowListProcessor);
            parserSettings.setHeaderExtractionEnabled(true);

            CsvParser parser = new CsvParser(parserSettings);

            Long countryCount = countryRepository.count();
            if (countryCount == 0) {
                List<String[]> countriesFromCSV = parser.parseAll(getReader("/csv/countries.csv"));
                LOGGER.info("Saving Countries...");
                System.out.println("Saving Countries...");
                countryRepository.saveAll(countryConverter.convertToList(countriesFromCSV));
            }

            Long airportsCount = airportRepository.count();
            if (airportsCount == 0) {
                List<String[]> airportsFromCSV = parser.parseAll(getReader("/csv/airports.csv"));
                LOGGER.info("Saving Airports...");
                System.out.println("Saving Airports...");
                airportRepository.saveAll(airportConverter.convertToList(airportsFromCSV));
            }

            Long runwayCount = runwayRepository.count();
            if (runwayCount == 0) {
                List<String[]> runwaysFromCSV = parser.parseAll(getReader("/csv/runways.csv"));
                LOGGER.info("Saving Runways...");
                System.out.println("Saving Runways...");
                runwayRepository.saveAll(runwayConverter.convertToList(runwaysFromCSV));
            }

            LOGGER.info("Saving Done!");
            System.out.println("Saving Done!...");

        } catch (Exception e) {
            LOGGER.error("Error occurred during data loading!", e);
        }
    }

    private Reader getReader(String relativePath) throws UnsupportedEncodingException {
        return new InputStreamReader(this.getClass().getResourceAsStream(relativePath), "UTF-8");
    }
}