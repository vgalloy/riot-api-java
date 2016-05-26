package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.rest.request.lolstaticdata.dto.RuneDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetRuneByIdQuery extends AbstractQuery<RuneDto> {

    private final long runeId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param runeId           the rune id
     */
    public GetRuneByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long runeId) {
        super(riotWebApi, defaultParameter);
        this.runeId = runeId;
    }

    @Override
    protected RuneDto executeWithError() {
        return riotWebApi.getRuneById(getRegion(), runeId, getRiotApiKeyValue());
    }
}
