package vgalloy.riot.api.api.query.impl.currentgame;

import vgalloy.riot.api.api.dto.currentgame.CurrentGameInfo;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetCurrentGameInfoQuery extends AbstractQuery<GetCurrentGameInfoQuery, CurrentGameInfo> {

    private final long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetCurrentGameInfoQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    protected CurrentGameInfo executeWithError() {
        return riotWebApi.getCurrentGameInfo(SmallCaseRegion.of(getRegion()), getPlatformId(), summonerId, getRiotApiKeyValue());
    }
}
