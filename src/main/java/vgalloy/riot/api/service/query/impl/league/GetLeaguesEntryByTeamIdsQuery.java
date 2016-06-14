package vgalloy.riot.api.service.query.impl.league;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.league.dto.LeagueDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetLeaguesEntryByTeamIdsQuery extends AbstractQuery<GetLeaguesEntryByTeamIdsQuery, Map<String, List<LeagueDto>>> {

    private final Collection<String> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the summoner id
     */
    public GetLeaguesEntryByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... teamIds) {
        super(riotWebApi, defaultParameter);
        addTeamIds(teamIds);
    }

    /**
     * Add team ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public GetLeaguesEntryByTeamIdsQuery addTeamIds(String... teamIds) {
        Collections.addAll(this.teamIds, teamIds);
        return this;
    }

    @Override
    protected Map<String, List<LeagueDto>> executeWithError() {
        return riotWebApi.getLeaguesEntryByTeamIds(getRegion(), convert(teamIds), getRiotApiKeyValue());
    }
}
