package com.airtrafficcontriolapp.domain.enums;

import lombok.Getter;

public enum AircraftType {
    AIRCRAFT_TYPE_737("737"), AIRCRAFT_TYPE_A320("A320");

    @Getter
    private final String type;

    AircraftType (String type) {
        this.type = type;
    }
}
