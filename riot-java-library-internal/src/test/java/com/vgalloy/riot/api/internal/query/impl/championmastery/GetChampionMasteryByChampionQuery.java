package com.vgalloy.riot.api.internal.query.impl.championmastery;

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
public class GetChampionMasteryByChampionQuery extends AbstractQuery<GetChampionMasteryByChampionQuery, ChampionMasteryDto> {

    private final long playerId;
    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
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
    protected ChampionMasteryDto executeWithError() {
        return riotWebApi.getChampionMasteryByChampion(SmallCaseRegion.of(getRegion()), getPlatformId(), playerId, championId, getRiotApiKeyValue());
    }
}
