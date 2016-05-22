package vgalloy.riot.service.ratelimite.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vgalloy.riot.service.ratelimite.RateLimit;
import vgalloy.riot.service.ratelimite.RateLimiter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RateLimiterImpl implements RateLimiter {

    private static final Logger LOGGER = LoggerFactory.getLogger(RateLimiterImpl.class);

    private final List<RateLimit> rateLimitList;
    private List<Long> jobTimerExecution = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param rateLimitList the list of limit rate to respect
     */
    public RateLimiterImpl(RateLimit... rateLimitList) {
        if (rateLimitList == null) {
            this.rateLimitList = new ArrayList<>();
        } else {
            this.rateLimitList = Arrays.asList(rateLimitList);
        }

        if (this.rateLimitList.isEmpty()) {
            LOGGER.warn("You should define a rate limit");
        }
    }

    @Override
    public synchronized void delay() {
        while (!isOkForRateLimits()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                LOGGER.error("{}", e);
            }
        }
        jobTimerExecution.add(System.currentTimeMillis());
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
        int window = getTheLongestRateLimitDuration();
        long currentTimer = System.currentTimeMillis();
        jobTimerExecution = jobTimerExecution.stream()
                .filter(p -> currentTimer - window < p)
                .collect(Collectors.toList());
    }

    /**
     * Get the longest rate limit duration. This allow us to clean the jobTimerExecution and save memory / time.
     * // TODO  une Rate limit est final, la liste ne peux/doit pas être modifée après sa création ... la valeur de retour est donc toujours la même.
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
