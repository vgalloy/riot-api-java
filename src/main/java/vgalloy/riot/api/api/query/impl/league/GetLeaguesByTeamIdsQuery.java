package vgalloy.riot.api.api.query.impl.league;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import vgalloy.riot.api.api.dto.league.LeagueDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetLeaguesByTeamIdsQuery extends AbstractQuery<GetLeaguesByTeamIdsQuery, Map<String, List<LeagueDto>>> {

    private final Collection<String> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the summoner id
     */
    public GetLeaguesByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, String... teamIds) {
        super(riotWebApi, defaultParameter);
        addTeamIds(teamIds);
    }

    /**
     * Add team ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public GetLeaguesByTeamIdsQuery addTeamIds(String... teamIds) {
        Collections.addAll(this.teamIds, teamIds);
        return this;
    }

    @Override
    protected Map<String, List<LeagueDto>> executeWithError() {
        return riotWebApi.getLeaguesByTeamIds(SmallCaseRegion.of(getRegion()), convert(teamIds), getRiotApiKeyValue());
    }
}
