package vgalloy.riot.service.query.impl.team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import vgalloy.riot.api.request.team.dto.TeamDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetTeamsByTeamIdsQuery extends AbstractQuery<Map<String, TeamDto>> {

    private final List<String> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the team ids
     */
    public GetTeamsByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... teamIds) {
        super(riotWebApi, defaultParameter);
        addTeamIds(teamIds);
    }

    /**
     * Add summoner ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public GetTeamsByTeamIdsQuery addTeamIds(String... teamIds) {
        Collections.addAll(this.teamIds, teamIds);
        return this;
    }

    @Override
    public Map<String, TeamDto> executeWithError() {
        return riotWebApi.getTeamsByTeamIds(getRegion(), convert(teamIds), getRiotApiKeyValue());
    }
}
