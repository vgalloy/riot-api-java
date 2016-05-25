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
public class GetLeaguesBySummonerIdsQuery extends AbstractQuery<Map<String, List<LeagueDto>>> {

    private final List<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner id
     */
    public GetLeaguesBySummonerIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
        super(riotWebApi, defaultParameter);
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
    }

    /**
     * Add summoner ids.
     *
     * @param summonerIds the summoner ids
     * @return this
     */
    public GetLeaguesBySummonerIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    public Map<String, List<LeagueDto>> executeWithError() {
        return riotWebApi.getLeaguesBySummonerIds(getRegion(), convert(summonerIds), getRiotApiKeyValue());
    }
}
