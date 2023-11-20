package com.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Enables auto-configuration and component scanning
public class SpringtestApplication {

    public static void main(String[] args) {
        // Launches the Spring application
        SpringApplication.run(SpringtestApplication.class, args);
    }

    // You can also define additional Beans or configuration settings here if needed

}