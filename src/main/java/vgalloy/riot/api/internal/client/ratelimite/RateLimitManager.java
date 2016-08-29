package vgalloy.riot.api.internal.client.ratelimite;

import vgalloy.riot.api.api.model.RateLimit;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 01/06/16.
 */
public interface RateLimitManager {

    /**
     * Get the rate limiter for the given region.
     *
     * @param region the region
     * @return the rateLimiter for the given region
     */
    RateLimiter get(SmallCaseRegion region);

    /**
     * Add a new rate limit for all region.
     *
     * @param rateLimit the rate limit
     * @return this
     */
    RateLimitManager addRateLimit(RateLimit... rateLimit);

    /**
     * Add a new rate limit for one region.
     *
     * @param region    the region
     * @param rateLimit the rate limit
     * @return this
     */
    RateLimitManager addRateLimit(SmallCaseRegion region, RateLimit... rateLimit);
}
