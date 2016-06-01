package vgalloy.riot.api.client.ratelimite.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vgalloy.riot.api.client.ratelimite.RateLimiter;
import vgalloy.riot.api.client.ratelimite.model.RateLimit;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RateLimiterImpl implements RateLimiter {

    private static final Logger LOGGER = LoggerFactory.getLogger(RateLimiterImpl.class);

    private final List<RateLimit> rateLimitList = new ArrayList<>();
    private List<Long> jobTimerExecution = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param rateLimitList the list of limit rate to respect
     */
    public RateLimiterImpl(RateLimit... rateLimitList) {
        addRateLimit(rateLimitList);
    }

    @Override
    public synchronized void delay() {
        while (!isOkForRateLimits()) {
            try {
                LOGGER.trace("Delaying task ...");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                LOGGER.error("{}", e);
            }
        }
        LOGGER.trace("Task Ok for execution");
        jobTimerExecution.add(System.currentTimeMillis());
    }

    /**
     * Add rate limit.
     *
     * @param rateLimit the rate limit
     */
    public synchronized void addRateLimit(RateLimit... rateLimit) {
        List<RateLimit> rateLimits;
        if (rateLimit == null) {
            rateLimits = new ArrayList<>();
        } else {
            rateLimits = Arrays.asList(rateLimit);
        }
        rateLimitList.addAll(rateLimits);
    }

    /**
     * Are all rate limit ok for sending a new request ?
     *
     * @return true if a new request can be send
     */
    private boolean isOkForRateLimits() {
        cleanList();
        return rateLimitList.stream()
                .map(this::isOkForRateLimit)
                .filter(e -> !e)
                .count() == 0;
    }

    /**
     * Is that rate limit ok for send a new request ?
     *
     * @param rateLimit the rate limit
     * @return true if a new request can be according to this rate limit
     */
    private boolean isOkForRateLimit(RateLimit rateLimit) {
        long currentTimer = System.currentTimeMillis();
        long result = jobTimerExecution.stream()
                .filter(p -> currentTimer - rateLimit.getTimeInMillis() < p)
                .count();
        return result < rateLimit.getNumberOfRequest();
    }

    /**
     * Remove all entry in the jobTimerExecution which are useless.
     */
    private void cleanList() {
        long currentTimer = System.currentTimeMillis();
        jobTimerExecution = jobTimerExecution.stream()
                .filter(p -> currentTimer - getTheLongestRateLimitDuration() < p)
                .collect(Collectors.toList());
    }

    /**
     * Get the longest rate limit duration. This allow us to clean the jobTimerExecution and save memory / time.
     *
     * @return the longest rate limit duration
     */
    private int getTheLongestRateLimitDuration() {
        if (rateLimitList.isEmpty()) {
            return 0;
        } else {
            Collections.sort(rateLimitList);
            return rateLimitList.get(rateLimitList.size() - 1).getTimeInMillis();
        }
    }

    @Override
    public String toString() {
        return "RateLimiterImpl{" +
                "jobTimerExecution=" + jobTimerExecution +
                ", rateLimitList=" + rateLimitList +
                '}';
    }
}
