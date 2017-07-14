package com.vgalloy.riot.api.api.spi;

import com.vgalloy.riot.api.api.model.RiotApi;
import com.vgalloy.riot.api.api.model.RiotApiKey;
import com.vgalloy.riot.api.api.model.RiotRateLimit;

/**
 * Created by Vincent Galloy on 14/07/17.
 *
 * @author Vincent Galloy
 */
public interface RiotApiBuilder {

    /**
     * Create a Riot api.
     *
     * @param riotApiKey    the riot api key
     * @param riotRateLimit the rate limits
     * @return a new riot api
     */
    RiotApi newRiotApi(RiotApiKey riotApiKey, RiotRateLimit... riotRateLimit);
}
