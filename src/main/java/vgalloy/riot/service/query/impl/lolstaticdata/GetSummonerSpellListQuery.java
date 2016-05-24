package vgalloy.riot.service.query.impl.lolstaticdata;

import vgalloy.riot.api.request.lolstaticdata.dto.SummonerSpellListDto;
import vgalloy.riot.client.RiotWebApi;
import vgalloy.riot.service.query.AbstractQuery;
import vgalloy.riot.service.query.DefaultParameter;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerSpellListQuery extends AbstractQuery<SummonerSpellListDto> {

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web api for execute query
     * @param defaultParameter the default query parameter
     */
    public GetSummonerSpellListQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter) {
        super(riotWebApi, defaultParameter);
    }

    @Override
    public SummonerSpellListDto execute() {
        return riotWebApi.getSummonerSpellList(getRegion(), getRiotApiKeyValue());
    }
}
