package com.vgalloy.riot.api.internal.query.impl.lolstaticdata;

import com.vgalloy.riot.library.api.dto.lolstaticdata.LanguageStringsDto;
import com.vgalloy.riot.api.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetLanguageStringQuery extends AbstractQuery<com.vgalloy.riot.library.api.query.impl.lolstaticdata.GetLanguageStringQuery, LanguageStringsDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetLanguageStringQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        this.riotWebApi = Objects.requireNonNull(riotWebApi);        this.riotApiKey = Objects.requireNonNull(riotApiKey);        this.region = Objects.requireNonNull(region);
    }

    @Override
    public LanguageStringsDto execute() {
        return riotWebApi.getLanguageString(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
