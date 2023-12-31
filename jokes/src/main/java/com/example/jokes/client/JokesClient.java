package com.example.jokes.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class JokesClient {
    private final RestTemplate restTemplate;
    private final static String URL = "https://api.chucknorris.io/jokes/random";

    public String getRandomJoke(){
        return restTemplate.getForEntity(
                URL,
                String.class
        ).getBody();
    }
}
