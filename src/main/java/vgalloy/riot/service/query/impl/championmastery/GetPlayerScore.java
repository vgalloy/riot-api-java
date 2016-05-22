package vgalloy.riot.service.query.impl.championmastery;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 * Created by Vincent Galloy on 22/05/16.
 */
public class GetPlayerScore extends AbstractQuery<Integer> {

    private long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetPlayerScore(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
    }

    @Override
    public Integer execute() {
        return riotWebApi.getPlayerScore(getRegion(), getPlatformId(), String.valueOf(playerId), getRiotApiKeyValue());
    }
}
