package vgalloy.riot.api.api.query.impl.stats;

import vgalloy.riot.api.api.dto.stats.RankedStatsDto;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.api.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetRankedStatsQuery extends AbstractQuery<GetRankedStatsQuery, RankedStatsDto> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetRankedStatsQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected RankedStatsDto executeWithError() {
        return riotWebApi.getRankedStats(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
