package vgalloy.riot.api.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import vgalloy.riot.api.client.filter.RateLimitFilter;
import vgalloy.riot.api.client.ratelimite.RateLimitManager;
import vgalloy.riot.api.client.ratelimite.RateLimitProxy;
import vgalloy.riot.api.client.ratelimite.impl.RateLimitProxyImpl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.lang.reflect.Proxy;

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
     * Create a Riot web rest.
     *
     * @param rateLimitManager the region rateLimiter
     * @return a new Riot web rest
     */
    public static RiotWebApi getRiotWebApi(RateLimitManager rateLimitManager) {
        Client client = ClientBuilder.newClient()
//                .register(new LoggingFilter())
                .register(RateLimitFilter.class)
                .register(JacksonJsonProvider.class);
        RiotWebApi unsecuredRiotWebApi = WebResourceFactory.newResource(RiotWebApi.class, client.target(""));
        RateLimitProxy rateLimitProxy = new RateLimitProxyImpl(unsecuredRiotWebApi, rateLimitManager);
        return (RiotWebApi) Proxy.newProxyInstance(RiotWebApi.class.getClassLoader(), new Class[]{RiotWebApi.class}, rateLimitProxy);
    }
}
