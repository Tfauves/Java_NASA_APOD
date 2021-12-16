package com.example.demo.controllers;


import com.example.demo.payload.api.response.DogResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @Value("${example.demo.dogApiKey}")
    private String apiKey;



    @GetMapping("/breeds")
    public ResponseEntity<?> getAll () {
        String uri = "https://api.thedogapi.com/v1/breeds?api_key=" + apiKey;
        DogResponse response = restTemplate.getForObject(uri,DogResponse.class);

        return ResponseEntity.ok(response.getBreeds());
    }
}
