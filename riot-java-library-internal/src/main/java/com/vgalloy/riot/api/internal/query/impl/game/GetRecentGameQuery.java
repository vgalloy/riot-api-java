package com.vgalloy.riot.api.internal.query.impl.game;

import com.vgalloy.riot.library.api.dto.game.RecentGamesDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetRecentGameQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.game.GetRecentGameQuery, RecentGamesDto> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetRecentGameQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        this.summonerId = summonerId;
    }

    @Override
    public RecentGamesDto execute() {
        return riotWebApi.getRecentGame(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
