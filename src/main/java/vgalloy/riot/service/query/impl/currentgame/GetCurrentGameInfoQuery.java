package vgalloy.riot.service.query.impl.currentgame;

import vgalloy.riot.api.dto.CurrentGameInfo;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetCurrentGameInfoQuery extends AbstractQuery<CurrentGameInfo> {

    private long summonerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param summonerId       the summoner id
     */
    public GetCurrentGameInfoQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerId) {
        super(riotWebApi, defaultParameter);
        this.summonerId = summonerId;
    }

    @Override
    public CurrentGameInfo execute() {
        return riotWebApi.getCurrentGameInfo(getRegion(), getPlatformId(), String.valueOf(summonerId), getRiotApiKeyValue());
    }
}
