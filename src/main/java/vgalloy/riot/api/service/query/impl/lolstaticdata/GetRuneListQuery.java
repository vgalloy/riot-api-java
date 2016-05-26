package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.rest.request.lolstaticdata.dto.RuneListDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetRuneListQuery extends AbstractQuery<RuneListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetRuneListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public RuneListDto executeWithError() {
        return riotWebApi.getRuneList(getRegion(), getRiotApiKeyValue());
    }
}
