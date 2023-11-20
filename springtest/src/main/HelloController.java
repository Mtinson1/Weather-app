package com.example.springtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a REST controller
public class HelloController {

    @GetMapping("/hello") // Maps HTTP GET requests onto this method
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        // Responds with a greeting, including the name provided in the request
        return String.format("Hello %s!", name);
    }

    // Future methods for weather-related endpoints can be added here

}