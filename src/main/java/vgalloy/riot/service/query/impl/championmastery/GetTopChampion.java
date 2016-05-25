package vgalloy.riot.service.query.impl.championmastery;

import java.util.List;

import vgalloy.riot.api.request.championmastery.dto.ChampionMasteryDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetTopChampion extends AbstractQuery<List<ChampionMasteryDto>> {

    private final long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetTopChampion(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
    }

    @Override
    public List<ChampionMasteryDto> executeWithError() {
        return riotWebApi.getTopChampion(getRegion(), getPlatformId(), playerId, getRiotApiKeyValue());
    }
}
