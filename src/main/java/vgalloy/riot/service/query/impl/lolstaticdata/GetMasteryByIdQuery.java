package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.lolstaticdata.dto.MasteryDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetMasteryByIdQuery extends AbstractQuery<MasteryDto> {

    private final long masteryId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param masteryId        the mastery Id
     */
    public GetMasteryByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long masteryId) {
        super(riotWebApi, defaultParameter);
        this.masteryId = masteryId;
    }

    @Override
    public MasteryDto execute() {
        return riotWebApi.getMasteryById(getRegion(), masteryId, getRiotApiKeyValue());
    }
}
