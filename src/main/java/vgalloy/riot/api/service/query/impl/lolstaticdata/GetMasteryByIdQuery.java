package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.rest.request.lolstaticdata.dto.MasteryDto;
import vgalloy.riot.api.service.query.AbstractQuery;
import vgalloy.riot.api.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMasteryByIdQuery extends AbstractQuery<GetMasteryByIdQuery, MasteryDto> {

    private final long masteryId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param masteryId        the mastery Id
     */
    public GetMasteryByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long masteryId) {
        super(riotWebApi, defaultParameter);
        this.masteryId = masteryId;
    }

    @Override
    protected MasteryDto executeWithError() {
        return riotWebApi.getMasteryById(getRegion(), masteryId, getRiotApiKeyValue());
    }
}
