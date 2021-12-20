package com.example.demo.payload.api.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APODResponse {
    private APOD apod;

    public APODResponse() {}

    public APODResponse(APOD apod) {
        this.apod = apod;
    }

    public APOD getApod() {
        return apod;
    }

    public void setApod(APOD apod) {
        this.apod = apod;
    }
}
