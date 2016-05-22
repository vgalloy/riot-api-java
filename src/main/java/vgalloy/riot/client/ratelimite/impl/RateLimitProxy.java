package vgalloy.riot.client.ratelimite.impl;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.client.ratelimite.RateLimiter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RateLimitProxy implements InvocationHandler {

    private RateLimiter rateLimiter;
    private RiotWebApi riotWebApi;

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
        return method.invoke(riotWebApi, args);
    }
}