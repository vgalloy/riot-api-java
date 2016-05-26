package vgalloy.riot.api.service.query.impl.stats;

import vgalloy.riot.api.rest.request.stats.dto.PlayerStatsSummaryListDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetPlayerStatsSummaryQuery extends AbstractQuery<PlayerStatsSummaryListDto> {

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
    public PlayerStatsSummaryListDto executeWithError() {
        return riotWebApi.getPlayerStatsSummary(getRegion(), summonerId, getRiotApiKeyValue());
    }
}
