package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.api.api.dto.lolstaticdata.SummonerSpellListDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetSummonerSpellListQuery extends AbstractQuery<com.vgalloy.riot.api.api.query.impl.lolstaticdata.GetSummonerSpellListQuery, SummonerSpellListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetSummonerSpellListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected SummonerSpellListDto executeWithError() {
        return riotWebApi.getSummonerSpellList(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
