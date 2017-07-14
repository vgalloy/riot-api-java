package com.vgalloy.riot.library.api.query.impl.league;

import java.util.List;
import java.util.Map;

import com.vgalloy.riot.library.api.dto.league.LeagueDto;
import com.vgalloy.riot.library.api.query.Query;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetLeaguesEntryBySummonerIdsQuery extends Query<Map<String, List<LeagueDto>>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetLeaguesEntryBySummonerIdsQuery addSummonerIds(long... summonerIds);
}
