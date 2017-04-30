package vgalloy.riot.api.api.query.impl.team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import vgalloy.riot.api.api.dto.team.TeamDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetTeamsBySummonerIdsQuery extends AbstractQuery<GetTeamsBySummonerIdsQuery, Map<String, List<TeamDto>>> {

    private final Collection<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner ids
     */
    public GetTeamsBySummonerIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        super(riotWebApi, defaultParameter);
        addSummonerIds(summonerIds);
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public GetTeamsBySummonerIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    protected Map<String, List<TeamDto>> executeWithError() {
        return riotWebApi.getTeamsBySummonerIds(SmallCaseRegion.of(getRegion()), convert(summonerIds), getRiotApiKeyValue());
    }
}
