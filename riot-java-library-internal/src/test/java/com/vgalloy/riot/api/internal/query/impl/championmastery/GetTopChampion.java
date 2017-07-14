package com.vgalloy.riot.api.internal.query.impl.championmastery;

import java.util.List;

import com.vgalloy.riot.library.api.dto.championmastery.ChampionMasteryDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent Galloy on 22/05/16.
 *
 * @author Vincent Galloy
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
        return riotWebApi.getTopChampion(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, count, getRiotApiKeyValue());
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
