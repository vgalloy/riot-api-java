package com.vgalloy.riot.library.api.query.impl.lolstaticdata;

import com.vgalloy.riot.library.api.dto.lolstaticdata.LanguageStringsDto;
import com.vgalloy.riot.library.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetLanguageStringQuery extends AbstractQuery<GetLanguageStringQuery, LanguageStringsDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetLanguageStringQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected LanguageStringsDto executeWithError() {
        return riotWebApi.getLanguageString(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
