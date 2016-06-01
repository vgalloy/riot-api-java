package vgalloy.riot.api.client.ratelimite;

import vgalloy.riot.api.client.ratelimite.model.RateLimit;
import vgalloy.riot.api.rest.constant.Region;

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
    RateLimiter get(Region region);

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
    RateLimitManager addRateLimit(Region region, RateLimit... rateLimit);
}
