package com.vgalloy.riot.api.internal.query.impl.team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.vgalloy.riot.library.api.dto.team.TeamDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetTeamsByTeamIdsQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.team.GetTeamsByTeamIdsQuery, Map<String, TeamDto>> {

    private final List<String> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the team ids
     */
    public GetTeamsByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... teamIds) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        addTeamIds(teamIds);
    }

    /**
     * Add summoner ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public com.vgalloy.riot.library.api.query.impl.team.GetTeamsByTeamIdsQuery addTeamIds(String... teamIds) {
        Collections.addAll(this.teamIds, teamIds);
        return this;
    }

    @Override
    public Map<String, TeamDto> execute() {
        return riotWebApi.getTeamsByTeamIds(SmallCaseRegion.of(getRegion()), convert(teamIds), getRiotApiKeyValue());
    }
}
