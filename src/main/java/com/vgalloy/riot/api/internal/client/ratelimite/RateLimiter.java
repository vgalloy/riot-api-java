package com.vgalloy.riot.api.internal.client.ratelimite;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface RateLimiter {

    /**
     * Wait until the request can be executed.
     */
    void delay();
}
