package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.library.api.dto.lolstaticdata.ChampionDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionDataByIdQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetChampionDataByIdQuery, ChampionDto> {

    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param championId       the champion Id
     */
    public GetChampionDataByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long championId) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        this.championId = championId;
    }

    @Override
    public ChampionDto execute() {
        return riotWebApi.getChampionDataById(SmallCaseRegion.of(getRegion()), championId, getRiotApiKeyValue());
    }
}
