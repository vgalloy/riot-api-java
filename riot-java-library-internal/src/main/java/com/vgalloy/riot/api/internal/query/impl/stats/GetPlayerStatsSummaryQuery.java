package com.vgalloy.riot.api.internal.query.impl.stats;

import com.vgalloy.riot.library.api.dto.stats.PlayerStatsSummaryListDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetPlayerStatsSummaryQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.stats.GetPlayerStatsSummaryQuery, PlayerStatsSummaryListDto> {

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
