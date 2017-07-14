package com.vgalloy.riot.api.internal.client.ratelimite;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vgalloy.riot.library.api.model.RateLimit;
import com.vgalloy.riot.api.internal.client.ratelimite.impl.RateLimiterImpl;
import com.vgalloy.riot.api.internal.service.executor.Executor;
import com.vgalloy.riot.api.internal.service.executor.impl.ExecutorImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public final class RateLimiterTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(RateLimiterTest.class);

    @Test
    public void testMassDelay() {
        genericRateLimiterTest(11, new RateLimit(10, 2000), new RateLimit(5, 1000));
    }

    @Test
    public void testOneRequestNoTimer() {
        genericRateLimiterTest(1, new RateLimit(1, 0));
    }

    @Test
    public void tesMultiRequestNoTimer() {
        genericRateLimiterTest(5, new RateLimit(1, 0));
    }

    @Test
    public void testOneRequestWithTimer() {
        genericRateLimiterTest(1, new RateLimit(1, 200));
    }

    @Test
    public void testMultiRequestWithTimer() {
        genericRateLimiterTest(4, new RateLimit(1, 200));
    }

    @Test
    public void testOneRequestWithTwoTimer() {
        genericRateLimiterTest(1, new RateLimit(1, 200), new RateLimit(1, 400));
    }

    @Test
    public void testTwoRequestWithTwoTimer() {
        genericRateLimiterTest(2, new RateLimit(1, 200), new RateLimit(1, 400));
    }

    @Test
    public void testMultiRequestWithMultiTimer() {
        genericRateLimiterTest(100, new RateLimit(10, 100), new RateLimit(50, 600), new RateLimit(100, 3600));
    }

    private void genericRateLimiterTest(int requestPoolSize, RateLimit... rateLimits) {
        // GIVEN
        RateLimiter rateLimiter = new RateLimiterImpl(rateLimits);
        Executor executor = new ExecutorImpl();
        AtomicInteger count = new AtomicInteger();
        IntStream.range(0, requestPoolSize)
            .asLongStream()
            .forEach(e -> executor.addTask(createPlusOneThread(rateLimiter, count)));

        // WHEN
        long start = System.currentTimeMillis();
        executor.start();
        executor.finish();
        long end = System.currentTimeMillis();

        // THEN
        LOGGER.debug("requestPoolSize : " + requestPoolSize + " == " + count.get());
        assertEquals(requestPoolSize, count.get());
        for (RateLimit rateLimit : rateLimits) {
            LOGGER.debug("executionTime : " + (end - start) + " > " + rateLimit.getTimeInMillis() * (requestPoolSize / rateLimit.getNumberOfRequest() - 1));
            assertTrue(end - start >= rateLimit.getTimeInMillis() * (requestPoolSize / rateLimit.getNumberOfRequest() - 1));
        }
    }

    private Runnable createPlusOneThread(RateLimiter rateLimiter, AtomicInteger count) {
        return () -> {
            rateLimiter.delay();
            count.incrementAndGet();
        };
    }
}