package vgalloy.riot.service.query.impl.team;

import java.util.ArrayList;
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
public class GetTeamsByTeamIdsQuery extends AbstractQuery<Map<String, List<TeamDto>>> {

    private final List<Long> teamIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param teamIds          the team ids
     */
    public GetTeamsByTeamIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... teamIds) {
        super(riotWebApi, defaultParameter);
        for (long id : teamIds) {
            this.teamIds.add(id);
        }
    }

    /**
     * Add summoner ids.
     *
     * @param teamIds the team ids
     * @return this
     */
    public GetTeamsByTeamIdsQuery addTeamIds(long... teamIds) {
        for (long id : teamIds) {
            this.teamIds.add(id);
        }
        return this;
    }

    @Override
    public Map<String, List<TeamDto>> execute() {
        return riotWebApi.getTeamsByTeamIds(getRegion(), convert(teamIds), getRiotApiKeyValue());
    }
}
