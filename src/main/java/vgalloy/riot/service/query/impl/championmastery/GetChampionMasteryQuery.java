package vgalloy.riot.service.query.impl.championmastery;

import vgalloy.riot.api.championmastery.dto.ChampionMasteryDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChampionMasteryQuery extends AbstractQuery<List<ChampionMasteryDto>> {

    private long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetChampionMasteryQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
    }

    @Override
    public List<ChampionMasteryDto> execute() {
        return riotWebApi.getChampionMastery(getRegion(), getPlatformId(), String.valueOf(playerId), getRiotApiKeyValue());
    }
}
