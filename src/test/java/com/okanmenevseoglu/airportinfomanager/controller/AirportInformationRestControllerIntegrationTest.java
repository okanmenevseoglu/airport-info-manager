package com.okanmenevseoglu.airportinfomanager.controller;

import com.okanmenevseoglu.airportinfomanager.dto.request.AirportInformationQueryRequest;
import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationQueryResponse;
import com.okanmenevseoglu.airportinfomanager.dto.response.AirportInformationReportResponse;
import com.okanmenevseoglu.airportinfomanager.util.builder.request.AirportInformationQueryRequestBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AirportInformationRestControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void shouldGetAirportInformationReport() {
        ResponseEntity<AirportInformationReportResponse> response = restTemplate.exchange(
                createURLWithPort("/airport-information/report"),
                HttpMethod.GET, null, new ParameterizedTypeReference<AirportInformationReportResponse>() {
                });

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getCountriesWithHighestAirportCount()).hasSize(10);
        assertThat(response.getBody().getCountriesWithLowestAirportCount()).hasSize(10);
        assertThat(response.getBody().getRunwayIdentificationsWithCount()).hasSize(10);
        assertThat(response.getBody().getTypeOfRunwaysByCountry()).hasSize(1383);
    }

    @Test
    public void shouldGetAirportInformationQuery() {
        AirportInformationQueryRequest airportInformationQueryRequest = AirportInformationQueryRequestBuilder.anAirportInformationQueryRequest()
                .countryName("Netherlands")
                .build();

        HttpEntity<AirportInformationQueryRequest> request = new HttpEntity<>(airportInformationQueryRequest);

        ResponseEntity<AirportInformationQueryResponse> response = restTemplate.exchange(
                createURLWithPort("/airport-information/query"),
                HttpMethod.POST, request, new ParameterizedTypeReference<AirportInformationQueryResponse>() {
                });

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getAirportInformationByCountryResponses()).hasSize(101);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}