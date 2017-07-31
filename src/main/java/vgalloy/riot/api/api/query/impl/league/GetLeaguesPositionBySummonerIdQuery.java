package vgalloy.riot.api.api.query.impl.league;

import java.util.Set;

import vgalloy.riot.api.api.dto.league.LeagueListDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
 */
public class GetLeaguesPositionBySummonerIdQuery extends AbstractQuery<GetLeaguesPositionBySummonerIdQuery, Set<LeagueListDto>> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetLeaguesPositionBySummonerIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected Set<LeagueListDto> executeWithError() {
        return riotWebApi.getLeaguesBySummonerId(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
