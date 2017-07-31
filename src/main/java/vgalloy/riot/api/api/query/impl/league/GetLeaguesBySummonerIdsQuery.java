package vgalloy.riot.api.api.query.impl.league;

import java.util.Set;

import vgalloy.riot.api.api.dto.league.LeaguePositionDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetLeaguesBySummonerIdsQuery extends AbstractQuery<GetLeaguesBySummonerIdsQuery, Set<LeaguePositionDto>> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetLeaguesBySummonerIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected Set<LeaguePositionDto> executeWithError() {
        return riotWebApi.getLeaguesPositionBySummonerId(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
