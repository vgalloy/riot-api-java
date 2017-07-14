package com.vgalloy.riot.api.api.factory;

import com.vgalloy.riot.api.api.model.RiotApi;
import com.vgalloy.riot.api.internal.service.RiotApiImpl;

/**
 * Created by Vincent Galloy on 29/08/16.
 *
 * @author Vincent Galloy
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
