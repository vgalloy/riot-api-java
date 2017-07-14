package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.api.api.dto.lolstaticdata.RuneDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetRuneByIdQuery extends AbstractQuery<com.vgalloy.riot.api.api.query.impl.lolstaticdata.GetRuneByIdQuery, RuneDto> {

    private final long runeId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param runeId           the rune id
     */
    public GetRuneByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long runeId) {
        super(riotWebApi, defaultParameter);
        this.runeId = runeId;
    }

    @Override
    protected RuneDto executeWithError() {
        return riotWebApi.getRuneById(SmallCaseRegion.of(getRegion()), runeId, getRiotApiKeyValue());
    }
}
