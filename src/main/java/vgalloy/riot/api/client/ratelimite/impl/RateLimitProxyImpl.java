package vgalloy.riot.api.client.ratelimite.impl;

import java.lang.reflect.Method;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.client.ratelimite.GlobalRateLimiter;
import vgalloy.riot.api.client.ratelimite.RateLimitManager;
import vgalloy.riot.api.client.ratelimite.RateLimitProxy;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
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
            if (throwable != null) {
                throw throwable;
            } else {
                throw e;
            }
        }
    }

    public GlobalRateLimiter getGlobalRateLimiter() {
        return globalRateLimiterImpl;
    }
}
