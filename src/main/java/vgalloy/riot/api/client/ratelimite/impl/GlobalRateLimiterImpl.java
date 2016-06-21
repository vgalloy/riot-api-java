package vgalloy.riot.api.client.ratelimite.impl;

import vgalloy.riot.api.client.ratelimite.GlobalRateLimiter;
import vgalloy.riot.api.client.ratelimite.RateLimitManager;
import vgalloy.riot.api.rest.annotation.RiotNoLimitRate;
import vgalloy.riot.api.rest.constant.Region;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 01/06/16.
 */
public class GlobalRateLimiterImpl implements GlobalRateLimiter {

    private final RateLimitManager rateLimitManager;

    /**
     * Constructor.
     *
     * @param rateLimitManager the rate limitManager
     */
    public GlobalRateLimiterImpl(RateLimitManager rateLimitManager) {
        this.rateLimitManager = Objects.requireNonNull(rateLimitManager, "rateLimitManager can not be null");
    }

    @Override
    public void delay(Method method, Object[] args) {
        if (method.getDeclaredAnnotation(RiotNoLimitRate.class) == null) {
            Region region = getRegion(method, args);
            rateLimitManager.get(region).delay();
        }
    }

    /**
     * Get the region from the method.
     *
     * @param method the method
     * @param args   the args
     * @return the region of the request
     */
    private Region getRegion(Method method, Object[] args) {
        int index = -1;
        for (int i = 0; i < method.getParameterTypes().length; i++) {
            Class<?> clazz = method.getParameterTypes()[i];
            if (clazz == Region.class) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalStateException("No region provided");
        } else {
            return Region.fromString(args[index].toString());
        }
    }
}
