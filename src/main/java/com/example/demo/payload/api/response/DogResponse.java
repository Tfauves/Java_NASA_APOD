package com.example.demo.payload.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DogResponse {
    private List<Breed> breeds;

    public DogResponse() {
    }

    public DogResponse(List<Breed> breeds) {
        this.breeds = breeds;
    }

    public List<Breed> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }
}
