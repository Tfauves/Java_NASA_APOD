package com.example.demo.controllers;


import com.example.demo.payload.api.response.APOD;
import com.example.demo.payload.api.response.APODResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/apod")
public class APODController {

@Autowired
    RestTemplate restTemplate;

@Value("${nasaApiKey}")
    private String apiKey;

@GetMapping
    public ResponseEntity<?> nasaApod() {
    String uri = "https://api.nasa.gov/planetary/apod?api_key=" + apiKey;
    APOD apod = restTemplate.getForObject(uri, APOD.class);

    return ResponseEntity.ok(apod);
}
}
