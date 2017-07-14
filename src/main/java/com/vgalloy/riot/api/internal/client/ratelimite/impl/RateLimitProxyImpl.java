package com.vgalloy.riot.api.internal.client.ratelimite.impl;

import java.lang.reflect.Method;

import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.client.filter.RiotRateLimitExceededException;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimitManager;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimitProxy;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class RateLimitProxyImpl implements RateLimitProxy {

    private final GlobalRateLimiterImpl globalRateLimiterImpl;
    private final RiotWebApi riotWebApi;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riotWebApi to proxy
     * @param rateLimitManager the rate limit manager
     */
    public RateLimitProxyImpl(RiotWebApi riotWebApi, RateLimitManager rateLimitManager) {
        this.riotWebApi = riotWebApi;
        globalRateLimiterImpl = new GlobalRateLimiterImpl(rateLimitManager);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        globalRateLimiterImpl.delay(method, args);
        try {
            return method.invoke(riotWebApi, args);
        } catch (Exception e) {
            Throwable throwable = e.getCause();
            if (throwable.getCause() instanceof RiotRateLimitExceededException) {
                throw throwable.getCause();
            }
            throw throwable;
        }
    }
}
