package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.request.lolstaticdata.dto.RuneDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetRuneByIdQuery extends AbstractQuery<RuneDto> {

    private final long runeId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     * @param runeId           the rune id
     */
    public GetRuneByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long runeId) {
        super(riotWebApi, defaultParameter);
        this.runeId = runeId;
    }

    @Override
    public RuneDto executeWithError() {
        return riotWebApi.getRuneById(getRegion(), runeId, getRiotApiKeyValue());
    }
}
