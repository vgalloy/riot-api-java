package com.vgalloy.riot.api.internal.query.impl.league;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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
public class GetLeaguesEntryBySummonerIdsQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.league.GetLeaguesEntryBySummonerIdsQuery, Map<String, List<LeagueDto>>> {

    private final Collection<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner id
     */
    public GetLeaguesEntryBySummonerIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        super(riotWebApi, defaultParameter);
        addSummonerIds(summonerIds);
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public com.vgalloy.riot.library.api.query.impl.league.GetLeaguesEntryBySummonerIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    protected Map<String, List<LeagueDto>> executeWithError() {
        return riotWebApi.getLeaguesEntryBySummonerIds(SmallCaseRegion.of(getRegion()), convert(summonerIds), getRiotApiKeyValue());
    }
}
