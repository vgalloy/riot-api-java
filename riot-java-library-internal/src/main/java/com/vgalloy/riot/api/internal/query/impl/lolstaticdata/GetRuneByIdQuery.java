package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.library.api.dto.lolstaticdata.RuneDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetRuneByIdQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetRuneByIdQuery, RuneDto> {

    private final long runeId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param runeId           the rune id
     */
    public GetRuneByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long runeId) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
        this.runeId = runeId;
    }

    @Override
    public RuneDto execute() {
        return riotWebApi.getRuneById(SmallCaseRegion.of(getRegion()), runeId, getRiotApiKeyValue());
    }
}
