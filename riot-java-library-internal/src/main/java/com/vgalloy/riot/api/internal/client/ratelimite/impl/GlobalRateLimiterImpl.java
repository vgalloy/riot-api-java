package com.vgalloy.riot.api.internal.client.ratelimite.impl;

import java.lang.reflect.Method;
import java.util.Objects;

import com.vgalloy.riot.api.internal.client.ratelimite.GlobalRateLimiter;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimitManager;
import com.vgalloy.riot.api.internal.rest.annotation.RiotNoLimitRate;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 01/06/16.
 *
 * @author Vincent Galloy
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
    public void delay(Method method, Object... args) {
        if (method.getDeclaredAnnotation(RiotNoLimitRate.class) == null) {
            SmallCaseRegion region = getRegion(method, args);
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
    private SmallCaseRegion getRegion(Method method, Object... args) {
        int index = -1;
        for (int i = 0; i < method.getParameterTypes().length; i++) {
            Class<?> clazz = method.getParameterTypes()[i];
            if (clazz == SmallCaseRegion.class) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalStateException("No region provided");
        } else {
            return SmallCaseRegion.valueOf(args[index].toString());
        }
    }
}
