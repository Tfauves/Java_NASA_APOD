package com.example.demo.payload.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DogResponse {
    private List<Dog> dog;

    public DogResponse() {
    }

    public DogResponse(List<Dog> dog) {
        this.dog = dog;
    }

    public List<Dog> getDog() {
        return dog;
    }

    public void setDog(List<Dog> dog) {
        this.dog = dog;
    }
}
