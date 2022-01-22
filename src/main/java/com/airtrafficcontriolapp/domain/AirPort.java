package com.airtrafficcontriolapp.domain;

import java.util.List;

import lombok.Data;

@Data
public class AirPort {
    private final String id;
    private final List<Runway> runways;
    // private Map<String, Runway>

    public AirPort (String id, List<Runway> runways) {
        this.id = id;
        this.runways = runways;
    }
}
