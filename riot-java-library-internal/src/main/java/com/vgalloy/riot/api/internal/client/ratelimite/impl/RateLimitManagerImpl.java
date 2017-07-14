package com.vgalloy.riot.api.internal.client.ratelimite.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.vgalloy.riot.api.api.model.RiotRateLimit;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimitManager;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimiter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 01/06/16.
 *
 * @author Vincent Galloy
 */
public class RateLimitManagerImpl implements RateLimitManager {

    private final Map<SmallCaseRegion, RateLimiter> rateLimiterMap;

    /**
     * Constructor.
     */
    public RateLimitManagerImpl() {
        rateLimiterMap = new HashMap<>();
        for (SmallCaseRegion region : SmallCaseRegion.values()) {
            rateLimiterMap.put(region, new RateLimiterImpl());
        }
    }

    @Override
    public RateLimiter get(SmallCaseRegion region) {
        return rateLimiterMap.get(region);
    }

    @Override
    public RateLimitManager addRateLimit(RiotRateLimit... riotRateLimit) {
        rateLimiterMap.entrySet().stream()
            .map(Entry::getValue)
            .map(RateLimiterImpl.class::cast)
            .forEach(e -> e.addRateLimit(riotRateLimit));
        return this;
    }

    @Override
    public RateLimitManager addRateLimit(SmallCaseRegion region, RiotRateLimit... riotRateLimit) {
        ((RateLimiterImpl) rateLimiterMap.get(region)).addRateLimit(riotRateLimit);
        return this;
    }
}
