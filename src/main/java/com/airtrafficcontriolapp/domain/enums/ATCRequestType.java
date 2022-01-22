package com.airtrafficcontriolapp.domain.enums;

import lombok.Getter;

public enum ATCRequestType {
    LANDING_REQUEST("Landing request"), CANCEL_LANDING("Cancel landing"), POSITION("Position");

    @Getter
    private final String type;

    ATCRequestType (String type) {
        this.type = type;
    }
}
