package vgalloy.riot.service.query.impl.league;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import vgalloy.riot.api.request.league.dto.LeagueDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetLeaguesEntryByTeamIdsQuery extends AbstractQuery<Map<String, List<LeagueDto>>> {

    private final List<String> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the summoner id
     */
    public GetLeaguesEntryByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... teamIds) {
        super(riotWebApi, defaultParameter);
        for (String id : teamIds) {
            this.teamIds.add(id);
        }
    }

    /**
     * Add team ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public GetLeaguesEntryByTeamIdsQuery addTeamIds(String... teamIds) {
        for (String id : teamIds) {
            this.teamIds.add(id);
        }
        return this;
    }

    @Override
    public Map<String, List<LeagueDto>> executeWithError() {
        return riotWebApi.getLeaguesEntryByTeamIds(getRegion(), convert(teamIds), getRiotApiKeyValue());
    }
}
