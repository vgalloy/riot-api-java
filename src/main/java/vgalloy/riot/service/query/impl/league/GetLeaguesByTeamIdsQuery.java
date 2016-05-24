package vgalloy.riot.service.query.impl.league;

import vgalloy.riot.api.request.league.dto.LeagueDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetLeaguesByTeamIdsQuery extends AbstractQuery<Map<String, List<LeagueDto>>> {

    private final List<Long> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the summoner id
     */
    public GetLeaguesByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... teamIds) {
        super(riotWebApi, defaultParameter);
        for (long id : teamIds) {
            this.teamIds.add(id);
        }
    }

    /**
     * Add team ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public GetLeaguesByTeamIdsQuery addTeamIds(long... teamIds) {
        for (long id : teamIds) {
            this.teamIds.add(id);
        }
        return this;
    }

    @Override
    public Map<String, List<LeagueDto>> execute() {
        return riotWebApi.getLeaguesByTeamIds(getRegion(), convert(teamIds), getRiotApiKeyValue());
    }
}
