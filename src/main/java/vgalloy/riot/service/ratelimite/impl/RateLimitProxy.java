package vgalloy.riot.service.ratelimite.impl;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.ratelimite.RateLimiter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RateLimitProxy implements InvocationHandler {

    private RateLimiter rateLimiter = new RateLimiterImpl();
    private RiotWebApi riotWebApi;

    /**
     * Constructor.
     *
     * @param riotWebApi the riotWebApi to proxy
     */
    public RateLimitProxy(RiotWebApi riotWebApi) {
        this.riotWebApi = riotWebApi;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        rateLimiter.delay();
        return method.invoke(riotWebApi, args);
    }
}
