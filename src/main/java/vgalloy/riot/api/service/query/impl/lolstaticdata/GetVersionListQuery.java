package vgalloy.riot.api.service.query.impl.lolstaticdata;

import java.util.List;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetVersionListQuery extends AbstractQuery<List<String>> {

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
    public List<String> executeWithError() {
        return riotWebApi.getVersionList(getRegion(), getRiotApiKeyValue());
    }
}
