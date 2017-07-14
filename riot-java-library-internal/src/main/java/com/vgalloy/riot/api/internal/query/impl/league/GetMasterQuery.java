package com.vgalloy.riot.api.internal.query.impl.league;

import java.util.Objects;

import com.vgalloy.riot.library.api.constant.LeagueQueueType;
import com.vgalloy.riot.library.api.dto.league.LeagueDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetMasterQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.league.GetMasterQuery, LeagueDto> {

    private final LeagueQueueType rankedQueueType;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param rankedQueueType  the queue type
     */
    public GetMasterQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, LeagueQueueType rankedQueueType) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        this.rankedQueueType = Objects.requireNonNull(rankedQueueType, "rankedQueueType can not be null");
    }

    @Override
    public LeagueDto execute() {
        return riotWebApi.getMaster(SmallCaseRegion.of(getRegion()), rankedQueueType, getRiotApiKeyValue());
    }
}
