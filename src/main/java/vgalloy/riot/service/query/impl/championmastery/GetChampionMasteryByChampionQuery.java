package vgalloy.riot.service.query.impl.championmastery;

import vgalloy.riot.api.request.championmastery.dto.ChampionMasteryDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChampionMasteryByChampionQuery extends AbstractQuery<ChampionMasteryDto> {

    private final long playerId;
    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     * @param championId       the champion id
     */
    public GetChampionMasteryByChampionQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId, long championId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
        this.championId = championId;
    }

    @Override
    public ChampionMasteryDto executeWithError() {
        return riotWebApi.getChampionMasteryByChampion(getRegion(), getPlatformId(), playerId, championId, getRiotApiKeyValue());
    }
}
