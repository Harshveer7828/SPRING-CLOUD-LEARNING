package com.example.web;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NameService {
    private static final String URL = "http://localhost:7070";

    private RestTemplate rest;

    public NameService(RestTemplate rest) {
        this.rest = rest;
    }

    public String getName(){
        return rest.getForObject(URL,String.class);
    }

}
