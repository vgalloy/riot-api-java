package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.request.lolstaticdata.dto.MapDataDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMapQuery extends AbstractQuery<MapDataDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetMapQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public MapDataDto executeWithError() {
        return riotWebApi.getMap(getRegion(), getRiotApiKeyValue());
    }
}
