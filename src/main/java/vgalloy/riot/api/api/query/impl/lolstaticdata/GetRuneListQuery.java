package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.RuneListDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * Created by Vincent on 23/05/2016.
 *
 * @author Vincent Galloy
 */
public class GetRuneListQuery extends AbstractQuery<GetRuneListQuery, RuneListDto> {

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
    protected RuneListDto executeWithError() {
        return riotWebApi.getRuneList(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
