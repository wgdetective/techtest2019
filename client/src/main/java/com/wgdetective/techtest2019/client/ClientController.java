package com.wgdetective.techtest2019.client;

import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
@Log
public class ClientController {
    private final RestTemplate restTemplate = new RestTemplate();
    private final Random random = new Random();

    @GetMapping("random")
    public String random() {
        final String url = "http://server:8080/testtech/server/calcFibo";
        final String fullUrl = url + "?number=" + random.nextInt(25);
        log.info(fullUrl);
        try {
            final ResponseEntity<Long> responseEntity = restTemplate.getForEntity(fullUrl, Long.TYPE);
            return responseEntity.getStatusCode().getReasonPhrase() + " " + responseEntity.getBody();
        } catch (final RestClientException e) {
            return e.getMessage();
        }

    }
}
