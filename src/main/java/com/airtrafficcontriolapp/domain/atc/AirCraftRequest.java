package com.airtrafficcontriolapp.domain.atc;

import java.util.UUID;

import com.airtrafficcontriolapp.domain.enums.ATCRequestType;

import lombok.Data;

@Data
public class AirCraftRequest {
    private final String airportId;
    private final String airCraftId;
    private final ATCRequestType atcRequestType;
    private final String correlationId;

    public AirCraftRequest (String airportId, String airCraftId, ATCRequestType atcRequestType) {
        this.airportId = airportId;
        this.airCraftId = airCraftId;
        this.atcRequestType = atcRequestType;
        this.correlationId = UUID.randomUUID().toString();
    }
}
