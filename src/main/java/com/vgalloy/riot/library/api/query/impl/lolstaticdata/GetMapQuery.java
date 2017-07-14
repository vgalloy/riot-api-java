package com.vgalloy.riot.library.api.query.impl.lolstaticdata;

import com.vgalloy.riot.library.api.dto.lolstaticdata.MapDataDto;
import com.vgalloy.riot.library.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetMapQuery extends AbstractQuery<GetMapQuery, MapDataDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetMapQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected MapDataDto executeWithError() {
        return riotWebApi.getMap(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
