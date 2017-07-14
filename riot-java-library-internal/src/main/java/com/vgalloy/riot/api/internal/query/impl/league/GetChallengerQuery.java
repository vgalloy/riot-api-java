package com.vgalloy.riot.api.internal.query.impl.league;

import java.util.Objects;

import com.vgalloy.riot.api.api.constant.LeagueQueueType;
import com.vgalloy.riot.api.api.dto.league.LeagueDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetChallengerQuery extends AbstractQuery<com.vgalloy.riot.api.api.query.impl.league.GetChallengerQuery, LeagueDto> {

    private final LeagueQueueType leagueQueueType;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param leagueQueueType  the queue type
     */
    public GetChallengerQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, LeagueQueueType leagueQueueType) {
        super(riotWebApi, defaultParameter);
        this.leagueQueueType = Objects.requireNonNull(leagueQueueType, "leagueQueueType can not be null");
    }

    @Override
    protected LeagueDto executeWithError() {
        return riotWebApi.getChallenger(SmallCaseRegion.of(getRegion()), leagueQueueType, getRiotApiKeyValue());
    }
}
