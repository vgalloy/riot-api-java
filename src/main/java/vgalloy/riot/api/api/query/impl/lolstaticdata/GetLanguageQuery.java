package vgalloy.riot.api.api.query.impl.lolstaticdata;

import java.util.List;

import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetLanguageQuery extends AbstractQuery<GetLanguageQuery, List<String>> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetLanguageQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected List<String> executeWithError() {
        return riotWebApi.getLanguage(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
