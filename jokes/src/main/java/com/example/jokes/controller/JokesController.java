package com.example.jokes.controller;

import com.example.jokes.client.JokesClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/jokes")
@RequiredArgsConstructor
public class JokesController {

    private final JokesClient jokesClient;

    @GetMapping("/random")
    public Map<String, String> getRandomJoke(){
        return Map.of("joke", jokesClient.getRandomJoke());
    }
}
