package vgalloy.riot.client.ratelimite.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.client.ratelimite.RateLimiter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RateLimitProxy implements InvocationHandler {

    private final RateLimiter rateLimiter;
    private final RiotWebApi riotWebApi;

    /**
     * Constructor.
     *
     * @param riotWebApi the riotWebApi to proxy
     * @param rateLimits the rate limits to respect
     */
    public RateLimitProxy(RiotWebApi riotWebApi, RateLimit... rateLimits) {
        this.riotWebApi = riotWebApi;
        rateLimiter = new RateLimiterImpl(rateLimits);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        rateLimiter.delay();
        try {
            return method.invoke(riotWebApi, args);
        } catch (Exception e) {
            Throwable throwable = e.getCause();
            if (throwable != null) {
                throw throwable;
            } else {
                throw e;
            }
        }
    }
}
