package vgalloy.riot.api.api.query.impl.stats;

import vgalloy.riot.api.api.dto.stats.PlayerStatsSummaryListDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetPlayerStatsSummaryQuery extends AbstractQuery<GetPlayerStatsSummaryQuery, PlayerStatsSummaryListDto> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetPlayerStatsSummaryQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected PlayerStatsSummaryListDto executeWithError() {
        return riotWebApi.getPlayerStatsSummary(SmallCaseRegion.of(getRegion()), summonerId, getRiotApiKeyValue());
    }
}
