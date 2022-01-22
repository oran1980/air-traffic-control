package com.airtrafficcontriolapp.domain.aircrafts;

import com.airtrafficcontriolapp.domain.enums.AircraftType;

public class AirCraftA320 extends AirCraft {
    public AirCraftA320 () {
        super(1500, AircraftType.AIRCRAFT_TYPE_A320, 150);
    }
}
