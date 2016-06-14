package vgalloy.riot.api.service.query.impl.championmastery;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.championmastery.dto.ChampionMasteryDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent Galloy on 22/05/16.
 */
public class GetChampionMasteryQuery extends AbstractQuery<GetChampionMasteryQuery, List<ChampionMasteryDto>> {

    private final long playerId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetChampionMasteryQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
    }

    @Override
    protected List<ChampionMasteryDto> executeWithError() {
        return riotWebApi.getChampionMastery(getRegion(), getPlatformId(), playerId, getRiotApiKeyValue());
    }
}
