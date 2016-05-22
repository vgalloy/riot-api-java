package vgalloy.riot.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 19/05/16.
 */
public class RiotWebApiFactory {

    private static RiotWebApi riotWebApi;

    static {
        ClientConfig cc = new ClientConfig().register(JacksonFeature.class).register(JacksonJsonProvider.class);
        Client client = ClientBuilder.newClient(cc);
        riotWebApi = WebResourceFactory.newResource(RiotWebApi.class, client.target(""));
    }

    /**
     * Constructor.
     * To prevent instantiation.
     */
    private RiotWebApiFactory() {

    }

    public static RiotWebApi getRiotWebApi() {
        return riotWebApi;
    }
}
