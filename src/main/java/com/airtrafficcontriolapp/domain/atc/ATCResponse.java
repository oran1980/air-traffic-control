package com.airtrafficcontriolapp.domain.atc;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ATCResponse {
    private final String correlationId;
    private String runwayId;
    private LocalDateTime estimatedLandingTime;

    public ATCResponse (String correlationId) {
        this.correlationId = correlationId;
    }
}
