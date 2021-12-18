package com.example.demo.controllers;


import com.example.demo.payload.api.response.Dog;
import com.example.demo.payload.api.response.DogResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/dogs")
public class DogController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${example.demo.dogApiKey}")
    private String apiKey;

    @GetMapping("/category")
    public ResponseEntity<?> getDogs() {
        String uri = "https://api.thedogapi.com/v1/categories";
        DogResponse dog = restTemplate.getForObject(uri, DogResponse.class);

        return ResponseEntity.ok(dog.getDog());
    }
}
