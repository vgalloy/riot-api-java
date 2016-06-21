package vgalloy.riot.api.client.ratelimite.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import vgalloy.riot.api.client.ratelimite.RateLimitManager;
import vgalloy.riot.api.client.ratelimite.RateLimiter;
import vgalloy.riot.api.client.ratelimite.model.RateLimit;
import vgalloy.riot.api.rest.constant.Region;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 01/06/16.
 */
public class RateLimitManagerImpl implements RateLimitManager {

    private final Map<Region, RateLimiter> rateLimiterMap;

    /**
     * Constructor.
     */
    public RateLimitManagerImpl() {
        rateLimiterMap = new HashMap<>();
        for (Region region : Region.values()) {
            rateLimiterMap.put(region, new RateLimiterImpl());
        }
    }

    @Override
    public RateLimiter get(Region region) {
        return rateLimiterMap.get(region);
    }

    @Override
    public RateLimitManager addRateLimit(RateLimit... rateLimit) {
        rateLimiterMap.entrySet().stream()
                .map(Entry::getValue)
                .map(RateLimiterImpl.class::cast)
                .forEach(e -> e.addRateLimit(rateLimit));
        return this;
    }

    @Override
    public RateLimitManager addRateLimit(Region region, RateLimit... rateLimit) {
        ((RateLimiterImpl) rateLimiterMap.get(region)).addRateLimit(rateLimit);
        return this;
    }
}
