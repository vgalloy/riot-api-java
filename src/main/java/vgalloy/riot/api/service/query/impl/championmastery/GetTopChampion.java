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
public class GetTopChampion extends AbstractQuery<GetTopChampion, List<ChampionMasteryDto>> {

    private final long playerId;
    private int count;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param playerId         the player id
     */
    public GetTopChampion(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long playerId) {
        super(riotWebApi, defaultParameter);
        this.playerId = playerId;
        count = 3;
    }

    @Override
    protected List<ChampionMasteryDto> executeWithError() {
        return riotWebApi.getTopChampion(getRegion(), getPlatformId(), playerId, count, getRiotApiKeyValue());
    }

    /**
     * Set the number of entries to retrieve, defaults to 3.
     *
     * @param count count
     * @return this
     */
    public GetTopChampion count(int count) {
        this.count = count;
        return this;
    }
}
