package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.MasteryDto;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;
import vgalloy.riot.api.api.query.AbstractQuery;

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
        return riotWebApi.getMasteryById(SmallCaseRegion.of(getRegion()), masteryId, getRiotApiKeyValue());
    }
}
