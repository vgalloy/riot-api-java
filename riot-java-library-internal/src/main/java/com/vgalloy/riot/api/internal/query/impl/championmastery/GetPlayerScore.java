package com.vgalloy.riot.api.internal.query.impl.championmastery;

import java.util.Objects;

import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetPlayerScore extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.championmastery.GetPlayerScore, Integer> {

    private final long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetPlayerScore(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        this.playerId = playerId;
    }

    @Override
    public Integer execute() {
        return riotWebApi.getPlayerScore(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, getRiotApiKeyValue());
    }
}
