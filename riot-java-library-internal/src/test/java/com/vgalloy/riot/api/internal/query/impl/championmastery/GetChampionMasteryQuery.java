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
        return riotWebApi.getChampionMastery(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, getRiotApiKeyValue());
    }
}
