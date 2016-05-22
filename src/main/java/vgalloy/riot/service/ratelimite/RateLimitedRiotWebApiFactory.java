package vgalloy.riot.service.ratelimite;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.client.RiotWebApiFactory;
import vgalloy.riot.service.ratelimite.impl.RateLimitProxy;

import java.lang.reflect.Proxy;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class RateLimitedRiotWebApiFactory {

    private static RateLimitedRiotWebApi rateLimitedRiotWebApi;

    /**
     * Constructor.
     * To prevent instantiation.
     */
    private RateLimitedRiotWebApiFactory() {

    }

    static {
        RiotWebApi riotWebApi = RiotWebApiFactory.getRiotWebApi();
        RateLimitProxy rateLimitProxy = new RateLimitProxy(riotWebApi);
        rateLimitedRiotWebApi = (RateLimitedRiotWebApi) Proxy.newProxyInstance(
                RateLimitedRiotWebApi.class.getClassLoader(),
                new Class[]{RateLimitedRiotWebApi.class},
                rateLimitProxy);
    }

    public static RiotWebApi getRateLimitedRiotWebApi() {
        return rateLimitedRiotWebApi;
    }
}
