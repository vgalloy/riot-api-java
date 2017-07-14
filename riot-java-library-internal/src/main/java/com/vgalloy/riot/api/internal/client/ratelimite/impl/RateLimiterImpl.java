package com.vgalloy.riot.api.internal.client.ratelimite.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vgalloy.riot.api.api.model.RiotRateLimit;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimiter;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class RateLimiterImpl implements RateLimiter {

    private static final Logger LOGGER = LoggerFactory.getLogger(RateLimiterImpl.class);

    private final List<RiotRateLimit> riotRateLimitList = new ArrayList<>();
    private List<Long> jobExecutionTimer = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotRateLimitList the list of limit rate to respect
     */
    public RateLimiterImpl(RiotRateLimit... riotRateLimitList) {
        addRateLimit(riotRateLimitList);
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
        return riotRateLimitList.stream()
            .map(this::getSleepingTime)
            .max(Long::compareTo)
            .orElse(0L);
    }

    /**
     * Get the sleeping time for one rate limit.
     *
     * @param riotRateLimit the rate limit
     * @return the sleeping time
     */
    private long getSleepingTime(RiotRateLimit riotRateLimit) {
        long currentTimer = System.currentTimeMillis();
        List<Long> listJobTimer = jobExecutionTimer.stream()
            .filter(p -> currentTimer - riotRateLimit.getTimeInMillis() < p)
            .collect(Collectors.toList());
        if (listJobTimer.size() < riotRateLimit.getNumberOfRequest()) {
            return 0;
        } else {
            return riotRateLimit.getTimeInMillis() - (currentTimer - listJobTimer.get(0));
        }
    }

    /**
     * Add rate limit.
     *
     * @param riotRateLimit the rate limit
     */
    public synchronized void addRateLimit(RiotRateLimit... riotRateLimit) {
        List<RiotRateLimit> riotRateLimits = Arrays.asList(Optional.ofNullable(riotRateLimit).orElse(new RiotRateLimit[0]));
        riotRateLimitList.addAll(riotRateLimits);
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
        if (riotRateLimitList.isEmpty()) {
            return 0;
        } else {
            Collections.sort(riotRateLimitList);
            return riotRateLimitList.get(riotRateLimitList.size() - 1).getTimeInMillis();
        }
    }

    @Override
    public String toString() {
        return "RateLimiterImpl{" +
            "jobExecutionTimer=" + jobExecutionTimer +
            ", riotRateLimitList=" + riotRateLimitList +
            '}';
    }
}
