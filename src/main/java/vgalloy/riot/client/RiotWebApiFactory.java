package vgalloy.riot.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;
import vgalloy.riot.client.ratelimite.RateLimit;
import vgalloy.riot.client.ratelimite.impl.RateLimitProxy;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.lang.reflect.Proxy;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class RiotWebApiFactory {

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
        ClientConfig cc = new ClientConfig().register(JacksonFeature.class).register(JacksonJsonProvider.class);
        Client client = ClientBuilder.newClient(cc);
        RiotWebApi unsecuredRiotWebApi = WebResourceFactory.newResource(RiotWebApi.class, client.target(""));
        RateLimitProxy rateLimitProxy = new RateLimitProxy(unsecuredRiotWebApi, rateLimits);
        RiotWebApi riotWebApi = (RiotWebApi) Proxy.newProxyInstance(
                RiotWebApi.class.getClassLoader(),
                new Class[]{RiotWebApi.class},
                rateLimitProxy);

        return riotWebApi;
    }
}
