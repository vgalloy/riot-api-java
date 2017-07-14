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
public interface GetLeaguesByTeamIdsQuery extends AbstractQuery<GetLeaguesByTeamIdsQuery, Map<String, List<LeagueDto>>> {

    /**
     * Add team ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    GetLeaguesByTeamIdsQuery addTeamIds(String... teamIds);
}
