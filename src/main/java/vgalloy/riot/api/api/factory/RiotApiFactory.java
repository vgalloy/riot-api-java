package vgalloy.riot.api.api.factory;

import vgalloy.riot.api.api.model.RiotApi;
import vgalloy.riot.api.internal.service.RiotApiImpl;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 29/08/16.
 */
public final class RiotApiFactory {

    /**
     * Constructor.
     * To prevent instantiation
     */
    private RiotApiFactory() {
        throw new AssertionError();
    }

    /**
     * Create a Riot api.
     *
     * @return a new riot api
     */
    public static RiotApi newRiotApi() {
        return new RiotApiImpl();
    }
}
