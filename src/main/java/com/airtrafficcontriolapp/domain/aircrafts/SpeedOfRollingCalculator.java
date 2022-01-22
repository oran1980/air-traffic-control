package com.airtrafficcontriolapp.domain.aircrafts;

public interface SpeedOfRollingCalculator {
    default int calcSpeedOfRolling (AirCraft airCraft) {
        int runwayLength = airCraft.minRunwayLength;
        int aircraftRatedSpeedOfRolling = airCraft.ratedRollingSpeed;
        return runwayLength / aircraftRatedSpeedOfRolling;
    }
}
