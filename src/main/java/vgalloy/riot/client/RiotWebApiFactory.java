package vgalloy.riot.client;

import java.lang.reflect.Proxy;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.client.ratelimite.impl.RateLimitProxy;

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
     * Create a Riot web api. Be careful each riot api have is own rate limit.
     *
     * @param rateLimits the rate limits to respect
     * @return a new Riot web api
     */
    public static RiotWebApi getRiotWebApi(RateLimit... rateLimits) {
        ClientConfig clientConfig = new ClientConfig().register(JacksonFeature.class).register(JacksonJsonProvider.class);
        Client client = ClientBuilder.newClient(clientConfig);
        //        client.register(new LoggingFilter()); // TODO
        RiotWebApi unsecuredRiotWebApi = WebResourceFactory.newResource(RiotWebApi.class, client.target(""));
        RateLimitProxy rateLimitProxy = new RateLimitProxy(unsecuredRiotWebApi, rateLimits);
        return (RiotWebApi) Proxy.newProxyInstance(
                RiotWebApi.class.getClassLoader(),
                new Class[]{RiotWebApi.class},
                rateLimitProxy);
    }
}
