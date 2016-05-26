package vgalloy.riot.api.client;

import java.lang.reflect.Proxy;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;

import vgalloy.riot.api.client.ratelimite.RateLimit;
import vgalloy.riot.api.client.ratelimite.impl.RateLimitProxy;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public final class RiotWebApiFactory {

    /**
     * Constructor.
     * To prevent instantiation.
     */
    private RiotWebApiFactory() {

    }

    /**
     * Create a Riot web rest. Be careful each riot rest have is own rate limit.
     *
     * @param rateLimits the rate limits to respect
     * @return a new Riot web rest
     */
    public static RiotWebApi getRiotWebApi(RateLimit... rateLimits) {
        ClientConfig clientConfig = new ClientConfig().register(JacksonFeature.class).register(JacksonJsonProvider.class);
        Client client = ClientBuilder.newClient(clientConfig);
        //client.register(new LoggingFilter());
        RiotWebApi unsecuredRiotWebApi = WebResourceFactory.newResource(RiotWebApi.class, client.target(""));
        RateLimitProxy rateLimitProxy = new RateLimitProxy(unsecuredRiotWebApi, rateLimits);
        return (RiotWebApi) Proxy.newProxyInstance(
                RiotWebApi.class.getClassLoader(),
                new Class[]{RiotWebApi.class},
                rateLimitProxy);
    }
}
