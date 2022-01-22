package com.airtrafficcontriolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AirTrafficControlApp {
    public static void main (String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(AirTrafficControlApp.class, args);
    }
}
