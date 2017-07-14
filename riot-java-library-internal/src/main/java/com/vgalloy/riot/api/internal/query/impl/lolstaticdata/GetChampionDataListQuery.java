package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.api.api.dto.lolstaticdata.ChampionListDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetChampionDataListQuery extends AbstractQuery<com.vgalloy.riot.api.api.query.impl.lolstaticdata.GetChampionDataListQuery, ChampionListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetChampionDataListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected ChampionListDto executeWithError() {
        return riotWebApi.getChampionDataList(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
