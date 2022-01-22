package com.airtrafficcontriolapp.domain;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.airtrafficcontriolapp.domain.atc.AirCraftRequest;

import lombok.Data;

@Data
public class Runway {
    private static Logger logger = LoggerFactory.getLogger(Runway.class);

    /**
     * runway unique identifier
     */
    private final String id;

    /**
     * holds the runway length
     */
    private final int length;

    /**
     * indication whether the runway is available
     */
    private boolean isAvailable;

    /**
     * true - in case the runway has been signed as 'closed'
     */
    private boolean isClosed;

    private final List<AirCraftRequest> landingQueue = new ArrayList<>();

    public Runway (String id, int length) {
        this.id = id;
        this.length = length;
    }

    public void closeRunway () {
        logger.info("closing runway [id: {}]...", id);
        this.isClosed = true;
        logger.info("runway [id: {}] is closed.", id);
    }

    public void openRunway () {
        if (!isClosed) {
            logger.info("runway [id: {}] is already opened", id);
        }
        else {
            logger.info("opening runway [id: {}]...", id);
            this.isClosed = false;
            logger.info("runway [id: {}] is now open.", id);
        }
    }

}
