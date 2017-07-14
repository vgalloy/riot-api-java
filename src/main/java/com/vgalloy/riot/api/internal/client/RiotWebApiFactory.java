package com.vgalloy.riot.api.internal.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.client.proxy.WebResourceFactory;

import com.vgalloy.riot.api.internal.client.filter.CustomJacksonFilter;
import com.vgalloy.riot.api.internal.client.filter.RateLimitFilter;
import com.vgalloy.riot.api.internal.client.ratelimite.RateLimitManager;
import com.vgalloy.riot.api.internal.client.ratelimite.impl.RateLimitProxyImpl;

/**
 * Created by Vincent Galloy on 19/05/16.
 *
 * @author Vincent Galloy
 */
public final class RiotWebApiFactory {

    /**
     * Constructor.
     * To prevent instantiation.
     */
    private RiotWebApiFactory() {
        throw new AssertionError();
    }

    /**
     * Create a Riot web rest.
     *
     * @param rateLimitManager the region rateLimiter
     * @return a new Riot web rest
     */
    public static RiotWebApi getRiotWebApi(RateLimitManager rateLimitManager) {
        Client client = ClientBuilder.newClient()
            //            .register(new LoggingFeature())
            .register(RateLimitFilter.class)
            .register(JacksonJsonProvider.class)
            .register(CustomJacksonFilter.class);
        RiotWebApi unsecuredRiotWebApi = WebResourceFactory.newResource(RiotWebApi.class, client.target(""));
        InvocationHandler rateLimitProxy = new RateLimitProxyImpl(unsecuredRiotWebApi, rateLimitManager);
        return (RiotWebApi) Proxy.newProxyInstance(RiotWebApi.class.getClassLoader(), new Class[]{RiotWebApi.class}, rateLimitProxy);
    }
}
