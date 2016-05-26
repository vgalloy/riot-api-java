package vgalloy.riot.api.service.query.impl.currentgame;

import vgalloy.riot.api.rest.request.currentgame.dto.CurrentGameInfo;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetCurrentGameInfoQuery extends AbstractQuery<CurrentGameInfo> {

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
        return riotWebApi.getCurrentGameInfo(getRegion(), getPlatformId(), summonerId, getRiotApiKeyValue());
    }
}
