package com.vgalloy.riot.api.internal.client.ratelimite.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vgalloy.riot.api.api.model.RateLimit;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimiter;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class RateLimiterImpl implements RateLimiter {

    private static final Logger LOGGER = LoggerFactory.getLogger(RateLimiterImpl.class);

    private final List<RateLimit> rateLimitList = new ArrayList<>();
    private List<Long> jobExecutionTimer = new ArrayList<>();

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
        long sleepingTime = getSleepingTime();
        if (sleepingTime != 0) {
            try {
                LOGGER.trace("Delaying task ...");
                Thread.sleep(sleepingTime);
            } catch (InterruptedException e) {
                LOGGER.error("{}", e);
            }
        }
        LOGGER.trace("Task Ok for execution");
        jobExecutionTimer.add(System.currentTimeMillis());
    }

    /**
     * Get the time to wait for the next request.
     *
     * @return the sleeping time
     */
    private long getSleepingTime() {
        cleanList();
        return rateLimitList.stream()
            .map(this::getSleepingTime)
            .max(Long::compareTo)
            .orElse(0L);
    }

    /**
     * Get the sleeping time for one rate limit.
     *
     * @param rateLimit the rate limit
     * @return the sleeping time
     */
    private long getSleepingTime(RateLimit rateLimit) {
        long currentTimer = System.currentTimeMillis();
        List<Long> listJobTimer = jobExecutionTimer.stream()
            .filter(p -> currentTimer - rateLimit.getTimeInMillis() < p)
            .collect(Collectors.toList());
        if (listJobTimer.size() < rateLimit.getNumberOfRequest()) {
            return 0;
        } else {
            return rateLimit.getTimeInMillis() - (currentTimer - listJobTimer.get(0));
        }
    }

    /**
     * Add rate limit.
     *
     * @param rateLimit the rate limit
     */
    public synchronized void addRateLimit(RateLimit... rateLimit) {
        List<RateLimit> rateLimits = Arrays.asList(Optional.ofNullable(rateLimit).orElse(new RateLimit[0]));
        rateLimitList.addAll(rateLimits);
    }

    /**
     * Remove all entry in the jobExecutionTimer which are useless.
     */
    private void cleanList() {
        long currentTimer = System.currentTimeMillis();
        jobExecutionTimer = jobExecutionTimer.stream()
            .filter(p -> currentTimer - getTheLongestRateLimitDuration() < p)
            .collect(Collectors.toList());
    }

    /**
     * Get the longest rate limit duration. This allow us to clean the jobExecutionTimer and save memory / time.
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
            "jobExecutionTimer=" + jobExecutionTimer +
            ", rateLimitList=" + rateLimitList +
            '}';
    }
}
