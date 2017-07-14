package com.vgalloy.riot.api.api.query.impl.team;

import java.util.Map;

import com.vgalloy.riot.api.api.dto.team.TeamDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public interface GetTeamsByTeamIdsQuery extends AbstractQuery<GetTeamsByTeamIdsQuery, Map<String, TeamDto>> {

    /**
     * Add summoner ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    GetTeamsByTeamIdsQuery addTeamIds(String... teamIds);
}
