package vgalloy.riot.api.internal.client.ratelimite;

import java.lang.reflect.Method;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 01/06/16.
 */
public interface GlobalRateLimiter {

    /**
     * Wait until the method can be executed.
     *
     * @param method the method
     * @param args   the args
     */
    void delay(Method method, Object... args);
}
