package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.rest.request.lolstaticdata.dto.SummonerSpellListDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerSpellListQuery extends AbstractQuery<SummonerSpellListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     */
    public GetSummonerSpellListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    protected SummonerSpellListDto executeWithError() {
        return riotWebApi.getSummonerSpellList(getRegion(), getRiotApiKeyValue());
    }
}
