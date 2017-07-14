package com.vgalloy.riot.api.internal.query.impl.currentgame;

import com.vgalloy.riot.library.api.dto.currentgame.CurrentGameInfo;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
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
