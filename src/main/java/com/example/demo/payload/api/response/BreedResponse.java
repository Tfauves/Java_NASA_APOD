package com.example.demo.payload.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BreedResponse {
    private List<Dogos> dogs;

    public BreedResponse() {
    }

    public BreedResponse(List<Dogos> dogs) {
        this.dogs = dogs;
    }

    public List<Dogos> getDogs() {
        return dogs;
    }

    public void setArticles(List<Dogos> dogs) {
        this.dogs = dogs;
    }
}
