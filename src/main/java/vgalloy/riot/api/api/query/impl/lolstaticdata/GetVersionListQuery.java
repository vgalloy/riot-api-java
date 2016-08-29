package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

import java.util.List;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
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
