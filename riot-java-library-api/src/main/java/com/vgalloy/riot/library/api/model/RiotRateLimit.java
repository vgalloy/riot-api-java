package com.vgalloy.riot.library.api.model;

import java.io.Serializable;

/**
 * Created by Vincent Galloy on 22/05/16.
 * This object represent a limit. The number of request that can be create during a period of time;
 *
 * @author Vincent Galloy
 */
public class RiotRateLimit implements Serializable {

    private static final long serialVersionUID = 905799625632401625L;

    private final int numberOfRequest;
    private final int timeInMillis;

    /**
     * Constructor.
     *
     * @param numberOfRequest the number of request
     * @param timeInMillis    the time in millis
     */
    public RiotRateLimit(int numberOfRequest, int timeInMillis) {
        this.numberOfRequest = numberOfRequest;
        this.timeInMillis = timeInMillis;
    }

    public int getNumberOfRequest() {
        return numberOfRequest;
    }

    public int getTimeInMillis() {
        return timeInMillis;
    }

    @Override
    public String toString() {
        return "RiotRateLimit{" +
            "numberOfRequest=" + numberOfRequest +
            ", timeInMillis=" + timeInMillis +
            '}';
    }
}
