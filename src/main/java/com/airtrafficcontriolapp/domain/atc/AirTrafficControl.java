package com.airtrafficcontriolapp.domain.atc;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

import com.airtrafficcontriolapp.domain.AirPort;
import com.airtrafficcontriolapp.domain.Runway;

public class AirTrafficControl {

    private final List<AirPort> airports;
    private Map<String, AirPort> airPortById;

    // assumption, runwayId is unique
    private Map<String, Runway> runwayById;

    public AirTrafficControl (List<AirPort> airports) {
        if (CollectionUtils.isEmpty(airports)) {
            throw new IllegalArgumentException("Airports must not be null or empty");
        }
        this.airports = airports;
        initAirportById();
        initRunwayById();

    }

    private void initAirportById () {
        airPortById = airports.stream().collect(Collectors.toMap(AirPort::getId, Function.identity()));
    }

    private void initRunwayById () {
        airports.forEach(airPort -> {
            List<Runway> runways = airPort.getRunways();
            if (CollectionUtils.isEmpty(runways)) {
                throw new IllegalArgumentException(String.format("Airport [%s] must have at least 1 runway!", airPort.getId()));
            }
            runwayById = runways.stream().collect(Collectors.toMap(Runway::getId, Function.identity()));
        });
    }

    public void addAirPort (final AirPort airPort) {
        this.airports.add(airPort);
        airPortById.putIfAbsent(airPort.getId(), airPort);
    }
}
