package com.vgalloy.riot.api.api.query.impl.team;

import java.util.List;
import java.util.Map;

import com.vgalloy.riot.api.api.dto.team.TeamDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetTeamsBySummonerIdsQuery extends AbstractQuery<GetTeamsBySummonerIdsQuery, Map<String, List<TeamDto>>> {

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    GetTeamsBySummonerIdsQuery addSummonerIds(long... summonerIds);
}
