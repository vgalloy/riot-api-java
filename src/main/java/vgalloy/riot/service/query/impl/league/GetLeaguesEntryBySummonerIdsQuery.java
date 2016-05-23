package vgalloy.riot.service.query.impl.league;

import vgalloy.riot.api.league.dto.LeagueDto;
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
public class GetLeaguesEntryBySummonerIdsQuery extends AbstractQuery<Map<String, List<LeagueDto>>> {

    private List<Long> summonerIds = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerIds      the summoner id
     */
    public GetLeaguesEntryBySummonerIdsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long... summonerIds) {
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
    public GetLeaguesEntryBySummonerIdsQuery addSummonerIds(long... summonerIds) {
        for (long id : summonerIds) {
            this.summonerIds.add(id);
        }
        return this;
    }

    @Override
    public Map<String, List<LeagueDto>> execute() {
        return riotWebApi.getLeaguesEntryBySummonerIds(getRegion(), convert(summonerIds), getRiotApiKeyValue());
    }
}
