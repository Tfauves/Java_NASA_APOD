package com.example.demo.controllers;

import com.example.demo.payload.api.response.BreedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("/api/dogs")
public class ApiController {
    @Autowired
    RestTemplate restTemplate;

    @Value("${example.demo.dogApiKey}")
    private String apiKey;



    @GetMapping("/dogBreed/{q}")
    public ResponseEntity<?> getDogBreeds(@PathVariable String q) {
        String uri = "https://api.thecatapi.com/v1/breeds/search?q="+ q +"api_key=" + apiKey;

      BreedResponse response = restTemplate.getForObject(uri, BreedResponse.class);

        return ResponseEntity.ok(response.getDogs());
    }
//
//    @GetMapping("/newsCategory/{category}")
//    public ResponseEntity<?> getArticlesByCategory(@PathVariable String category) {
//        String uri = "https://newsapi.org/v2/everything?sortBy=popularity&apiKey=" + apiKey + "&q=" + category;
//
//        NewsResponse response = restTemplate.getForObject(uri, NewsResponse.class);
//
//        return ResponseEntity.ok(response.getArticles());
//    }

}
