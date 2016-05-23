package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.lolstaticdata.dto.LanguageStringsDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetLanguageStringQuery extends AbstractQuery<LanguageStringsDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetLanguageStringQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public LanguageStringsDto execute() {
        return riotWebApi.getLanguageString(getRegion(), getRiotApiKeyValue());
    }
}
