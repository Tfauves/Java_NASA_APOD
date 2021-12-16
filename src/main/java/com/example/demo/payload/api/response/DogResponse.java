package com.example.demo.payload.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DogResponse {
    private Breed breeds;

    public DogResponse() {
    }

    public DogResponse(Breed breeds) {
        this.breeds = breeds;
    }

    public Breed getBreeds() {
        return breeds;
    }

    public void setBreeds(Breed breeds) {
        this.breeds = breeds;
    }
}
