package vgalloy.riot.service.query.impl.lolstaticdata;

import java.util.List;

import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetLanguageQuery extends AbstractQuery<List<String>> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetLanguageQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public List<String> executeWithError() {
        return riotWebApi.getLanguage(getRegion(), getRiotApiKeyValue());
    }
}
