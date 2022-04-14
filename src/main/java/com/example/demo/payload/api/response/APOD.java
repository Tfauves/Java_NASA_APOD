package com.example.demo.payload.api.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APOD {
    private String copyright;
    private String date;
    private String explanation;
    private String title;
    private String url;



    public APOD(String copyright, String date, String explanation, String hdurl, String media_type, String service_version, String title, String url) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.title = title;
        this.url = url;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
