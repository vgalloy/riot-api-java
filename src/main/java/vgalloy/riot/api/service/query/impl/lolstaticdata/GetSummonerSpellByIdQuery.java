package vgalloy.riot.api.service.query.impl.lolstaticdata;

import vgalloy.riot.api.rest.request.lolstaticdata.dto.SummonerSpellDto;
import vgalloy.riot.api.client.RiotWebApi;
import vgalloy.riot.api.service.query.DefaultParameter;
import vgalloy.riot.api.service.query.AbstractQuery;

/**
 * @author Vincent Galloy
 *         Created by Vincent on 23/05/2016.
 */
public class GetSummonerSpellByIdQuery extends AbstractQuery<SummonerSpellDto> {

    private final long summonerSpellId;

    /**
     * Constructor.
     *
     * @param riotWebApi       the riot web rest for execute query
     * @param defaultParameter the default query parameter
     * @param summonerSpellId  the summoner spell id
     */
    public GetSummonerSpellByIdQuery(RiotWebApi riotWebApi, DefaultParameter defaultParameter, long summonerSpellId) {
        super(riotWebApi, defaultParameter);
        this.summonerSpellId = summonerSpellId;
    }

    @Override
    protected SummonerSpellDto executeWithError() {
        return riotWebApi.getSummonerSpellById(getRegion(), summonerSpellId, getRiotApiKeyValue());
    }
}
