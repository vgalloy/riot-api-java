package com.vgalloy.riot.api.internal.query.impl.champion;

import com.vgalloy.riot.api.api.dto.champion.ChampionDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 21/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionByIdQuery extends AbstractQuery<GetChampionByIdQueryImpl, ChampionDto> {

    private final long championId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param championId       the champion id
     */
    public GetChampionByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long championId) {
        super(riotWebApi, defaultParameter);
        this.championId = championId;
    }

    @Override
    protected ChampionDto executeWithError() {
        return riotWebApi.getChampionById(SmallCaseRegion.of(getRegion()), championId, getRiotApiKeyValue());
    }
}
