package com.vgalloy.riot.api.internal.client;

import java.util.Objects;

import com.vgalloy.riot.api.internal.service.RiotApiImpl;
import com.vgalloy.riot.library.api.model.RiotApi;
import com.vgalloy.riot.library.api.model.RiotApiKey;
import com.vgalloy.riot.library.api.model.RiotRateLimit;
import com.vgalloy.riot.library.api.spi.RiotApiBuilder;

/**
 * Created by Vincent Galloy on 14/07/17.
 *
 * @author Vincent Galloy
 */
public class RiotApiBuilderImpl implements RiotApiBuilder {

    @Override
    public RiotApi newRiotApi(RiotApiKey riotApiKey, RiotRateLimit... riotRateLimits) {
        Objects.requireNonNull(riotApiKey, "The riot api key can't be null");
        Objects.requireNonNull(riotRateLimits, "Rate limits can't be null");

        return new RiotApiImpl(riotApiKey, riotRateLimits);
    }
}
