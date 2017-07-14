package com.vgalloy.riot.library.api.query.impl.lolstaticdata;

import java.util.List;

import com.vgalloy.riot.library.api.query.AbstractQuery;
import com.vgalloy.riot.api.internal.client.RiotWebApi;
import com.vgalloy.riot.api.internal.query.DefaultParameter;
import com.vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetVersionListQuery extends AbstractQuery<GetVersionListQuery, List<String>> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetVersionListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected List<String> executeWithError() {
        return riotWebApi.getVersionList(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
