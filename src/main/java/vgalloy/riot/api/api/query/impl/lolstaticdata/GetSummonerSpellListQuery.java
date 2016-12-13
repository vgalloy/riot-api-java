package vgalloy.riot.api.api.query.impl.lolstaticdata;

import vgalloy.riot.api.api.dto.lolstaticdata.SummonerSpellListDto;
import vgalloy.riot.api.api.query.AbstractQuery;
import vgalloy.riot.api.internal.client.RiotWebApi;
import vgalloy.riot.api.internal.query.DefaultParameter;
import vgalloy.riot.api.internal.rest.dto.SmallCaseRegion;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerSpellListQuery extends AbstractQuery<GetSummonerSpellListQuery, SummonerSpellListDto> {

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
        return riotWebApi.getSummonerSpellList(SmallCaseRegion.of(getRegion()), getRiotApiKeyValue());
    }
}
