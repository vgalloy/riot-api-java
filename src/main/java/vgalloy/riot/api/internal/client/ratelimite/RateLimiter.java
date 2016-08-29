package vgalloy.riot.api.internal.client.ratelimite;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public interface RateLimiter {

    /**
     * Wait until the request can be executed.
     */
    void delay();
}
