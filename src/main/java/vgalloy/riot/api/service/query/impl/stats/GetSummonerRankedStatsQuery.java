package vgalloy.riot.api.service.query.impl.stats;

import vgalloy.riot.api.rest.request.stats.dto.RankedStatsDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerRankedStatsQuery extends AbstractQuery<RankedStatsDto> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetSummonerRankedStatsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected RankedStatsDto executeWithError() {
        return riotWebApi.getSummonerRankedStats(getRegion(), summonerId, getRiotApiKeyValue());
    }
}
