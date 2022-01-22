package com.airtrafficcontriolapp.domain.aircrafts;

import java.util.UUID;

import com.airtrafficcontriolapp.domain.enums.AircraftType;

public abstract class AirCraft implements SpeedOfRollingCalculator {
    protected final int minRunwayLength;
    protected final AircraftType aircraftType;
    protected final String id;
    protected final int ratedRollingSpeed;

    protected AirCraft (int minRunwayLength, AircraftType aircraftType, int ratedRollingSpeed) {
        this.minRunwayLength = minRunwayLength;
        this.aircraftType = aircraftType;
        this.ratedRollingSpeed = ratedRollingSpeed;
        this.id = UUID.randomUUID().toString();
    }

    // protected boolean isAllowLandingOrTakeOff()

}
