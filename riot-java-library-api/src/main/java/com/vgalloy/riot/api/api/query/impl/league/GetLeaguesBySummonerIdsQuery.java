package com.vgalloy.riot.api.api.query.impl.league;

import java.util.List;
import java.util.Map;

import com.vgalloy.riot.api.api.dto.league.LeagueDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetLeaguesBySummonerIdsQuery extends AbstractQuery<GetLeaguesBySummonerIdsQuery, Map<String, List<LeagueDto>>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetLeaguesBySummonerIdsQuery addSummonerIds(long... summonerIds);
}
