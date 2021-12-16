package com.example.demo.payload.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Breed {
    private class Source {
        private String id;
        private String name;

        public Source() {}

        public Source(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private Source source;
    private String name ;
    private String breed_group;
    private String life_span;

    public Breed() {}

    public Breed(Source source, String name, String breed_group, String life_span) {
        this.source = source;
        this.name = name;
        this.breed_group = breed_group;
        this.life_span = life_span;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed_group() {
        return breed_group;
    }

    public void setBreed_group(String breed_group) {
        this.breed_group = breed_group;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }
}
