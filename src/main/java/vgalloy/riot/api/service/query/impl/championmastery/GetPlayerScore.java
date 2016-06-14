package vgalloy.riot.api.service.query.impl.championmastery;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetPlayerScore extends AbstractQuery<GetPlayerScore, Integer> {

    private final long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetPlayerScore(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
    }

    @Override
    protected Integer executeWithError() {
        return riotWebApi.getPlayerScore(getRegion(), getPlatformId(), playerId, getRiotApiKeyValue());
    }
}
